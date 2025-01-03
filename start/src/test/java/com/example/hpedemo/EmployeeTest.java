package com.example.hpedemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    public void testCreatingEmployeeSuccessfully() {
        Employee employee = new Employee("2",
                "Desmond",
                "mariwa",
                "desmondmariwa@gmail.com",
                "Title2");

        assertEquals("2", employee.getEmployee_id());
        assertEquals("Desmond", employee.getFirst_name());
        assertEquals("desmondmariwa@gmail.com", employee.getEmail());
        assertEquals("Title2", employee.getTitle());
    }

}
