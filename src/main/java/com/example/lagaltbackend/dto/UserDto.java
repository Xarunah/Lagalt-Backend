package com.example.lagaltbackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {


    private long userId;
    private String username;
    private String email;
    private String userDescription;
    private String userPortfolio;
    private Set<String> userSkill;
    private boolean userVisibility;
  //  private Set<Long> projects;

}
