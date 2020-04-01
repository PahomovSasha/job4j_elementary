package ru.job4j.encapsulation;

import java.util.Calendar;

public class Student {
    private String fullName;
    private int groupNumber;
    private Calendar dateReceipt;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Calendar getDateReceipt() {
        return dateReceipt;
    }

    public void setDateReceipt(Calendar dateReceipt) {
        this.dateReceipt = dateReceipt;
    }
}
