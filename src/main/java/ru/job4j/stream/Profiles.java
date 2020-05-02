package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    static List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(Profile::getAddress).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Profile> profiles = Arrays.asList(
                new Profile(new Address("Екатеринбург", "Пихтовая", 10, 7)),
                new Profile(new Address("Екатеринбург", "Лесная", 20, 27))
        );
        System.out.println(collect(profiles));
    }
}
