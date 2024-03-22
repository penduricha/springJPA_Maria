package com.example.springjpa_maria;

import com.example.springjpa_maria.models.Project;
import com.example.springjpa_maria.models.Staff;
import com.example.springjpa_maria.service.impl.ProjectService;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;

@SpringBootApplication
public class SpringJpaMariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMariaApplication.class, args);
	}
	@Transactional
	@Bean
	public CommandLineRunner run(ProjectService projectService) throws Exception{
		return (args -> {
			//Khởi tạo
			//public Project(String name, double budget, Date startDate, List listStaff)

			Project project1=new Project("Landmark",50, Date.valueOf("2024-10-23"));
			Project project2=new Project("Kistaro",50, Date.valueOf("2024-10-23"));
			// public Staff(String nameStaff, int age, boolean gender)
			Staff staff1=new Staff("Man",30,true);
			Staff staff2=new Staff("Ben",30,true);
			Staff staff3=new Staff("Mary",30,false);
			Staff staff4 =new Staff("Man Man",30,true);
			Staff staff5=new Staff("Ben Bis",30,true);
			Staff staff6=new Staff("Mark",30,false);
			//set quan hệ
			project1.getListStaff().add(staff4);
			project1.getListStaff().add(staff2);
			project1.getListStaff().add(staff3);
			staff1.setProject(project1);
			staff2.setProject(project1);
			staff3.setProject(project1);
			project2.getListStaff().add(staff4);
			project2.getListStaff().add(staff5);
			project2.getListStaff().add(staff6);
			staff4.setProject(project2);
			staff5.setProject(project2);
			staff6.setProject(project2);
			//add
			/*
			if(projectService.addProject(project1)==1 && projectService.addProject(project2)==1 ){
				System.out.println("Thêm thành công.");
			}else{
				System.out.println("Thêm thất bại.");
			}*/
			System.out.println("List Project.");
			System.out.println(projectService.getString_ListProject());
			System.out.println("Click link: http://localhost:8080/projects");

		});
	}
}
