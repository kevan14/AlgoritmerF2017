
import linkedlist.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kennet_Skole
 */
public class LinkedList_Test {

    
    public static void main(String[] args) {

        LinkedList myList = new LinkedList();
        myList.insert(1);
        myList.insert(2);
        myList.insert(3);
        myList.insert(4);
        myList.insert(5);

        try {
            System.out.println(myList.remove(2));
        } catch (Exception ex) {
            Logger.getLogger(LinkedList_Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            System.out.println(myList.get(0));
        } catch (Exception ex) {
            Logger.getLogger(LinkedList_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(myList.get(1));
        } catch (Exception ex) {
            Logger.getLogger(LinkedList_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(myList.get(2));
        } catch (Exception ex) {
            Logger.getLogger(LinkedList_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(myList.get(3));
        } catch (Exception ex) {
            Logger.getLogger(LinkedList_Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            System.out.println(myList.get(4));
        } catch (Exception ex) {
            Logger.getLogger(LinkedList_Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
