package ru.job4j.encapsulation;

import java.util.GregorianCalendar;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroupNumber(55);
        student.setDateReceipt(new GregorianCalendar(2013, 11, 25));
        System.out.println("Student : " + student.getFullName() + "," + " Group : " + student.getGroupNumber() + "," + " Date of receipt : " + student.getDateReceipt().getTime());
    }
}
