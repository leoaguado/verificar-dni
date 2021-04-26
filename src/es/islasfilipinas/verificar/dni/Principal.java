package es.islasfilipinas.verificar.dni;

public class Principal {

	public static void main(String[] args) {
		
		//Creamos un objeto DNI
		numdni dni01 = new numdni("21446197P");
		
		//Verificamos que es correcto
		System.out.println("¿Es válido el DNI? "+dni01.validardni());

	}

}
