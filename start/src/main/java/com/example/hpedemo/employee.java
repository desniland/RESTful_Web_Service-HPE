package com.example.hpedemo;

public class Employee {
    private String employee_id;
    private String first_name;
    private String last_name;
    private String email;
    private String title;

    public Employee(String employee_id, String first_name, String last_name, String email, String title) {
        this.employee_id = employee_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.title = title;
    }

    public String get_first_name() {
        return first_name;
    }

    public String get_last_name() {
        return last_name;
    }

    public String get_employee_id() {
        return employee_id;
    }

    public String get_email() {
        return email;
    }

    public String get_title() {
        return title;
    }

    public Employee set_employee_id(String employee_id) {
        this.employee_id = employee_id;
        return this;
    }

    public Employee set_first_name(String first_name) {
        this.first_name = first_name;
        return this;
    }

    public Employee set_last_name(String last_name) {
        this.last_name = last_name;
        return this;
    }

    public Employee set_email(String email) {
        this.email = email;
        return this;
    }

    public Employee set_title(String title) {
        this.title = title;
        return this;
    }
}
