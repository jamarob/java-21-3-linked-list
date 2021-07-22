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

    @Test
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

    @Test
    public void testRemoveLastItemInList(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.remove(elefant);
        String expected = "Pferd -> Affe";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);
        assertNull(testList.getHead().getNext().getNext());
    }

    @Test
    public void testRemoveLastItemInLongList(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        Animal nashorn = new Animal("Nashorn");
        Animal elch = new Animal("Elch");
        Animal kuh = new Animal("Kuh");
        Animal fisch = new Animal("Fisch");
        Animal mensch = new Animal("Mensch");
        Animal fliege = new Animal("Fliege");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.add(nashorn);
        testList.add(elch);
        testList.add(kuh);
        testList.add(fisch);
        testList.add(mensch);
        testList.add(fliege);
        testList.remove(fliege);
        String expected = "Pferd -> Affe -> Elefant -> Nashorn -> Elch -> Kuh -> Fisch -> Mensch";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);
        assertNull(testList.getHead().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    public void testRemoveAnyItemInLongList(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        Animal nashorn = new Animal("Nashorn");
        Animal elch = new Animal("Elch");
        Animal kuh = new Animal("Kuh");
        Animal fisch = new Animal("Fisch");
        Animal mensch = new Animal("Mensch");
        Animal fliege = new Animal("Fliege");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.add(nashorn);
        testList.add(elch);
        testList.add(kuh);
        testList.add(fisch);
        testList.add(mensch);
        testList.add(fliege);
        testList.remove(mensch);
        String expected = "Pferd -> Affe -> Elefant -> Nashorn -> Elch -> Kuh -> Fisch -> Fliege";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);
    }

    @Test
    public void testRemoveHeadInLongList(){
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        Animal nashorn = new Animal("Nashorn");
        Animal elch = new Animal("Elch");
        Animal kuh = new Animal("Kuh");
        Animal fisch = new Animal("Fisch");
        Animal mensch = new Animal("Mensch");
        Animal fliege = new Animal("Fliege");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        testList.add(affe);
        testList.add(elefant);
        testList.add(nashorn);
        testList.add(elch);
        testList.add(kuh);
        testList.add(fisch);
        testList.add(mensch);
        testList.add(fliege);
        testList.remove(pferd);
        String expected = "Affe -> Elefant -> Nashorn -> Elch -> Kuh -> Fisch -> Mensch -> Fliege";
        //THEN
        String actual = testList.toString();
        assertEquals(expected,actual);
    }

}