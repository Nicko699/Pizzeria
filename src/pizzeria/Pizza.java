package pizzeria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pizza {

    private String nombre;
    private double precio;
    private double total;
    private double total1;
    private boolean decide=true;

    public void elegirTamaño(double grandeva, double medianava, double pequeñava, int tamaño) {
        Scanner teclado = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Elige el tamaño");
                System.out.println("1.Grande (30000)");
                System.out.println("2.mediana (25000)");
                System.out.println("3.pequeña (20000)");
                tamaño = teclado.nextInt();
                break;
            }
             catch (Exception e) {
                System.out.println("ADVETENCIA!!:Solo se permiten numeros");
                teclado.nextLine();
             } 
           
            } 
        
            switch (tamaño) {
                case 1:
                    total = grandeva;
                    break;
                case 2:
                    total = medianava;
                    break;
                case 3:
                    total = pequeñava;
                    break;
            
        }
    }

    public void calcularTotal(double peperoni, double pollo, double piña, double carne, double maiz, int tipo) {
        Scanner teclado1 = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Elige los ingredientes");
                System.out.println("1.piña y pollo (9000)");
                System.out.println("2.carne y maiz (11000)");
                System.out.println("3.peperoni (3000)");
                tipo = teclado1.nextInt();
                break;
            } catch (Exception e) {

                System.out.println("ADVETENCIA!!:Solo se permiten numeros");
                  teclado1.nextLine();
            }}
            switch (tipo) {
                case 1:
                    total1 = total + (piña + pollo);
                    break;
                case 2:
                    total1 = total + (carne + maiz);
                    break;
                case 3:
                    total1 = total + peperoni;
                    break;
            
        }

    }

    public Pizza() {
    }

    public Pizza(double total, double total1) {

        this.total = total;
        this.total1 = total1;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

}
