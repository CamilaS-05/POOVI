package ejer_comprobador;

import javax.swing.JOptionPane;

public class comprobador {
	public static void main(String[] args) {
		int comprobador = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad "));

		edad mayorEdad = new edad(comprobador);

		JOptionPane.showMessageDialog(null, mayorEdad.edadM());

	}

}

class edad {
	private final int edadM;
	private int comprobador;

	public edad(int comprobador) {
		this.edadM = 18;
		this.comprobador = comprobador;

	}

	public int getComprobador() {
		return comprobador;
	}

	public void setComprobador(int comprobador) {
		this.comprobador = comprobador;
	}

	public int getEdadM() {
		return edadM;
	}

	public String edadM() {
		if (edadM <= comprobador) {
			return "Es mayor de edad ";
		} else {
			return "No es mayor de edad, por tanto no puede votar.";
		}
	}

}
