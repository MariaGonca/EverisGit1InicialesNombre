package mainApplication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		Scanner sc = new Scanner(System.in);
		
		String nombreDesarrollador;
		
		System.out.println("Digame su nombre");
		nombreDesarrollador = sc.next();
		
		System.out.println("Hola " + nombreDesarrollador);
	}

}
