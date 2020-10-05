package com.example.hibernate_demo.model;

public class Lecturer extends Person {

    private long departmentId;

    public Lecturer(long id, String firstName, String lastName, long departmentId) {
        super(id, firstName, lastName);
        this.departmentId = departmentId;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}
