package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private String name = "";
    private String surname = "";
    int age = 0;
    private Person underTest = new Person(name, surname, age);

    @Test
    void constructorTest() {
        //given
        String name = "Genndy";
        String surname = "Tartakovsky Smith";
        int age = 52;
        int words = 0;
        String[] wordsInSurname = surname.split("\\P{IsAlphabetic}+");

        //when
        underTest = new Person(name, surname, age);

        for (int i = 0; i < wordsInSurname.length; i++) {
            words++;
        }

        //then
        assertEquals("Genndy", underTest.getName());
        assertEquals("Tartakovsky Smith", underTest.getSurname());
        assertEquals(52, underTest.getAge());
        assertEquals(2, words);
    }

    @Test
    void testSetter_setsName() throws NoSuchFieldException {
        //given
        final String addName = "Jack";

        //when
        underTest.setName(addName);

        //then
        assertEquals("Jack", underTest.getName());
    }

    @Test
    void testGetter_getsValueOfName() {
        //given
        final String addName = "Jack";

        //when
        underTest.setName(addName);
        final String result = underTest.getName();

        //then
        assertEquals("Jack", result);
    }

    @Test
    void testSetter_setsSurname() {
        //given
        final String addSurname = "Black";

        //when
        underTest.setSurname(addSurname);

        //then
        assertEquals("Black", underTest.getSurname());
    }

    @Test
    void testGetter_getsValueOfSurname() {
        //given
        final String addSurname = "Black";

        //when
        underTest.setSurname(addSurname);
        final String result = underTest.getSurname();

        //then
        assertEquals("Black", result);
    }

    @Test
    void testSetter_setsAge() {
        //given
        int addAge = 53;

        //when
        underTest.setAge(addAge);

        //then
        assertEquals(53, underTest.getAge());
    }

    @Test
    void testGetter_getsValueOfAge() {
        //given
        final int addAge = 53;

        //when
        underTest.setAge(addAge);
        final int result = underTest.getAge();

        //then
        assertEquals(53, result);

    }

    @Test
    void testToString_WritePersonObjectAsString() {
        //given
        Person underTest = new Person("John", "Doe", 23);

        //when
        String result = underTest.toString();

        //then
        assertEquals("John Doe 23", result);

    }
}