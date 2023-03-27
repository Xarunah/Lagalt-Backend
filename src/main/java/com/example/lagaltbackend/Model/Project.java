package com.example.lagaltbackend.Model;
import jakarta.persistence.*;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Project")
@Table(name = "project")
@Builder
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "projectId", updatable = false)
    private long projectId;

    @Column(name = "owner_id", updatable = false)
    private String userId;

    @Column(name = "title", nullable = false, length = 40)
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "short_description", length = 150)
    private String shortDescription;

    @Column(name = "description", length = 10000)
    private String description;

    @Column(name = "progress")
    private String progress;

    @Column(name = "status")
    private String status;

    @Column(name = "image_path")
    private String image;


    @ElementCollection
    @CollectionTable(name="project_skills", joinColumns=@JoinColumn(name="projectId"))
    @Column(name = "skills", length = 20)
    private Set<String> skills;

    @ElementCollection
    @CollectionTable(name="project_tags", joinColumns=@JoinColumn(name="projectId"))
    @Column(name = "tags", length = 20)
    private Set<String> tags;

    @Column(name = "Project_is_active")
    private boolean project_is_active;

    @ManyToMany
    @Column(name = "collaborators")
    private List<AppUser> collaborators;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "project")
    List<Comment> comments;



}
