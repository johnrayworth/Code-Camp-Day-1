/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codecampday2;

import code.camp.day.pkg1.Pez;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author johnrayworth
 */
public class UsingLinkedListAndArrayList {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        //We often have single pieces of data...
        int sdfasd = 23;
        String lkjljk = "sdfsdf";

        //...but we often have groups of data:
        int[] intArray = {23, 234, 23423, 234, 234234345, 4354343};

        //And these are best worked with as groups, or "structures"
        //The different kinds of structures, i.e. containers we have
        //worked with so far are:
        //- array
        //- list
        //- list as a queue, 
        //- list as a stack,
        //- tree
        //There are also Java "Collections" ready-made to work as lists
        //and dynamic arrays.
        //For IB CS, the ones we use are: ArrayList, and LinkedList
        
        
        //But note that the best thing for you to do for your 
        //dossier is to extend them to your own named classes
        //which use method names like "enqueue", and "pop";
        //see the class "CustomQueue" in the "code.camp.day.pkg1" 
        //package
        
        LinkedList<Pez> pezList = new LinkedList();
        
        
        
        
        
        
        Pez pez1 = new Pez("fruit", "Donald Duck");
        //asdfasdfads
        pezList.add(pez1);
        pezList.add(new Pez("strawberry", "Mini Mouse"));
        System.out.println(pezList.size());
        if (!pezList.isEmpty()) {
            System.out.println(pezList.removeLast().getCharacter());
        }
        if (!pezList.isEmpty()) {
            System.out.println(pezList.removeLast().getCharacter());
        }
        if (!pezList.isEmpty()) {
            System.out.println(pezList.removeLast().getCharacter());
        }
        System.out.println(pezList.size());

        System.out.println("----------------------------");
        
        ArrayList<Pez> pezArrayList = new ArrayList();
        Pez pez2 = new Pez("fruit", "Donald Duck");
        
        pezArrayList.add(pez2);
        pezArrayList.add(new Pez("strawberry", "Mini Mouse"));
        System.out.println(pezArrayList.size());
        if (!pezArrayList.isEmpty()) {
            System.out.println(pezArrayList.remove(0).getCharacter());
        }
        if (!pezArrayList.isEmpty()) {
            System.out.println(pezArrayList.remove(0).getCharacter());
        }
        if (!pezArrayList.isEmpty()) {
            System.out.println(pezArrayList.remove(2).getCharacter());
        }
        System.out.println(pezArrayList.size());
        
        
        
    }
}
