package com.example.lagaltbackend.repository;

import com.example.lagaltbackend.Model.ProjectApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectApplicationRepository extends JpaRepository<ProjectApplication,Long> {

}