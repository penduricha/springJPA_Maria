package com.example.springjpa_maria.repositories;

import com.example.springjpa_maria.models.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff,Long> {
}
