package com.example.lagaltbackend.services;
import com.example.lagaltbackend.Model.AppUser;
import com.example.lagaltbackend.Model.Project;
import com.example.lagaltbackend.dto.*;
import com.example.lagaltbackend.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class UserService {


    private final UserRepository userRepository;

  //  private final ProjectRepository projectRepository;

    // this method saves user detdetails
    //The request body is UserDto class
    public void addUserProfile(PostUserDto userDto){

        userRepository.save(mapUserToPostDto(userDto));

    }


    public void updateUserProfile(PutUserDto userDto, long userId){
        userRepository.save(mapFromPutUserDto(userDto, userId));
    }

    public UserDto getUserProfile(Long id) {
        UserDto userDto=mapDtoToUser(  userRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot find this user "+ id)));
        return userDto;
    }

    public List<AppUser> getAllUsers(){

        return userRepository.findAll();
    }

    public UserDto getUserProfileByEmail(String email) {
        List<AppUser> users = userRepository.findAll();

        for (AppUser user : users) {
            if (user.getUserEmail().equals(email)) {
                return mapDtoToUser(user);
            }
        }
        return null;
    }

    public void setNotProfileVisible(Long id) {
        AppUser user = userRepository.findById(id).orElseThrow(() -> new RuntimeException(" id not found"));
        user.setProfileVisibility(false);
    }

    public void setProfileVisible(Long id){
        AppUser user =userRepository.findById(id).orElseThrow(()-> new RuntimeException(" id not found"));
        Boolean isVisible= user.isProfileVisibility();
        if (isVisible) {
            user.setProfileVisibility(false);
        }
        else{
            user.setProfileVisibility(true);
        }
        userRepository.save(user);

    }

    private AppUser mapUserToPostDto(PostUserDto userDto){
        AppUser appUser = AppUser.builder()
                .userEmail(userDto.getUserEmail())
                .username(userDto.getUsername())
                .userPortfolio("")
                .userDescription("")
                .build();
        return appUser;
    }

    private UserDto mapDtoToUser(AppUser appUser){

        UserDto userDto =UserDto.builder()
                .userId(appUser.getUserId())
                .email(appUser.getUserEmail())
                .userDescription(appUser.getUserDescription())
                .userPortfolio(appUser.getUserPortfolio())
                .username(appUser.getUsername())
                .userSkill(appUser.getUserSkill())
                .userVisibility(appUser.isProfileVisibility())
        //        .projects(appUser.getProjects().stream().map(Project::getProjectId).collect(Collectors.toSet()))
                .build();
        return userDto;
    }

    private AppUser mapUserToDto(UserDto userDto){
        AppUser appUser = AppUser.builder()
                .UserId(userDto.getUserId())
                .userEmail(userDto.getEmail())
                .username(userDto.getUsername())
                .userDescription(userDto.getUserDescription())
                .userPortfolio(userDto.getUserPortfolio())
                .userSkill(userDto.getUserSkill())
                .profileVisibility(userDto.isUserVisibility())
                .build();

        return appUser;

    }

    private AppUser mapFromPutUserDto(PutUserDto userDto, long userId){
        AppUser appUser = userRepository.findById(userId).get();

        appUser.setUserDescription(userDto.getUserDescription());
        appUser.setUserPortfolio(userDto.getUserPortfolio());
        appUser.setUserSkill(userDto.getUserSkill());
        appUser.setProfileVisibility(userDto.isUserVisibility());

        return appUser;
    }

   /* public List<ProjectDto> getProjectThatBelongToUser(Long id) {
        AppUser user= userRepository.findById(id).orElseThrow( ()-> new RuntimeException("This in valid user"));

        return user.getProjects().stream().map(project -> ProjectDto.builder()
                .title(project.getTitle())
                .category(project.getCategory())
                .description(project.getDescription())
                .project_is_active(project.isProject_is_active())
                .description(project.getDescription()).build()).collect(Collectors.toList());
    }*/




}
