/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.camp.day.pkg1;

/**
 *
 * @author johnrayworth
 */
public class RecursionIntroduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Iterative solution to repeating something 10 times.
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println("-----------------");
        //Recursive solution
        
        int i = 0;
        recursiveLoop(i);
        
        
    }
    
    
    public static void recursiveLoop(int i){
        if(i < 3){
            System.out.println(i);
            i++;
            recursiveLoop(i);
        }else{
            return;
        }  
    }
    
}
