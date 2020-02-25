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
public class Vehiculo1 {
private String marca;
    private int modelo;
    private String color;
    private Motor potencia ;
    private Llanta l1,l2,l3,l4;
    private Chasis fuerza;

    public Vehiculo1() {
    }

    public Vehiculo1(String marca, int modelo, String color, Motor potencia, Llanta l1, Llanta l2, Llanta l3, Llanta l4, Chasis fuerza) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.potencia = potencia;
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        this.l4 = l4;
        this.fuerza = fuerza;
    }

    public String getColor() {
        return color;
    }

    public Chasis getFuerza() {
        return fuerza;
    }

    public Llanta getL1() {
        return l1;
    }

    public Llanta getL2() {
        return l2;
    }

    public Llanta getL3() {
        return l3;
    }

    public Llanta getL4() {
        return l4;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public Motor getPotencia() {
        return potencia;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuerza(Chasis fuerza) {
        this.fuerza = fuerza;
    }

    public void setL1(Llanta l1) {
        this.l1 = l1;
    }

    public void setL2(Llanta l2) {
        this.l2 = l2;
    }

    public void setL3(Llanta l3) {
        this.l3 = l3;
    }

    public void setL4(Llanta l4) {
        this.l4 = l4;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(Motor potencia) {
        this.potencia = potencia;
    }
    
    public void correr () {
            System.out.println("Correr...");
}
    public void parar (){
        System.out.println("Parar......");
    }
    public static void main(String[] args) {
        System.out.println("vehiculo");
    }
}
