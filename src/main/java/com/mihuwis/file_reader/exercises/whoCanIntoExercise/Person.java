package com.mihuwis.file_reader.exercises.whoCanIntoExercise;

import java.util.List;

public class Person {
    private String name;
    private String phone;
    private List<String> skills;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(String skill) {
        this.skills.add(skill);
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
