package net.javaexercise;

abstract class Tripulante {
	private int NumeroCarnet;
	private int Edad;
	private int TiempoEnLaEmpresa;
	private String Nombre;
	private String Telefono;
	private char Sexo;
	private Barco barco;
	
	public abstract void Sueldo();
	
	public abstract void MostrarDatos();
	
	public int getNumeroCarnet() {
		return NumeroCarnet;
	}
	public void setNumeroCarnet(int numeroCarnet) {
		NumeroCarnet = numeroCarnet;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public int getTiempoEnLaEmpresa() {
		return TiempoEnLaEmpresa;
	}
	public void setTiempoEnLaEmpresa(int tiempoEnLaEmpresa) {
		TiempoEnLaEmpresa = tiempoEnLaEmpresa;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getTelefono() {
		return Telefono;
	}
	public void setTelefono(String telefono) {
		Telefono = telefono;
	}
	public char getSexo() {
		return Sexo;
	}
	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	public Barco getBarco() {
		return barco;
	}
	public void setBarco(Barco barco) {
		this.barco = barco;
	}
}
