package ISO2_B01.Ejercicio1;

public class Fecha {
    public int anio;
    public int mes;
    public int dia;
    
	public Fecha(int anio2, int mes2, int dia2) {
		this.anio = anio2;
		this.mes = mes2;
		this.dia = dia2;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
    
}