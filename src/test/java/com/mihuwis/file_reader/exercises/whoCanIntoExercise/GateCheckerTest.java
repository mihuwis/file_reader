package com.mihuwis.file_reader.exercises.whoCanIntoExercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GateCheckerTest {

    private GateChecker gateChecker;

    @BeforeEach
    private void createInstance(){
        this.gateChecker = new GateChecker();
    }

    @Test
    public void testIfReturnsAllWithCorectNames(){
        List<Person> people = createList();
        String expected = "Mihu phone: 123";

        assertEquals(expected, gateChecker.peopleWhoCanGetIntoByName("Mihu", people).get(0));
    }


    private List<Person> createList(){
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
        return people;
    }



}