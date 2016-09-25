package com.ssc.ehorizon.fs.client;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class DeDup {

    public static int[] C = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
                                   20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
                                   13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   
    
    
    public int[] removeDuplicatesUsingHashSet(){
	
	Set<Integer> set = new HashSet<Integer>();
	
        
        for (int index = 0; index < C.length; index++)
        {
            set.add(C[index]);
        }
        
        
         return toInt(set);
	
    }
    
    
    public int[] removeDuplicatesUsingLinkedHashSet(){
	
	Set<Integer> set = new LinkedHashSet<Integer>();
	
        
        for (int index = 0; index < C.length; index++)
        {
            set.add(C[index]);
        }
        
        
         return toInt(set);
	
    }
    
    
   public int[] removeDuplicatesUsingTreeSet(){
	
	Set<Integer> set = new TreeSet<Integer>();
	
        
        for (int index = 0; index < C.length; index++)
        {
            set.add(C[index]);
        }
        
        
         return toInt(set);
	
    }
    
    
    public int[] toInt(Set<Integer> set) {
	  int[] array = new int[set.size()];
	  int i = 0;
	  for (Integer val : set) array[i++] = val;
	  return array;
	}
    
    
    public static void printArray(int[] array) {
	      for (int i = 0; i < array.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(array[i]);
	      }
	      System.out.println("");
    }

    public static void main(String [] args) {
	
	DeDup dedup = new DeDup();
	
	int arrayWithoutDupMeth1[] = dedup.removeDuplicatesUsingHashSet();
	
	System.out.println("Printing array without duplicates using Method 1 ");
	
	printArray(arrayWithoutDupMeth1);
	
	int arrayWithoutDupMeth2[] = dedup.removeDuplicatesUsingLinkedHashSet();
	
	System.out.println("Printing array without duplicates using Method 2 ");
	
	printArray(arrayWithoutDupMeth2);

	System.out.println("Printing array without duplicates using Method 3 ");
	
	int arrayWithoutDupMeth3[] = dedup.removeDuplicatesUsingTreeSet();
	
	printArray(arrayWithoutDupMeth3);

	
	

	
	
	
 
    }
    
    
    
    
}
