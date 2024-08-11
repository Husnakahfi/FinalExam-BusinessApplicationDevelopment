/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package No4;

/**
 *
 * @author LENOVO
 */
public class Example {
 public static void main(String[] args) {
 try {
 int[] numbers = {1, 2, 3};
 System.out.println(numbers[5]);
 } catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
 }
 }
}