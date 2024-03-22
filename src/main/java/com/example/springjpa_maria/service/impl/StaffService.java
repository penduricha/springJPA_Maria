package com.example.springjpa_maria.service.impl;

import com.example.springjpa_maria.models.Staff;
import com.example.springjpa_maria.service.I_StaffService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService implements I_StaffService {
    @Override
    public int addStaff(Staff s) {
        return 0;
    }

    @Override
    public List<Staff> getListStaff() {
        return null;
    }

    @Override
    public String getString_ListStaff() {
        return null;
    }
}
