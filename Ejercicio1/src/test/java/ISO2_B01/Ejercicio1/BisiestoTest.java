package ISO2_B01.Ejercicio1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.*;

public class BisiestoTest {
	
	@Test(expected = IllegalArgumentException.class)
	public void crearFecha() {
		try {
			Fecha pObj = new Fecha(2000, 7, 8);
		} catch (IllegalArgumentException e) {
			System.out.println("error al introducir los valores del año mes y día");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void crearFechaIncorrectaUno() {

		try {
			Fecha pObj = new Fecha(2000, -10, 16);
		} catch (IllegalArgumentException e) {
			System.out.println("error al introducir los valores del año mes y día");
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void crearFechaIncorrectaTres() {
		try {
			Fecha pObj = new Fecha(2000, 10, 0);
		} catch (IllegalArgumentException e) {
			System.out.println("error al introducir los valores del año mes y día");
		}

	}
}