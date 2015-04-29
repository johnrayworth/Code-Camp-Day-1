/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.camp.day.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author johnrayworth
 */
public class DemoQueueForDossier {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //use either LinkedList or ArrayList
        //frankly for the HL material, LinkedList is better
        CustomQueue pezQueue = new CustomQueue();

        //treating handing out pez candy things as first come first serve
        for (int i = 0; i < 5; i++) {
            System.out.println("You are number " + (i + 1) +" in line"
                    + " what flavour of pez do you want");
            String flavour = br.readLine();
            System.out.println("What character do you want your Pez dispenser to be?");
            String character = br.readLine();
            Pez p = new Pez(flavour, character);
            pezQueue.enqueue(p);
            
        }
        System.out.println("Ok, we'll get your orders ready!");
        for(int i = 0; i < 5; i++){
            System.out.println("Customer # " + i + " come get your pez"
                    + "of flavour " + pezQueue.dequeue().getFlavour());
        }
        
    }
}
