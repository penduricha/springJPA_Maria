package com.example.springjpa_maria.repositories;

import com.example.springjpa_maria.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
