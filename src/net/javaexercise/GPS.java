package net.javaexercise;

public class GPS {

	public GPS(String coordenadaX, String coordenadaY, String fecha, String hora, int diasTripulado) {
		CoordenadaX = coordenadaX;
		CoordenadaY = coordenadaY;
		Fecha = fecha;
		Hora = hora;
		DiasTripulado = diasTripulado;		
	}
	
	public String getCoordenadaX() {
		return CoordenadaX;
	}
	public void setCoordenadaX(String coordenadaX) {
		CoordenadaX = coordenadaX;
	}

	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public String getCoordenadaY() {
		return CoordenadaY;
	}

	public void setCoordenadaY(String coordenadaY) {
		CoordenadaY = coordenadaY;
	}

	public String getHora() {
		return Hora;
	}

	public void setHora(String hora) {
		Hora = hora;
	}

	public int getDiasTripulado() {
		return DiasTripulado;
	}

	public void setDiasTripulado(int diasTripulado) {
		DiasTripulado = diasTripulado;
	}

	public void MostrarDatos() {
		System.out.println("Datos de Ubicacion GPS");
		System.out.println("Coordennada en X: " + CoordenadaX);
		System.out.println("Coordennada en Y: " + CoordenadaY);
		System.out.println("Dias tripulados: " + DiasTripulado);
		System.out.println("Fecha de Registro: " + Fecha);
		System.out.println("Hora de Registro: " + Hora + "\n");
	}
	
	private String CoordenadaX;
	private String CoordenadaY;
	private String Fecha;
	private String Hora;
	private int DiasTripulado;
	
}
