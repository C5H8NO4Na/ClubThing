package com.company;

public class Queue {

    public Club head;

    public Queue() {
        head = null;
    }

    public void push(Club club)
    {
        Club oldHead = head;
        head = new Club();
        head = club;
        head.next = oldHead;
    }

    public Club peek() {
        return head;
    }


}

