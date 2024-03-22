package com.example.springjpa_maria.service.impl;

import com.example.springjpa_maria.models.Project;
import com.example.springjpa_maria.repositories.ProjectRepository;
import com.example.springjpa_maria.service.I_ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectService implements I_ProjectService {
    private final ProjectRepository projectRepository;
    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public int addProject(Project p) {
        try {
            projectRepository.save(p);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public List<Project> getListProject() {

        List<Project> listProject = projectRepository.findAll();
        return listProject;
    }

    @Override
    public String getString_ListProject() {
        String s="";
        for(Project p: getListProject()){
            s+=p.toString()+"\n";
        }
        return s;
    }
}
