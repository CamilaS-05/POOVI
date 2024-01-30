package ejer_calculadora;

import javax.swing.JOptionPane;

public class calculadora {
	public static void main(String[] args) {
		double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));

		impuestos producto = new impuestos(precioProducto);

		JOptionPane.showMessageDialog(null, producto.getPrecioFinal());

	}

}

class impuestos {
	private double porcentaje;
	private double precioProducto;
	private double precioFinal;

	public impuestos(double precioProducto) {
		this.porcentaje = 0.15;
		this.precioProducto = precioProducto;
		this.precioFinal = 0;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getPrecioFinal() {
		return precioFinal = (porcentaje * precioProducto) + precioProducto;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

}