package com.example.lagaltbackend.services;

import com.example.lagaltbackend.Model.ProjectApplication;
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

    /**
     * This method saves project application of a particular user
     * @param projectApplication
     */
    public void saveProjectApplication(PostProjectApplication projectApplication){
        projectApplicationRepository.save(mapToProjectApplication(projectApplication));
    }

    /**
     * This method saves review the application by the project owner
     * @param projectApplication
     * @param id
     */
    public void reviewProjectApplication(PutProjectApplication projectApplication, long id){
        projectApplicationRepository.save(mapToProjectApplication(projectApplication, id));
    }


    // This method maps the project application to project application dao
    private ProjectApplication mapToProjectApplication(PostProjectApplication postProj){

        ProjectApplication projApp = ProjectApplication.builder()
                .projectId(postProj.getProjectId())
                .userId(postProj.getUserId())
                .motivation(postProj.getMotivation())
                .build();
        return projApp;
    }
    // This method maps the project application dao to project application
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

    /**
     * This method returns list of project application
     * @return  List<ProjectApplication>
     */
    public List<ProjectApplication> getAllProjectApplications(){
        return projectApplicationRepository.findAll();
    }


    /**
     * This method  returns a paticular project application by its id
     * @param id
     * @return
     */
    public ProjectApplication getProjectApplicationByID(long id){
        return projectApplicationRepository.findById(id).get();
    }


    /**
     * Returns a list of project application by its id
     * @param id
     * @return
     */
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
