package net.javaexercise;

public class Barco {
	
	public Barco(String nombre, String tipo, int capacidadDePasajeros, int capacidadDeCarga, GPS gps) {
		Nombre= nombre;
		Tipo = tipo;
		CapacidadDePasajeros = capacidadDePasajeros;
		CapacidadDeCarga = capacidadDeCarga;
		GPS = gps;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public int getCapacidadDeCarga() {
		return CapacidadDeCarga;
	}

	public void setCapacidadDeCarga(int capacidadDeCarga) {
		CapacidadDeCarga = capacidadDeCarga;
	}

	public int getCapacidadDePasajeros() {
		return CapacidadDePasajeros;
	}

	public void setCapacidadDePasajeros(int capacidadDePasajeros) {
		CapacidadDePasajeros = capacidadDePasajeros;
	}

	public GPS getGPS() {
		return GPS;
	}

	public void setGPS(GPS gPS) {
		GPS = gPS;
	}	
	
	public void MostrarDatos() {
		System.out.println("Datos del Barco");
		System.out.println("Nombre: " + Nombre);
		System.out.println("Tipo: " + Tipo);
		System.out.println("Capacidad pasajeros: " + CapacidadDePasajeros);
		System.out.println("Capacidad Almacen: " + CapacidadDeCarga + "Kg.\n");
		GPS.MostrarDatos();
	}
	
	private String Nombre;
	private String Tipo;
	private int CapacidadDePasajeros;
	private int CapacidadDeCarga;
	private GPS GPS;
}
