package com.mihuwis.file_reader.exercises.whoCanIntoExercise;

import java.util.List;
import java.util.stream.Collectors;

public class GateChecker {

    public List<String> peopleWhoCanGetIntoByName(String name, List<Person> people){
        return people.stream()
                .filter(n -> n.getName().equals(name))
                .map(x -> x.getName() + " phone: " + x.getPhone())
                .collect(Collectors.toList());
    }

    public List<String > peopleWhoGotSkill(String skill, List<Person> people){
        return people.stream().filter(n -> n.getSkills().stream().anyMatch(x -> x.equals(skill)))
                .map(y -> y.getName() + " " + y.getPhone())
                .collect(Collectors.toList());
    }
}
