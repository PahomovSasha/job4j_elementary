package ru.job4j.oop;

public class Builder extends Engineer {
    private String specialization;

    public boolean canBuildHouse(Builder builder) {
        return false;
    }
}
