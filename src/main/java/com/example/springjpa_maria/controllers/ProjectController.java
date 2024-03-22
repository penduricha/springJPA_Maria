package com.example.springjpa_maria.controllers;

import com.example.springjpa_maria.models.Project;
import com.example.springjpa_maria.service.impl.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;
    //private ObjectMapper objectMapper = new ObjectMapper();
    // API endpoint để tạo một dự án mới
    /*
    @PostMapping
    public ResponseEntity<String> createProject(@RequestBody Project project) {
        int result = projectService.addProject(project);
        if (result == 1) {
            return new ResponseEntity<>("Dự án đã được tạo thành công", HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Không thể tạo dự án", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/

    // API endpoint để lấy danh sách tất cả các dự án
    @GetMapping
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> projects = projectService.getListProject();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    /*
    // API endpoint để lấy một dự án dựa trên ID
    @GetMapping("/{project_id}")
    public ResponseEntity<Project> getProjectById(@PathVariable("project_id") Long projectId) {
        Project project = projectService.getProjectById(id);
        if (project != null) {
            return new ResponseEntity<>(project, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // API endpoint để cập nhật thông tin của một dự án
    @PutMapping("/{project_id}")
    public ResponseEntity<String> updateProject(@PathVariable Long id, @RequestBody Project project) {
        int result = projectService.updateProject(id, project);
        if (result == 1) {
            return new ResponseEntity<>("Dự án đã được cập nhật thành công", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Không thể cập nhật dự án", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // API endpoint để xóa một dự án
    @DeleteMapping("/{project_id}")
    public ResponseEntity<String> deleteProject(@PathVariable Long id) {
        int result = projectService.deleteProject(id);
        if (result == 1) {
            return new ResponseEntity<>("Dự án đã được xóa thành công", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Không thể xóa dự án", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
