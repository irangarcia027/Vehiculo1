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
public class Motor {
    private int modelo;
    private String marca;
    private double caballosdefuerza;

    public Motor() {
    }

    public Motor(int modelo, String marca, double caballosdefuerza) {
        this.modelo = modelo;
        this.marca = marca;
        this.caballosdefuerza = caballosdefuerza;
    }

    public double getCaballos() {
        return caballosdefuerza;
    }

    public void setCaballos(double caballos) {
        this.caballosdefuerza = caballosdefuerza;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void acelerar (){
        System.out.println("Aclerar....");
    }
    public void apagar (){
        System.out.println("apagar......");
    }
}
