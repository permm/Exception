/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myexception;

/**
 *
 * @author goo33
 */
public class LAB3 {
    public static void main(String[] args) {
        try{
            System.out.println("statement1");
            System.out.println(1/0);
            System.out.println("statement3");
        }
        catch(IndexOutOfBoundsException ex){
            
        }
        
        System.out.println("statement5");
    }
}
