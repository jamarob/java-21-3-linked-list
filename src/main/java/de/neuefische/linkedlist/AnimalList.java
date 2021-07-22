package de.neuefische.linkedlist;

public class AnimalList {

    private AnimalListItem head;

    public void add(Animal animal) {
        AnimalListItem newItem = new AnimalListItem(animal);
        if(isEmpty()){
            setFirstItem(newItem);
        }else {
            appendToLastItem(newItem);
        }
    }

    private boolean isEmpty() {
        return head == null;
    }

    private void setFirstItem(AnimalListItem item){
        head = item;
    }

    private void appendToLastItem(AnimalListItem item){
        AnimalListItem current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(item);
    }

    @Override
    public String toString(){
        if(isEmpty()){
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getValue().getName());

        AnimalListItem current = head.getNext();
        while(current != null){
            builder.append(" -> ").append(current.getValue().getName());
            current = current.getNext();
        }

        return builder.toString();
    }

    public void remove(Animal animal) {
        if(isEmpty()){
            return;
        }

       while(head != null && head.getValue().equals(animal)){
           head = head.getNext();
       }

       if(isEmpty()){
           return;
       }

       AnimalListItem current = head;
       while(current.getNext() != null){

           if(current.getNext().getValue().equals(animal)){
               current.setNext(current.getNext().getNext());
           }else{
               current = current.getNext();
           }
       }

    }
}
