/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception;

/**
 *
 * @author goo33
 */
public class LAB4 {
    public static void main(String[] args) {
        int[] list = new int[10];
        try{
            System.out.println("statement1");
            System.out.println(list[10]);
            System.out.println("statement3");
        }
        catch(ArithmeticException ex1){ 
        }
        catch(IndexOutOfBoundsException ex2){
            throw ex2;
        }
        finally{
        System.out.println("statement4");
        }
        System.out.println("statement5");
    }
}
