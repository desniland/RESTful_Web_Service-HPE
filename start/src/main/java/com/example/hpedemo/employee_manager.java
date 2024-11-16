package com.example.hpedemo;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static final employees list = new employees();

    static {
        // Creating a few employees
        // and adding them to the list
        list.get_employee_list().add(
                new employee(
                        "1",
                        "Kevin",
                        "Kyallo",
                        "kevinkyallo@gmail.com",
                        "Title"));

        list.get_employee_list().add(
                new employee(
                        "2",
                        "Desmond",
                        "mariwa",
                        "desmondmariwa@gmail.com",
                        "Title2"));

        list.get_employee_list().add(
                new employee(
                        "3",
                        "mark",
                        "maasai",
                        "markmaasai@gmail.com",
                        "Title3"));

    }

    // Method to return the list
    public employees get_all_employees() {
        return list;
    }


    // Method to add an employee
    // to the employees list
    public void
    add_employee(Employee employee) {
        list.get_employee_list()
                .add(employee);
    }

}
