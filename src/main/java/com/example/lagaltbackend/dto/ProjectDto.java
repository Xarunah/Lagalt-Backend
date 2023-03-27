package com.example.lagaltbackend.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

//@Builder
@AllArgsConstructor
@Data
@Builder
public class ProjectDto {

    private long projectId;

    private String userId;

    private String title;

    private String category;

    private String image;

    private String shortDescription;

    private String description;

    private String status;

    private String progress;

    private Set<String> skills;

    private Set<String> tags;

    private boolean project_is_active;
    private Set<String> collaborators;

}
