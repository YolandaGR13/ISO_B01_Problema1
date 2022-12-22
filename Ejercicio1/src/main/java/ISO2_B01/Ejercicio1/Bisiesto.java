package ISO2_B01.Ejercicio1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Bisiesto {
	private Calendar calendario;

	public static void main(String[] args) {
		int anio = 1200;
		int mes = 4;
		int dia = 5;
		boolean bisiesto = false;
		Fecha f = new Fecha(anio, mes, dia);
		
		if (anio > 0 && (mes >= 1 || mes <= 12) && (dia > 0 && dia <= 31)) {
			int anioCifras = f.getAnio() % 100;
			if (anioCifras % 4 == 0 && anio % 100 != 0) {
				bisiesto = true;
				System.out.println("Es bisiesto");
			}
			else if (anioCifras % 4 == 0 && anio % 100 == 0 && anio % 400 == 0) {
				bisiesto = true;
			System.out.println("No es bisiesto");
			}
		} else
			System.out.println("fecha erronea");
	}
}