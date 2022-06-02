package com.example.lab_306.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@Entity
public class BillableTask extends Task {

    private int hourlyRate;

    public BillableTask() {

    }

    public BillableTask(int id, String title, Date dueDate, Boolean status, int hourlyRate) {
        super(id, title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
