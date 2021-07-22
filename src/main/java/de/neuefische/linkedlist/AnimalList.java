package de.neuefische.linkedlist;

public class AnimalList {

    private AnimalListItem head;

    public AnimalList(Animal whichAnimal) {
            this.head = new AnimalListItem(whichAnimal);
    }

    public AnimalList(){
        head = null;
    }

    public AnimalListItem getHead() {
        return head;
    }

    public void add(Animal newAnimal) {
        if (isEmpty()) {
            setFirstItem(newAnimal);
            return;
        }
        AnimalListItem current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(new AnimalListItem(newAnimal));
    }

    public void remove(Animal animalToRemove) {
        if (specialCaseCheckerTurnsOn(animalToRemove)) {
            return;
        }
        AnimalListItem current = head;
        int counter = 0;
        while (!current.getValue().equals(animalToRemove)) {
            current = current.getNext();
            counter++;
        }
        AnimalListItem beforeToDelete = head;
        for (int i = 2; i <= counter; i++) {
            beforeToDelete = beforeToDelete.getNext();
        }
        if (current.getNext() == null) {
            beforeToDelete.setNext(null);
        } else {
            beforeToDelete.setNext(current.getNext());
        }
        remove(animalToRemove);
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder completeString = new StringBuilder(head.getValue().getName());
        AnimalListItem toAdd = head.getNext();
        while (toAdd != null) {
            completeString.append(" -> ").append(toAdd.getValue().getName());
            toAdd = toAdd.getNext();
        }
        return completeString.toString();
    }

    private boolean specialCaseCheckerTurnsOn(Animal animalToRemove) {
        if (isEmpty()) {
            return true;
        }
        if (head.getValue().equals(animalToRemove)) {
            head = head.getNext();
            remove(animalToRemove);
            return true;
        }
        return animalIsInList(animalToRemove);

    }

    private boolean animalIsInList(Animal animalToRemove) {
        AnimalListItem compareItem = head;
        while (compareItem.getNext() != null) {
            if (compareItem.getValue().equals(animalToRemove)) {
                return false;
            }
            compareItem = compareItem.getNext();
        }
        if (compareItem.getValue().equals(animalToRemove)) {
            return false;
        }
        return true;
    }

    private boolean isEmpty() { return head == null; }

    private void setFirstItem(Animal animal) {
        head = new AnimalListItem(animal);
    }
}
