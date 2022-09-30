package ru.netology;

import org.junit.jupiter.api.*;

class PersonSurnameNobilityComparatorTest {

    private final PersonSurnameNobilityComparator underTest = new PersonSurnameNobilityComparator();

    @Test
    void itShouldComparePeopleBySurnameOrAge() {
        //given
        Person o1 = new Person("Jason", "Brown", 33);
        Person o2 = new Person("Trevor", "Rose Parker Stone", 17);

        //when
        int result = underTest.compare(o1, o2);

        //then
        Assertions.assertEquals(1, result);
    }

}