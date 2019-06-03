package com.mihuwis.file_reader;

import com.mihuwis.file_reader.exercises.whoCanIntoExercise.GateChecker;
import com.mihuwis.file_reader.exercises.whoCanIntoExercise.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        GateChecker gateChecker = new GateChecker();
        List<Person> people = new ArrayList<>();

        Person mihu = new Person("Mihu", "123");
        mihu.addToSkillList("java");
        mihu.addToSkillList("climbing");
        people.add(mihu);

        Person krzychu = new Person("Krzychu", "999");
        krzychu.addToSkillList("java");
        krzychu.addToSkillList("pluming");
        people.add(krzychu);

        Person zdzichu = new Person("Zdzichu", "112");
        zdzichu.addToSkillList("sql");
        zdzichu.addToSkillList("drinking");
        people.add(zdzichu);

        List<String> peopleWhoGotInByName = gateChecker.peopleWhoCanGetIntoByName("Mihu", people);
        List<String> peopleWithSkill = gateChecker.peopleWhoGotSkill("java", people);

        peopleWhoGotInByName.forEach(System.out::println);

        peopleWithSkill.forEach(System.out::println);


    }
}
