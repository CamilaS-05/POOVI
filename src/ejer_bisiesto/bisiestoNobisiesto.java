package ejer_bisiesto;

import javax.swing.JOptionPane;

public class bisiestoNobisiesto {
	public static void main(String[] args) {
		int año = Integer.parseInt(JOptionPane.showInputDialog("Introduce un año"));

		bisiesto años = new bisiesto(año);

		JOptionPane.showMessageDialog(null, años.bisiestoNobisiesto());

	}

}

class bisiesto {
	private final int num1, num2, num3, num4;
	private int año;

	public bisiesto(int año) {
		this.num1 = 4;
		this.num2 = 100;
		this.num3 = 400;
		this.num4 = 0;
		this.año = año;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int getNum3() {
		return num3;
	}

	public String bisiestoNobisiesto() {
		if (((año % num1 == num4 && año % num2 != num4) || (año % num3 == num4))) {
			return "El año es bisiesto";
		} else {
			return "El año no es bisiesto";
		}

	}
}
