package com.example.hpedemo;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<employee> employee_list;

    public List<employee> get_employee_list() {
        if (employee_list == null) {
            employee_list = new ArrayList<>();
        }
        return employee_list;
    }

}
