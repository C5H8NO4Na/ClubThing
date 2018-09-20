package com.company;
public class Queue {

    public Club head;

    public Queue() { head = null; }

    //fix
    public void push(Club club)
    {
        Club c=head;
        if(c.next.equals(null)){
           head.next=club;
           c.next=new Club();
        }
        while(!c.next.next.equals(null)){
            c=c.next;
            //fix
        }

    }
    public Club peek() { return head; }


}

