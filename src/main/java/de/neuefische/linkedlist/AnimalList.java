package de.neuefische.linkedlist;

import java.lang.reflect.AnnotatedArrayType;

public class AnimalList {

    private AnimalListItem head;

    public AnimalList(Animal head) {
        if (head != null) {
            AnimalListItem newItem = new AnimalListItem(head);
            this.head = newItem;
        }
    }

    public AnimalListItem getHead() {
        return head;
    }

    public void add(Animal newAnimal){
        boolean running = true;
        AnimalListItem current = head;
        while (running) {
            if (current.getNext() == null) {
                current.setNext(new AnimalListItem(newAnimal));
                running = false;
            } else {
                current = current.getNext();
            }
        }
    }

    @Override
    public String toString() {
        String actual="";
        boolean running=true;
        AnimalListItem toAdd = head;
        while (running){
            actual += toAdd.toString();
            if (toAdd.getNext()!=null){
                toAdd = toAdd.getNext();
            } else {
                running = false;
            }
        }
        return actual;
    }

    public void remove (Animal animalToRemove){
        AnimalListItem current = head;
        int counter = 1;
        boolean running = true;
        while (running) {
            if (current.getValue().equals(animalToRemove)) {
                if(counter==1){
                    head = current.getNext();
                } else {
                    AnimalListItem beforeToDelete = head;
                    for (int i = 2; i < counter; i++) {

                    }
                }
            } else {
                current = current.getNext();
                counter++;
            }
        }
    }
}
