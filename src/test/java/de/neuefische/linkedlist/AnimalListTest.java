package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void testAddAndToString(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        String expected = "PferdAffeElefant";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

}