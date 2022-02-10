package net.javaexercise;

public class JefeDeFlota extends Tripulante{

	public JefeDeFlota(int numeroCarnet, int edad, int tiempoEnLaEmpresa, String nombre, String telefono, char sexo, Barco barco, int pesoPescado, int pesoMariscos) {
		setNumeroCarnet(numeroCarnet);
		setEdad(edad);
		setTiempoEnLaEmpresa(tiempoEnLaEmpresa);
		setNombre(nombre);
		setTelefono(telefono);
		setSexo(sexo);
		setBarco(barco);
		PesoPescado = pesoPescado;
		PesoMariscos = pesoMariscos;
		Sueldo();
	}
	
	@Override
	public void Sueldo() {
		CalcularBonos();
		SueldoTotal = Sueldo + BonoPescado + BonoMariscos;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Datos del Jefe de Flota");
		System.out.println("Numero de Carnet: " + getNumeroCarnet());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Edad: " + getEdad());
		System.out.println("Telefono: " + getTelefono());
		System.out.println("Tiempo en la Empresa: " + getTiempoEnLaEmpresa() + " años");
		System.out.println("Sueldo Base: " + Sueldo + " Bs.");
		System.out.println("Bono por Pescado: " + BonoPescado + " Bs.");
		System.out.println("Bono por Marisco y Molusco: " + BonoMariscos + " Bs.");
		System.out.println("Sueldo Total: " + SueldoTotal + " Bs.\n");
	}	
	
	private void CalcularBonos() {
		BonoPescado = PesoPescado * 1;
		BonoMariscos = PesoMariscos * 2;
	}
	
	private int PesoPescado;
	private int PesoMariscos;
	final int Sueldo = 3500000;
	private float SueldoTotal;
	private float BonoPescado;	
	private float BonoMariscos;	
	
}
