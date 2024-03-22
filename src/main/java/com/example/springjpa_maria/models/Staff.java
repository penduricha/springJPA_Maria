package com.example.springjpa_maria.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="Staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_id")
    private Long staff_id;
    @Column(name = "nameStaff", length = 100, columnDefinition = "nvarchar(20)",nullable = false)
    private String nameStaff;
    @Column(name = "age", length = 100, nullable = false)
    private int age;
    @Column(name = "gender", length = 100, nullable = false)
    private boolean gender;
    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Project project;

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public void setStaff_id(Long staffId) {
        this.staff_id = staffId;
    }

    public Long getStaff_id() {
        return staff_id;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Staff staff)) return false;
        return Objects.equals(getStaff_id(), staff.getStaff_id());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStaff_id());
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staff_id=" + staff_id +
                ", nameStaff='" + nameStaff + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public Staff(String nameStaff, int age, boolean gender) {
        this.nameStaff = nameStaff;
        this.age = age;
        this.gender = gender;
        //this.staff = staff;
    }

    public Staff() {
    }
}
