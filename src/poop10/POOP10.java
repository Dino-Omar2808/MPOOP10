/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author dinos
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mensajes[]={"Primero", "segundo", "Tercero"};
        try {
            for(int i=0; i<=3; i++)
            System.out.println(mensajes[i]);    
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("error");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Hola mundo 2");   
        }
        //1
        try{
            double x;
            x=0/0;
            System.out.println("x= "+ x);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //2
        try{
            double x;
            x=0/0;
            System.out.println("x= "+ x);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //3
        try{
            double x;
            x=0/0;
            System.out.println("x= "+ x);
        
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
           
            
        }
         try{
            double x;
            x=0/0;
            System.out.println("x= "+ x);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hola mundo 3");
        
        try{
            double division = metododivision(4f,6.0);
        } catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }   

    private static double metododivision(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
