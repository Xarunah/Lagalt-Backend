package com.example.lagaltbackend.services;

import com.example.lagaltbackend.Model.Comment;
import com.example.lagaltbackend.Model.Project;
import com.example.lagaltbackend.Model.AppUser;
import com.example.lagaltbackend.dto.*;
import com.example.lagaltbackend.repository.CommentRepository;
import com.example.lagaltbackend.repository.ProjectRepository;
import com.example.lagaltbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class
ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;


    public void createProject(PostProjectDto projectDto){
        projectRepository.save(mapToProject(projectDto));
    }


    public void updateProjectProgress(PutProjectDto projectDto, long projectId){

        Project project = projectRepository.findById(projectId).get();

        project.setProgress(projectDto.getProgress());
        project.setStatus(projectDto.getStatus());

        projectRepository.save(project);

    }


    private Project mapToProject(PostProjectDto projectDto) {

        Project project = Project.builder()
                .title(projectDto.getTitle())
                .project_is_active(projectDto.isProject_is_active())
                .category(projectDto.getCategory())
                .shortDescription(projectDto.getShortDescription())
                .description(projectDto.getDescription())
                .skills(projectDto.getSkills())
                .tags(projectDto.getTags())
                .userId(projectDto.getUserId())
                .status(projectDto.getStatus())
                .progress(projectDto.getProgress())
                .collaborators(projectDto.getCollaborators())
                .build();
        return project;
    }

    private ProjectDto mapToProject(Project project) {

        ProjectDto projectDto = ProjectDto.builder()
                .title(project.getTitle())
                .projectId(project.getProjectId())
                .project_is_active(project.isProject_is_active())
                .category(project.getCategory())
                .shortDescription(project.getShortDescription())
                .description(project.getDescription())
                .collaborators(project.getCollaborators().stream().map(AppUser::getUserId).collect(Collectors.toSet()))
                .status(project.getStatus())
                .progress(project.getProgress())
                .skills(project.getSkills())
                .tags(project.getTags())
                .userId(project.getUserId())
                .build();
        return projectDto;
    }

   // @Transactional
    public void joinProject(long projectId, long userId){


        AppUser user=userRepository.findById(userId).get();
              //  .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"User "+userId+"not found"));

        Project project =projectRepository.findById(projectId).get();

              //  .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"project id not found"));

        List<AppUser> users=  project.getCollaborators();
        users.add(user);
        project.setCollaborators(users);
        projectRepository.save(project);

    }

    public ProjectDto getProjectById(long id){

        return mapToProject(projectRepository.findById(id).get());
    }

    public List<ProjectDto> getAllProject() {
        List<Project> projects = projectRepository.findAll();
        List<ProjectDto> projectDtos = projects.stream()
                .map(p -> mapToProject(p))
                .collect(Collectors.toList());
        return projectDtos;
    }

    public void commentOnProject(Long projectId, Long userId, CommentDto commentDto) {

        Project project =projectRepository.findById(projectId)
                .orElseThrow(()-> new ResponseStatusException
                        (HttpStatus.BAD_REQUEST,"project " + projectId +" not found"));

        AppUser appUser =userRepository.findById(userId)
                .orElseThrow(()-> new ResponseStatusException
                        (HttpStatus.BAD_REQUEST,"project " + projectId +" not found"));

        Comment comment= Comment.builder()
                .message(commentDto.getMessage())
                .UserId(appUser.getUserId())
                .project(project)
                .build();

        commentRepository.save(comment);

    }
}
