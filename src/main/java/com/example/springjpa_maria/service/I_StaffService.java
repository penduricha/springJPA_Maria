package com.example.springjpa_maria.service;

import com.example.springjpa_maria.models.Project;
import com.example.springjpa_maria.models.Staff;

import java.util.List;

public interface I_StaffService {
    public int addStaff(Staff s);
    public List<Staff> getListStaff();
    public String getString_ListStaff();
}
