/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.camp.day.pkg1;

import java.util.LinkedList;

/**
 *
 * @author johnrayworth
 */
public class CustomQueue extends LinkedList{
    
    public void enqueue(Pez o){
        super.addLast(o);
        //
    }
    
    public Pez dequeue(){
        return (Pez) super.removeFirst();
        //
        //
        //
        //
    }
    
   ///For your dossier, use this incombination with what you will
    //see in the "UsingLinkedListAndArrayList" class.
    
}
