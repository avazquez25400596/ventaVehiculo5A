/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ajva_
 */
public class Cliente {
    private String RS;
    private String RFC;
    private String EMAIL;
    
    public Cliente(String RS, String RFC, String EMAIL)
    {
        this.RS = RS;
        this.RFC= RFC;
        this.EMAIL=EMAIL; 
    }
    @Override
    public String toString(){
        return "Razon social="+this.RS+"\n"
        + "RFC=" +this.RFC+"\n"
        + "EMAIL=" +this.EMAIL+"\n";

    }
    }
}
