package de.neuefische.linkedlist;

public class AnimalListItem {
    private Animal value;
    private AnimalListItem next;

    public AnimalListItem(Animal value) {
        this.value = value;
    }

    public AnimalListItem getNext() {
        return next;
    }

    public void setNext(AnimalListItem next) {
        if (next!=null) {
            this.next = next;
        }
    }

    public Animal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}