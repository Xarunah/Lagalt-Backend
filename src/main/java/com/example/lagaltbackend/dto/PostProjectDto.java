package com.example.lagaltbackend.dto;

import com.example.lagaltbackend.Model.AppUser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Set;


@AllArgsConstructor
@Data
@Builder
public class PostProjectDto {

    private String userId;

    private String title;

    private String category;

    private String shortDescription;

    private String description;

    private Set<String> skills;

    private Set<String> tags;

    private String status;

    private String progress;

    private List<AppUser> collaborators;

    private boolean project_is_active;

}
