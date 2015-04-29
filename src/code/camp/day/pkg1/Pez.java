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
public class Pez {
    private String flavour = "not set yet";
    private String character = "like Daffy Duck";
    
    
    public Pez(){
        
    }
    
    public Pez(String flavour, String character){
        this.flavour = flavour;
        this.character = character;
    }
    
    public String getFlavour(){
        return flavour;
    }
    
    public String getCharacter(){
        return character;
    }
}
