package com.example.lagaltbackend.dto;

import com.example.lagaltbackend.Model.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CommentDto {

    private long id;

    private String message;

    private long userId;
    private long projectId;

}
