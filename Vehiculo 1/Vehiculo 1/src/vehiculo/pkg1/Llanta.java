/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.pkg1;

/**
 *
 * @author cheke
 */
public class Llanta {
    private double tamanio;
    private String color;
   

    public Llanta() {
    }

    public Llanta(float tamanio, String color, String material) {
        this.tamanio = tamanio;
        this.color = color;
        
    }

    public String getColor() {
        return color;
    }


    public double getTamanio() {
        return tamanio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTamanio(float tamanio) {
        this.tamanio = tamanio;
    }
    

  
    public void avanzar (){
        System.out.println("Avazar......");
    }
    public void frenar (){
        System.out.println("Frenar......");
    }        
    
    
}
