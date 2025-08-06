/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankqueuesystem;

class Customer {
    private static int counter = 1;
    private final String name;
    private final int number;

    public Customer(String name) {
        this.name = name;
        this.number = counter++;
    }

    public String toString() {
        return "Customer #" + number + " - " + name;
    }
}
