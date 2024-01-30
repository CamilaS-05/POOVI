package ejer_descuentos;

import javax.swing.JOptionPane;

public class descuentos {
	public static void main(String[] args) {
		double precioProducto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio del producto"));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la cantidad de producto"));

		descuento numero = new descuento(precioProducto, cantidad);

		JOptionPane.showMessageDialog(null, numero.getprecioFinal());

	}

}

class descuento {
	private final double porcentaje;
	private double precioProducto;
	private int cantidad;

	public descuento(double precioProducto, int cantidad) {
		this.porcentaje = 0.10;
		this.precioProducto = precioProducto;
		this.cantidad = cantidad;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getProcentaje() {
		return porcentaje;
	}

	public double getprecioFinal() {
		if (cantidad > 5) {
			return (cantidad * precioProducto) - ((cantidad * precioProducto) * porcentaje);
		} else {
			return cantidad * precioProducto;
		}
	}

}
