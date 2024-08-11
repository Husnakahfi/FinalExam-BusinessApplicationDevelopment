/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalexam.bad;

/**
 *
 * @author LENOVO
 */
class Animal {
 void sound() {
 System.out.println("The animal makes a sound.");
 }
}
class Dog extends Animal {
 @Override
 void sound() {
 System.out.println("The dog barks.");
 }
}
class Cat extends Animal {
 @Override
 void sound() {
 System.out.println("The cat meows.");
 }
}
public class Example {
 public static void main(String[] args) {
 Animal[] animals = new Animal[3];
 animals[0] = new Animal();
 animals[1] = new Dog();
 animals[2] = new Cat();
 for (Animal animal : animals) {
 animal.sound();
 }
 }
}
