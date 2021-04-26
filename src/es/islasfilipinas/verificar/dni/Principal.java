package es.islasfilipinas.verificar.dni;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Insertamos el valor del dni por consola mediante un scanner
		System.out.print("Introduce un dni para validar: ");
		String valordni = sc.nextLine();
		sc.close();
		
		//Creamos un objeto DNI
		numdni dni01 = new numdni(valordni);
		
		//Verificamos que es correcto y se muestra por pantalla
		System.out.println("Resultado de la validación: "+dni01.validardni());

	}

}
