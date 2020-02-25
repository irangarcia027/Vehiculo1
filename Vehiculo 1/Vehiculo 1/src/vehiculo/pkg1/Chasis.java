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
public class Chasis {
    private int tamanio;
    private String color;
    private String material;

    public Chasis() {
    }

    public Chasis(int tamanio, String color, String material) {
        this.tamanio = tamanio;
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    

  
    public void resistir (){
        System.out.println("Resistir.....");
    }
    public void sostener (){
        System.out.println("Sostener....");
    }
    
}
