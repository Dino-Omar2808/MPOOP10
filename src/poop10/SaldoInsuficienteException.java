/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author dinos
 */
public class SaldoInsuficienteException 
        extends Exception{
    /**
     * constructro vacio
     * @param message: nos regresa un mensaje de tipo String
     */
    public SaldoInsuficienteException
        (String message) {
            /**
             * super, es que llama a un metodo de oden superior
             */
        super("Saldo insuficiente");
    }
    
}
