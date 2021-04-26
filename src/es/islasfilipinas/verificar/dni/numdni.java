package es.islasfilipinas.verificar.dni;

public class numdni {

	public String dni;

	//Constructor
	public numdni(String dni) {
		this.dni = dni;
	}
	
	//Métodos
	public boolean validardni() {
	
			String letraMayus; 
			
			//Se comprueba que la longitud es correcta y que la letra está al final
			if(dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false) {
				return false;
			}
			
			letraMayus = (this.dni.substring(8)).toUpperCase();
			//Después de hacer los calculos se determina si es válido
			if(comprobarnum() == true && valorletra().equals(letraMayus)) {
				return true;
			}
			else {
				return false;
			}
	}
	
	//En este método se comprueba que la estructura es correcta
	private boolean comprobarnum() {

		String numerodni;
		String midni = "";
		String[] numeros = {"0","1","2","3","4","5","6","7","8","9"};

		for(int i = 0; i < this.dni.length() - 1; i++) {
			numerodni = this.dni.substring(i, i+1);

			for(int j = 0; j < numeros.length; j++) {
				if(numerodni.equals(numeros[j])) {
					midni += numeros[j];
				}
			}
		}
		if(midni.length() != 8) {
			return false;
		}
		else {
			return true;
		}
	}
	
	//A partir de este método se obtiene el valor de la letra
	private String valorletra() {
		int ndni = Integer.parseInt(this.dni.substring(0,8));
		int resto = 0;
		String letradni = "";
		String[] asignarLetra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

		resto = ndni % 23;
		letradni = asignarLetra[resto];
		return letradni;
	}
}
