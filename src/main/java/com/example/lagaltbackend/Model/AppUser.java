package com.example.lagaltbackend.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import jakarta.persistence.*;

// Entity for User
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name ="User")
@Table(name = "users")
@Builder
public class AppUser {
    @Id
    @Column(name = "user_id")
    private String UserId;

    @Column(name = "user_name", length = 50, nullable = false)
    private String username;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_description")
    private String userDescription;

    @Column(name = "user_portfolio")
    private String userPortfolio;
    @ElementCollection
    @CollectionTable(name="user_skills", joinColumns=@JoinColumn(name="user_id"))
    @Column(name = "user_skill")
    private Set<String> userSkill;

    @Column(name = "profile_visibility")
    private boolean profileVisibility;

   /* @ManyToMany(
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "owned_projects")
    private List<Project> projects;*/


}
