package com.example.hibernate_demo.model;

public class Student extends Person{

    private long groupId;

    public Student(long id, String firstName, String lastName, long groupId) {
        super(id, firstName, lastName);
        this.groupId = groupId;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }
}
