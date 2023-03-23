package com.example.lagaltbackend.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserHistory {

    @Id
    private Long historyId;

    private String viewedProject;

    private String clickedOn;

    private String appliedProject;

    private String contributedTo;



}
