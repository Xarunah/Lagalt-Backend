package com.example.lagaltbackend.dto;

import com.example.lagaltbackend.Model.Project;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CommentDto {

    private String message;

   // private long userId;

//    private long projectId;

}
