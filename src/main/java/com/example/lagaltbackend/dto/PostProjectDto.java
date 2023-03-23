package com.example.lagaltbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;


@AllArgsConstructor
@Data
@Builder
public class PostProjectDto {

    private long userId;

    private String title;

    private String category;

    private String shortDescription;

    private String description;

    private Set<String> skills;

    private Set<String> tags;

    private boolean project_is_active;

}
