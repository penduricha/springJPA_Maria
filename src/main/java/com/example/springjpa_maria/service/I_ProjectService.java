package com.example.springjpa_maria.service;

import com.example.springjpa_maria.models.Project;

import java.util.List;

public interface I_ProjectService {
    public int addProject(Project p);
    public List<Project> getListProject();
    public String getString_ListProject();
}
