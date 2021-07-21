package de.neuefische.linkedlist;

public class AnimalListItem {

    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal animal) {
        this.value = animal;
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        this.next = next;
    }
}
