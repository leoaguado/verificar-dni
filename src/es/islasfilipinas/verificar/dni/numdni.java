package es.islasfilipinas.verificar.dni;

public class numdni {

	public String dni;
	
	
	//Constructor
	public numdni(String dni) {
		this.dni = dni;
	}
	
	//M�todos
	public boolean validardni() {
	
			String letraMayus; 
			letraMayus = (this.dni.substring(8)).toUpperCase();
			if(comprobarnum() == true && valorletra().equals(letraMayus)) {
				return true;
			}
			else {
				return false;
			}
	}
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
