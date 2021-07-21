package de.neuefische.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void toStringOfEmptyListReturnsEmptyString(){
        // GIVEN
        AnimalList list = new AnimalList();

        // WHEN
        String actual = list.toString();

        // THEN
        assertEquals("", actual);
    }

    @Test
    public void testAddToList(){
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

}