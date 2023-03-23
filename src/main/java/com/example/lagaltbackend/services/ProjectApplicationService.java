package com.example.lagaltbackend.services;

import com.example.lagaltbackend.Model.Project;
import com.example.lagaltbackend.Model.ProjectApplication;
import com.example.lagaltbackend.Model.AppUser;
import com.example.lagaltbackend.dto.PostProjectApplication;
import com.example.lagaltbackend.dto.PutProjectApplication;
import com.example.lagaltbackend.repository.ProjectApplicationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProjectApplicationService {
    private final ProjectApplicationRepository projectApplicationRepository;

    public void saveProjectApplication(PostProjectApplication projectApplication){
        projectApplicationRepository.save(mapToProjectApplication(projectApplication));
    }

    public void reviewProjectApplication(PutProjectApplication projectApplication, long id){
        projectApplicationRepository.save(mapToProjectApplication(projectApplication, id));
    }

    public ProjectApplication mapToProjectApplication(PostProjectApplication postProj){

        ProjectApplication projApp = ProjectApplication.builder()
                .projectId(postProj.getProjectId())
                .userId(postProj.getUserId())
                .motivation(postProj.getMotivation())
                .build();
        return projApp;
    }

    public ProjectApplication mapToProjectApplication(PutProjectApplication putProj, long id){
        ProjectApplication projApp = ProjectApplication.builder()
                .projectApplicationId(id)
                .projectId(putProj.getProjectId())
                .userId(putProj.getUserId())
                .reviewed(putProj.isReviewed())
                .accepted(putProj.isAccepted())
                .build();
        return projApp;
    }

    public List<ProjectApplication> getAllProjectApplications(){
        return projectApplicationRepository.findAll();
    }

    public ProjectApplication getProjectApplicationByID(long id){
        return projectApplicationRepository.findById(id).get();
    }


    public List<ProjectApplication> getProjectApplicationsByProjectId(long id){

        List<ProjectApplication> applications = projectApplicationRepository.findAll();

        List<ProjectApplication> result = new ArrayList<>();

        for(ProjectApplication application : applications) {
            if (application.getProjectId() == id) {
                result.add(application);
            }
        }
        return result;



    }
}
