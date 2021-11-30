package tema3;

import java.util.Scanner;


public class Tema3 {


    public static void main(String[] args) {
        coche micoche = new coche();
        System.out.println("Creación de la clase coche (Solo propiedades"); 
        System.out.println("");
        
        System.out.println("Ampliación de la clase coche (añadimos métodos set y get, insercion de datos y extracción de datos) ");
        micoche.setModelo("Ferrari");
        micoche.setColor("Rojo");
        System.out.println("El modelo del coche es " + micoche.getModelo());
        System.out.println("El color del coche es " + micoche.getColor());
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ampliación de la clase Coche (añadimos método imprimircoche) y prueba de esta tomando datos");
        System.out.println("Introduce módelo: ");
        String modelo = sc.nextLine();
        System.out.println("Introduce color: ");
        String color = sc.nextLine();
        micoche.setModelo(modelo);
        micoche.setColor(color);
        micoche.imprimecoche();
        
        System.out.println("Prueba de imprimecoche con datos fijos");
        micoche.setModelo("Rolls Royce");
        micoche.setColor("dorado");
        micoche.imprimecoche();
        System.out.println("");
                        
    }
    
}
