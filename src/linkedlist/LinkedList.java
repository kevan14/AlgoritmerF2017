package linkedlist;


import linkedlist.Node;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kennet_Skole
 */
public class LinkedList {

    public Node tail;

    public LinkedList() {

    }

    public boolean remove(int index) throws Exception {

        if (index == 0) {
            this.tail = this.tail.tail;
            return true;
        }

        int start = 0;

        Node next = this.tail;
        Node nMinus = null; // this tail points to nPlus...
        Node nPlus = null;

        while (true) {
            if (nMinus != null && nPlus != null) {
                System.out.println(nMinus);
                System.out.println(nPlus);
                nMinus.tail = nPlus;
                return true;
            }
            if (start == index - 1) {
                nMinus = next;
                start++;
            } else if (start == index + 2) {
                nPlus = next;
                start++;
            } else {
                start++;
                if(next.tail == null) {
                    int inIndex = start - 1;
                    throw new Exception("Index '"+index+"' out of bounce. Max index = " + inIndex + " : total elements = " + start);
                }
                next = next.tail;
            }

        }
    }

    public int get(int index) throws Exception {
        int start = 0;

        Node next = this.tail;
        while (true) {
            if (start == index) {
                //correct index

                return next.value;
            } else {
                start++;
                if(next.tail == null) {
                    throw new Exception("There is no element on index: " + index);
                }
                next = next.tail;
            }
        }

    }

    public boolean insert(int value) {
        if (this.tail == null) {
            this.tail = new Node(value);
            return true;
        }
        Node next = this.tail;
        while (true) {
            if (next.tail == null) {
                next.tail = new Node(value);
                return true;
            } else {
                next = next.tail;
            }
        }

    }

    public boolean insert(int value, int index) {

        int start = 0;

        Node next = this.tail;
        while (true) {
            if (start == index) {
                //correct index

                next.value = value;
                return true;
            } else {
                start++;
                next = next.tail;
            }
        }

    }

}
