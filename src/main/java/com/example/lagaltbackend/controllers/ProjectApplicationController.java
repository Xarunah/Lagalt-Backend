package com.example.lagaltbackend.controllers;

import com.example.lagaltbackend.Model.ProjectApplication;
import com.example.lagaltbackend.Model.Response;
import com.example.lagaltbackend.dto.PostProjectApplication;
import com.example.lagaltbackend.dto.ProjectDto;
import com.example.lagaltbackend.dto.PutProjectApplication;
import com.example.lagaltbackend.services.ProjectApplicationService;
import com.example.lagaltbackend.services.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/projectApplication/")
@AllArgsConstructor
public class ProjectApplicationController {

    private final ProjectApplicationService projectApplicationService;

    private final ProjectService projectService;


    /**
     *
     * @return list of project application by users
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping("")
    public ResponseEntity<List<ProjectApplication>> getAllProjectApplications(){
        List<ProjectApplication> projectApplicationList = projectApplicationService.getAllProjectApplications();
        return ResponseEntity.ok(projectApplicationList);
    }

    /**
     *  checks if the project application is reviewed
     * @param projApp
     * @param id
     * @return
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @PutMapping("{id}")
    public ResponseEntity<Response> ReviewProjectApplication(@RequestBody PutProjectApplication projApp, @PathVariable long id ){
        projectApplicationService.reviewProjectApplication(projApp, id);
        Response response =new Response("SUCCESS","project application reviewed!");
        return ResponseEntity.ok(response);
    }

    /**
     * Get all project application by its IDs
     * @param id
     * @return
     */

    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping("whereProjectId={id}")
    public ResponseEntity<List<ProjectApplication>> getProjectApplicationsByProjectId(@PathVariable long id){
        List<ProjectApplication> projectApplication = projectApplicationService.getProjectApplicationsByProjectId(id);
        return ResponseEntity.ok(projectApplication);

    }

    /**
     * create project application
     * @param projectApplication
     * @return
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @PostMapping
    public ResponseEntity<PostProjectApplication> createProjectApplication(@RequestBody PostProjectApplication projectApplication) {
        projectApplicationService.saveProjectApplication(projectApplication);
        return ResponseEntity.status(HttpStatus.CREATED).body(projectApplication);
    }


}