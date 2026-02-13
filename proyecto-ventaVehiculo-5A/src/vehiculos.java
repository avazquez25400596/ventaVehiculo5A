/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ajva_
 */
public class vehiculos {
    private String marca;
    private double precio;
    private String motor;
    
    public Vehiculo(String marca, double precio, String motor)
    {
        this.marca = marca;
        this.precio= precio;
        this.motor=motor;
    }
    @Override
    public String toString(){
        return "marca="+this.marca+"\n";
        return "precio="+this.precio+"\n";
        return "motor="+this.motor+"\n";

    }
    }
    
    
}
