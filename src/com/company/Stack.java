package com.company;

public class Stack {

    public Club head;

    public Stack() {
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

