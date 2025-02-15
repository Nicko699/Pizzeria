package pizzeria;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pedido ped = new Pedido();
        Pizza pizza = new Pizza();
        System.out.println("BIENVENIDOS A LA PIZZERIA THE BEST");
        System.out.println("Ingrese su nombre");
        ped.Nombre = teclado.nextLine();
        System.out.println("Ingrese su edad");
        ped.edad = teclado.nextInt();
        pizza.elegirTamaño(30000, 25000, 20000, 0);
        pizza.calcularTotal(3000, 5000, 4000, 7000, 4000, 0);

        System.out.println("Nombre cliente:" + ped.Nombre + " Edad:" + ped.edad + " Total a pagar:" + pizza.getTotal1());

    }
}
