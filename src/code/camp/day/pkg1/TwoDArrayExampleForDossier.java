/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.camp.day.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author johnrayworth
 */
public class TwoDArrayExampleForDossier {
    public static void main(String[] args) throws IOException {
        //declaring a 2d array:
        //For you, the GUI table of Java & Netbeans is your main 2d situation.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int [] asdsadf = new int[10];
        int [][] twoDArray = new int [2][3];
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.println("What is the next number?");
                twoDArray[row][col] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("-----------");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(twoDArray[row][col] + "     ");
                
            }
            System.out.println("");
        }
    }
}
