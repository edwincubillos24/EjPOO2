package ejpoo2;

import java.util.Scanner;

public class EjPOO2 {

    private String nombre;
    private int edad;
    Scanner lector;

    public EjPOO2() {
    }  
    
    public EjPOO2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }    
    
    public void inicializar() {
        lector = new Scanner(System.in);
        System.out.println("Digite nombre");
        nombre = lector.next();
        System.out.println("Digite edad");
        edad = lector.nextInt();
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad);
    }
    
    public static void main(String[] args) {
        EjPOO2 objeto1 = new EjPOO2();
        objeto1.inicializar();
        objeto1.imprimir();
        
        EjPOO2 objeto2 = new EjPOO2("Edwin",15);
        objeto2.imprimir();
    }
}
