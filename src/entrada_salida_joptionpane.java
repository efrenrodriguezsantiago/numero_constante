import java.util.Scanner;

import javax.swing.JOptionPane;

public class entrada_salida_joptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		int entero;
		char letra;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("digite una cadena ");//imprimecadena
		
		entero = Integer.parseInt(JOptionPane.showInputDialog("digite un entero "));
		
		letra = JOptionPane.showInputDialog("digite una letra ").charAt(0);
		
		decimal = Double.parseDouble(JOptionPane.showInputDialog("digite un numero decimal "));
		
		JOptionPane.showConfirmDialog(null, "la cadena es: "+cadena);
		JOptionPane.showConfirmDialog(null, "el entero es: "+entero);
		JOptionPane.showConfirmDialog(null, "la letra es: "+letra);
		JOptionPane.showConfirmDialog(null, "el decimal: "+decimal);
		
		
		
		
		
	}

}
