package ejer_conversor;

import javax.swing.JOptionPane;

public class conversor {
	public static void main(String[] args) {
		double Celcius = Double.parseDouble(JOptionPane.showInputDialog("Introduce una temperatura en Celcius"));

		conversion numero = new conversion(Celcius);

		JOptionPane.showMessageDialog(null, numero.conversor());

	}

}

class conversion {
	private final double conversion;
	private final double ajuste;
	private double Celcius;

	public conversion(double Celcius) {
		this.conversion = 1.8;
		this.ajuste = 32;
		this.Celcius = Celcius;
	}

	public double getCelcius() {
		return Celcius;
	}

	public void setCelcius(double celcius) {
		Celcius = celcius;
	}

	public double getConversion() {
		return conversion;
	}

	public double getAjuste() {
		return ajuste;
	}

	public double conversor() {
		return (Celcius * conversion) + ajuste;
	}
}
