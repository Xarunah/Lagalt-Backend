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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class
ProjectService {

    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;
    private final CommentRepository commentRepository;


    /**
     * This method stores a project into the database
     * @param projectDto
     */
    public void createProject(PostProjectDto projectDto){
        projectRepository.save(mapToProject(projectDto));
    }


    /**
     * This method update the project and its progress
     * @param projectDto
     * @param projectId
     */
    public void updateProjectProgress(PutProjectDto projectDto, long projectId){

        Project project = projectRepository.findById(projectId).get();

        project.setProgress(projectDto.getProgress());
        project.setStatus(projectDto.getStatus());

        projectRepository.save(project);

    }

    // This is a mapper method, it maps the projectDto to project
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
    /// This is a mapper method to map project to project dto
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
                .image(project.getImage())
                .build();
        return projectDto;
    }



    private CommentDto mapToCommentDto(Comment comment) {

        CommentDto commentDto = CommentDto.builder()
                .id(comment.getId())
                .message(comment.getMessage())
                .timestamp(comment.getTimestamp())
                .username(comment.getUser().getUsername())
                .projectId(comment.getProject().getProjectId())
                .build();
        return commentDto;
    }

   // @Transactional
    /**
     * This Method add a user to a particular project
     * @param projectId
     * @param userId
     */
    public void joinProject(long projectId, String userId){


        AppUser user=userRepository.findById(userId).get();


        Project project =projectRepository.findById(projectId).get();

        List<AppUser> users=  project.getCollaborators();
        users.add(user);
        project.setCollaborators(users);
        projectRepository.save(project);

    }

    /**
     * This method get all the project in the database
     * @param id
     * @return
     */

    public ProjectDto getProjectById(long id){

        return mapToProject(projectRepository.findById(id).get());
    }

    /**
     * This method get all the projects in the database
     * @return List<ProjectDto>
     */
    public List<ProjectDto> getAllProject() {
        List<Project> projects = projectRepository.findAll();
        List<ProjectDto> projectDtos = projects.stream()
                .map(this::mapToProject)
                .collect(Collectors.toList());
        return projectDtos;
    }


    /**
     * This method post a comment on a particular project
     * @param projectId
     * @param userId
     * @param commentDto
     */
    public void commentOnProject(Long projectId, String userId, PostCommentDto commentDto) {

        Project project =projectRepository.findById(projectId)
                .orElseThrow(()-> new ResponseStatusException
                        (HttpStatus.BAD_REQUEST,"project " + projectId +" not found"));

        AppUser appUser =userRepository.findById(userId)
                .orElseThrow(()-> new ResponseStatusException
                        (HttpStatus.BAD_REQUEST,"project " + projectId +" not found"));

        Comment comment= Comment.builder()
                .message(commentDto.getMessage())
                .timestamp(commentDto.getTimestamp())
                .user(appUser)
                .project(project)
                .build();

        commentRepository.save(comment);

    }

    public List<CommentDto> getCommentsByProjectId(long projectId){

        List<Comment> comments = commentRepository.findAll();

        List<Comment> commentsById = new ArrayList<>();

        for(Comment comment: comments){
            if(comment.getProject().getProjectId() == projectId){
                commentsById.add(comment);
            }
        }
        List<CommentDto> commentDtos = commentsById.stream().map(this::mapToCommentDto).collect(Collectors.toList());;
        return commentDtos;
    }

}
