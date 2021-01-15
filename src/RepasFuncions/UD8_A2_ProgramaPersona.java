package RepasFuncions;


import java.util.Scanner;

public class UD8_A2_ProgramaPersona {

    public static void main(String[] args) {

        Persona persona1 = new Persona("7848569D","Tomeu","Sales",20);
        Persona persona2 = new Persona("4758515D","Pablo","Alborant",30);
      
        String cadena1 = persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni;
        String cadena2 = persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni;

        if (persona1.edad >= 18) {
            cadena1 += " es mayor de edad";
        } else {
            cadena1 += " no es mayor de edad";
        }

        if (persona2.edad >= 18) {
            cadena2 += " es mayor de edad";
        } else {
            cadena2 += " no es mayor d e edad";
        }

        System.out.println(cadena1);
        System.out.println(cadena2);

    }
}

