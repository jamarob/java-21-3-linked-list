package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void testListBuilder() {
        //GIVEN
        Animal pferd = new Animal("Pferd");
        Animal affe = new Animal("Affe");
        Animal elefant = new Animal("Elefant");
        AnimalList testList = new AnimalList(pferd);
        //WHEN
        String expected = "Pferd";
        //THEN
        String actual = testList.toString();
        assertEquals(expected, actual);

    }

    @Test
    public void testAddAndToString() {
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
        assertEquals(expected, actual);

    }

    @Test
    public void testAddToEmptyListAndToString() {
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
        assertEquals(expected, actual);

    }

    @Test
    public void testRemoveHeadAndToString() {
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
        assertEquals(expected, actual);

    }

    @Test
    public void testRemoveAnyAnimalAndToString() {
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
        assertEquals(expected, actual);

    }

    @Test
    public void testRemoveAnimalNotInList() {
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
        assertEquals(expected, actual);

    }

    @Test
    public void testRemoveInEmptyList() {
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
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveLastItemInList() {
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
        assertEquals(expected, actual);
        assertNull(testList.getHead().getNext().getNext());
    }

    @Test
    public void testRemoveLastItemInLongList() {
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
        assertEquals(expected, actual);
        assertNull(testList.getHead().getNext().getNext().getNext().getNext().getNext().getNext().getNext().getNext());
    }

    @Test
    public void testRemoveAnyItemInLongList() {
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
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveHeadInLongList() {
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
        assertEquals(expected, actual);
    }


    @Test
    public void toStringOfEmptyListReturnsEmptyString() {
        // GIVEN
        AnimalList list = new AnimalList();

        // WHEN
        String actual = list.toString();

        // THEN
        assertEquals("", actual);
    }

    @Test
    public void testAddToList() {
        // GIVEN
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");
        Animal mouse = new Animal("mouse");
        AnimalList list = new AnimalList();

        // WHEN
        list.add(dog);
        list.add(cat);
        list.add(mouse);
        String actual = list.toString();

        // THEN
        String expected = "dog -> cat -> mouse";
        assertEquals(expected, actual);
    }

    @ParameterizedTest(name = "{0}")
    @MethodSource("provideTestRemoveArguments")
    public void testRemoveItemsFromList(String description, String[] animalNames, String animalNameToRemove, String expected) {
        // GIVEN
        AnimalList list = new AnimalList();
        for (String animalName : animalNames) {
            list.add(new Animal(animalName));
        }

        // WHEN
        list.remove(new Animal(animalNameToRemove));
        String actual = list.toString();

        // THEN
        assertEquals(expected, actual);
    }

    private static Arguments[] provideTestRemoveArguments() {
        return new Arguments[]{
                Arguments.of("Remove only element", new String[]{"dog"}, "dog", ""),
                Arguments.of("Remove 1 from  head", new String[]{"dog", "cat", "mouse"}, "dog", "cat -> mouse"),
                Arguments.of("Remove 1 from middle", new String[]{"dog", "cat", "mouse"}, "cat", "dog -> mouse"),
                Arguments.of("Remove 1 from last", new String[]{"dog", "cat", "mouse"}, "mouse", "dog -> cat"),
                Arguments.of("Remove 2 consecutive", new String[]{"cat", "dog", "dog", "cat", "mouse"}, "dog", "cat -> cat -> mouse"),
                Arguments.of("Remove 2 from head", new String[]{"dog", "dog", "cat", "dog", "mouse", "dog"}, "dog", "cat -> mouse"),
        };
    }
}

