/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *Omar Gómez
 * @author dinos
 */
public class CuentaBancaria extends Cajero {
    /**
     * atributo saldo
     */
    private double saldo;
    /**
     * Constructor lleno
     */
    public CuentaBancaria(){
        saldo=0;
    }
    /**
     * Metodos obejtivo depositar
     * @param monto: la cantidad a depositar de tipo double
     */
    public void depositar(double monto){
        System.out.println("Depositado"
                +monto);
        saldo+= monto;
    }
    /**
     * Metdodo obejtivo retirar
     * @param monto: la cantidad a depositar de tipo double
     * @throws SaldoInsuficienteException 
     */
    public void retirar (double monto) 
            throws SaldoInsuficienteException{
        System.out.println("Retirando"+monto);
        /**
         * iterador (if-else) si el saldo es mayor al monto
         */
        if(saldo<monto){        
            throw new SaldoInsuficienteException
        ("Saldo insuficiente");
        }
        /**
         * si no
         */
        else
            saldo-= monto;
    }
    /**
     * metodo de servicio get
     * @return el valor del atributo saldo
     */
    public double getSaldo(){
        return saldo;
    }
}
