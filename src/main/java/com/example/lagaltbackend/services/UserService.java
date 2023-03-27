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


    /**
     *
     * @param userDto
     * Add User profile to the database
     */
    public void addUserProfile(PostUserDto userDto){

        userRepository.save(mapUserToPostDto(userDto));

    }


    /**
     * Updates the user profile
     * @param userDto
     * @param userId
     */
    public void updateUserProfile(PutUserDto userDto, long userId){
        userRepository.save(mapFromPutUserDto(userDto, userId));
    }

    /**
     * Get all the User details in the database
     * @param id
     * @return  UserDto
     */
    public UserDto getUserProfile(Long id) {
        UserDto userDto=mapDtoToUser(  userRepository.findById(id).orElseThrow(() -> new RuntimeException("Cannot find this user "+ id)));
        return userDto;
    }

    /**
     * Get all users from the database
     * @return List<AppUser>
     */
    public List<AppUser> getAllUsers(){

        return userRepository.findAll();
    }


    /**
     * Get a user by its email address
     * @param email
     * @return UserDto
     */
    public UserDto getUserProfileByEmail(String email) {
        List<AppUser> users = userRepository.findAll();

        for (AppUser user : users) {
            if (user.getUserEmail().equals(email)) {
                return mapDtoToUser(user);
            }
        }
        return null;
    }


    /**
     * This method set the User profile visibility
     * They visibility check whether the the user profile should be visible to the public
     * @param id
     */
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

    /// This is a mapper method to map store users profile
    private AppUser mapUserToPostDto(PostUserDto userDto){
        AppUser appUser = AppUser.builder()
                .userEmail(userDto.getUserEmail())
                .username(userDto.getUsername())
                .userPortfolio("")
                .userDescription("")
                .build();
        return appUser;
    }
    /// This is a mapper method to get users profile
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


    /// This is a mapper method to upadate the users profile
    private AppUser mapFromPutUserDto(PutUserDto userDto, long userId){
        AppUser appUser = userRepository.findById(userId).get();

        appUser.setUserDescription(userDto.getUserDescription());
        appUser.setUserPortfolio(userDto.getUserPortfolio());
        appUser.setUserSkill(userDto.getUserSkill());
        appUser.setProfileVisibility(userDto.isUserVisibility());

        return appUser;
    }





}
