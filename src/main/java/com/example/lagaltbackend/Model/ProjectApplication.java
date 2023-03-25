package com.example.lagaltbackend.Model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "ProjectApplication")
@Table(name = "projectApplication")
@Builder
public class ProjectApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectApplication_id", updatable = false)
    private long projectApplicationId;

    // The project that is applied to
    private long projectId;

    //User who submitted the application
    private long userId;

    // is the application accepted by the owner
    private boolean accepted;

    // Has the application been reviewed by the owner
    private boolean reviewed;

    // written motivation submitted on the frontend
    private String motivation;
}
