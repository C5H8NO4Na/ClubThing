package com.company;

public class LinkedList {

    public Club firstLink;

    public LinkedList(){
        // First Link always starts as null
        firstLink = null;
    }

    public boolean isEmpty() {
        if(firstLink==null){
            return true;
        }

        return false;
    }

    public void insert(String nodeTitle) {
        Club club = new Club(nodeTitle);
        firstLink = new Club("");
        club.setNext(firstLink.getNext());
        firstLink.setNext(club);
        firstLink.setTitle(nodeTitle);
    }

    public Club removeFirst() {
        if(firstLink==null) {
            return null;
        }
        if(firstLink.getNext()!=null) {
            firstLink.setNext(firstLink.getNext().getNext());
        }
        firstLink = null;
        return null;
    }

    public void displayAll() { //Travel through the LinkedList and output each entry
        Club node = firstLink;
        while(!(node==null)) {
            System.out.println(node.getTitle());
            node = node.getNext();
        }
    }

    public Club find(String nodeTitle) {
        if(firstLink==null) {
            return null;
        }
        Club node = firstLink;
        while(!(node.getNext()==null)) {
            if((node.getNext().getTitle().equals(nodeTitle))) {
                return node.getNext();
            }
            node = node.getNext();
        }
        return null;
    }

    public Club removeLink(String nodeTitle) {
        if(firstLink==null) {
            return null;
        }
        Club node = firstLink;
        while(!(node.getNext().equals(null))) {
            if ((node.getNext().getTitle().equals(nodeTitle))) {
                Club link = node.getNext();
                node.setNext(link.getNext());
                return link;
            }
            node = node.getNext();
        }
        return null;
    }



}
