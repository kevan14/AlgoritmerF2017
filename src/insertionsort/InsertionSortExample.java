/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertionsort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kennet_Skole
 */
public class InsertionSortExample {
    
    
    public static void main(String[] args) {
        List<Integer> unsorted = getIntegerList(1000);
        
        System.out.println("It took: " + insertionSort(unsorted) + " milliseconds to sort: " + unsorted);
    }
    
    /**
     * Alle elementer til venstre for et element er "sorteret". 
     * Den er ikke hurtig fordi den bruge nested loop til at swappe elementer.
     * Kan kun bruges til små dataset
     * 
     * Kørertider: 
     * Worstcase :  O(n^2), hvis nu inputet var sorteret falende
     * bestcase :  Omega(n), hvis nu inputtet var sorteret ikke-faldende
     * 
     * Algoritmen er "inblace", da den ikke optager mere hukommelse til at sortere. 
     * 
     * @param array
     * @return 
     */
    public static long insertionSort(List<Integer> array) {
        int i;
        int j;
        int key;
        int temp;
        
        long start = System.currentTimeMillis();
        
        for(i = 1; i < array.size(); i++) {
            key = array.get(i);
            j = i - 1;
            while(j >= 0  &&  key < array.get(j)) {
                temp = array.get(j);
                array.set(j, array.get(j+1));
                array.set(j+1, temp);
                
                j--;
                
            }
        }
        
        long finished = System.currentTimeMillis();
        
        return finished - start;
        
    }
    
    
    public static List<Integer> getIntegerList(int size) {
        ArrayList<Integer> intList = new ArrayList<>();
        
        
        for(int i = 0; i < size; i++) {
            intList.add(i);
        }
        
        Collections.shuffle(intList);
        
        return intList;
    }
}
