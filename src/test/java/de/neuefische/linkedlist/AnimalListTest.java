package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void testListBuilder(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        String expected = "Pferd";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

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
        String expected = "Pferd -> Affe -> Elefant";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

    public void testAddToEmptyListAndToString(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.remove(pferd);
        testList.add(elefant);
        String expected = "Elefant";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

    @Test
    public void testRemoveHeadAndToString(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.remove(pferd);
        String expected = "Affe -> Elefant";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

    @Test
    public void testRemoveAnyAnimalAndToString(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.remove(affe);
        String expected = "Pferd -> Elefant";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

    @Test
    public void testRemoveAnimalNotInList(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(affe);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.remove(pferd);
        String expected = "Affe -> Affe -> Elefant";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

    @Test
    public void testRemoveInEmptyList(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(affe);
        //WHEN
        testList.remove(affe);
        testList.remove(pferd);
        String expected = "";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);

    }

}