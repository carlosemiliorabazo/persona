import java.util.Scanner;

public class Main {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        Persona p = new Persona();
        System.out.println("Escribe tu nombre: ");
        p.setNombre(sc.nextLine());
        System.out.println("Escribe tu apellido: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Escribe tu dni sin letra: ");
        p.setDniSinLetra(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tu edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));
        System.out.println("Escribe tus estudios: ");
        p.setEstudios(sc.nextLine());
        System.out.println("Escribe tu línea de LoL preferida: ");
        p.setLoL(sc.nextLine());
        System.out.println("Escribe tu color de pelo: ");
        p.setColorPelo(sc.nextLine());
        System.out.println("Escribe tu piloto favorito: ");
        p.setPilotoFavorito(sc.nextLine());

        System.out.println("Buenos dias : " + p.getNombre() + " " + p.getApellidos() + " con dni: " + String.valueOf(p.getDniSinLetra()) + " y edad:" + String.valueOf(p.getEdad()) + " años");
        System.out.println("Tus estudios son: " + p.getEstudios());
        System.out.println("Tu línea de LoL preferida es: " + p.getLoL());
        System.out.println("Tu color de pelo es: " + p.getColorPelo());
        System.out.println("Tu piloto favorito es " + p.getPilotoFavorito());
    }
}
