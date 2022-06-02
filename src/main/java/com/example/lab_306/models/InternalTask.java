package com.example.lab_306.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Task {

    public InternalTask() {
    }

    public InternalTask(int id, String title, Date dueDate, Boolean status) {
        super(id, title, dueDate, status);
    }
}
