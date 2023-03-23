package com.example.lagaltbackend.controllers;


import com.example.lagaltbackend.Model.Comment;
import com.example.lagaltbackend.Model.Response;
import com.example.lagaltbackend.dto.*;
import com.example.lagaltbackend.services.ProjectService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/project/")
@AllArgsConstructor
public class ProjectController {


    private final ProjectService projectService;

    /**
     *
     *
     * @param projectDto
     * @return Response
     *
     * create project method
     * Request body, check the Project Dto class
     */

    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @PostMapping
    public ResponseEntity<Response> createProject(@RequestBody PostProjectDto projectDto) {
        projectService.createProject(projectDto);
        Response response = new Response("SUCCESS", "project created successfully");
        return ResponseEntity.ok(response);
    }


    /**
     *
     * @param id
     * @param joinProjectDto
     * @return
     */

    @PutMapping("join/{id}")
    public ResponseEntity<Response> joinProject(@PathVariable("id") Long projectId, @RequestBody JoinProjectDto joinProjectDto){
        projectService.joinProject(projectId,joinProjectDto.getUserId());

        Response response = new Response("SUCCESS", "");
        return ResponseEntity.ok(response);
    }

    /**
     *
     * @return List of all project create
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping("list")
    public ResponseEntity<Response> getAvailableProject() {



        Response response = new Response("SUCCESS", projectService.getAllProject());

        return ResponseEntity.ok(response);
    }


    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping("{id}")
    public ResponseEntity<Response> getProjectById(@PathVariable("id") Long id) {

        Response response = new Response("SUCCESS", projectService.getProjectById(id));

        return ResponseEntity.ok(response);
    }

    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @PutMapping("{id}")
    public ResponseEntity<Response> updateProgress(@RequestBody PutProjectDto projectDto,@PathVariable("id") Long id) {

        projectService.updateProjectProgress(projectDto, id);

        Response response =new Response("SUCCESS","Project progress updated");

        return ResponseEntity.ok(response);
    }


    @PostMapping("projectId/userId")
    public ResponseEntity<Response> commentOnProject(
            @PathVariable("projectId") Long projectId,
            @PathVariable("userId") Long  userId,
            @RequestBody CommentDto commentDto
            ){
            Response response=new Response("SUCCESS","Comment saved");
          projectService.commentOnProject(projectId,userId,commentDto);
          return  ResponseEntity.ok(response);


    }



}
