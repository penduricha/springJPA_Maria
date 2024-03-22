package com.example.springjpa_maria.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name="Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private Long project_id;
    @Column(name = "name", length = 100, columnDefinition = "nvarchar(20)",nullable = false)
    private String name;
    @Column(name = "budget", length = 100, nullable = false)
    private double budget;
    @Column(name = "startDate", length = 100, nullable = false)
    private Date startDate;
    //n-1
    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<Staff> listStaff=new ArrayList<>();

    public Project(String name, double budget, Date startDate) {
        this.name = name;
        this.budget = budget;
        this.startDate = startDate;
        //this.listStaff = listStaff;
    }

    public Project() {

    }

    @Override
    public String toString() {
        return "Project{" +
                "project_id=" + project_id +
                ", name='" + name + '\'' +
                ", budget=" + budget +
                ", startDate=" + startDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Project project)) return false;
        return Objects.equals(getProject_id(), project.getProject_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProject_id());
    }

    public Long getProject_id() {
        return project_id;
    }

    public void setProject_id(Long project_id) {
        this.project_id = project_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public List getListStaff() {
        return listStaff;
    }

    public void setListStaff(List listStaff) {
        this.listStaff = listStaff;
    }
}
