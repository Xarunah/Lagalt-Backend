package com.example.lagaltbackend.controllers;


import com.example.lagaltbackend.Model.Response;
import com.example.lagaltbackend.dto.PostUserDto;
import com.example.lagaltbackend.dto.PutUserDto;
import com.example.lagaltbackend.dto.UserDto;
import com.example.lagaltbackend.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * THIS is the user controller where
 * your can create a profile
 *and get  the users in the database
 */


@RestController
@RequestMapping("/api/v1/user/")
@AllArgsConstructor
public class UserController {


    private final UserService userService;


    /**
     *
     * @param userDto
     * This method insert data into hte database
     * Check the userDto for response body
     * @return Response
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Response>  createProfile(@RequestBody PostUserDto userDto){
        userService.addUserProfile(userDto);
        Response response =new Response("SUCCESS","User profile created");
        return ResponseEntity.ok(response);
    }


    /**
     * Updates the users profile
     * @param id
     * @param userDto
     * @return
     */
   @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Response> updateProfileDetails(@PathVariable("id") Long id, @RequestBody PutUserDto userDto){
        userService.updateUserProfile(userDto, id);
        Response response =new Response("SUCCESS","User profile updated");
        return ResponseEntity.ok(response);
    }

    /**
     * Get a particular profile by its id
     * @param id
     * @return
     */

    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping("{id}")
    public ResponseEntity<Response> getProfile(@PathVariable("id") Long id){

        Response response=new Response("SUCCESS",userService.getUserProfile(id));

        return ResponseEntity.ok(response);
    }


    /**
     * Get all the users
     * @return App Users
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping
    public ResponseEntity<Response> getAllUsers(){

        Response response=new Response("SUCCESS",userService.getAllUsers());

        return ResponseEntity.ok(response);
    }


    /**
     * Get a user by its email
     * @param email
     * @return
     */
    @CrossOrigin(origins = {"http://localhost:3000","https://lagalt-frontend-ten.vercel.app"})
    @GetMapping("whereEmail={email}")
    public ResponseEntity<Response> getProfileByEmail(@PathVariable("email") String email){

        Response response=new Response("SUCCESS",userService.getUserProfileByEmail(email));

        return ResponseEntity.ok(response);
    }
    /**
     *
     * @param userId
     * this  method get all the user projects
     * Check the userDto for response body
     * @return Response
     */


    @PostMapping("visible/{id}")
    public ResponseEntity<Response> setProfileVisibility(@PathVariable("id") Long id){

        userService.setProfileVisible(id);

        Response response=new Response("SUCCESS","Visibility status changed");

        return ResponseEntity.ok(response);
    }




}
