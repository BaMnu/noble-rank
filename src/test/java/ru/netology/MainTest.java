package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test_shouldOutputPeopleBySurname_Age_ExceptUnderage() {
        //given
        Set<Person> people = new TreeSet<>(new PersonSurnameNobilityComparator());
        Person person1 = new Person("Jason", "Brown", 33);
        Person person2 = new Person("Trevor", "Rose Parker Stone", 17);
        Person person3 = new Person("Polly", "Harris Wilson Walker Owen", 25);

        people.add(person1);
        people.add(person2);
        people.add(person3);

        int count = 0;

        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> expectedResult = new ArrayList<>();

        //when
        Predicate<Person> underage = x -> x.getAge() < 18;
        people.removeIf(underage);

        expectedResult.add("1. " + person3);
        expectedResult.add("2. " + person1);

        for (Person person : people) {
            count++;
            result.add(count + ". " + person);
        }

        //then
        assertEquals(expectedResult, result);
    }
}