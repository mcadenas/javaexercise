package net.javaexercise;

public class Marinero extends Tripulante{

	public Marinero(int numeroCarnet, int edad, int tiempoEnLaEmpresa, String nombre, String telefono, char sexo, Barco barco, int pesoPescado) {
		setNumeroCarnet(numeroCarnet);
		setEdad(edad);
		setTiempoEnLaEmpresa(tiempoEnLaEmpresa);
		setNombre(nombre);
		setTelefono(telefono);
		setSexo(sexo);
		setBarco(barco);
		PesoPescado = pesoPescado;
		Sueldo();		
	}
	
	@Override
	public void Sueldo() {
		CalcularBonos();
		SueldoTotal = Sueldo + Bono;
	}

	@Override
	public void MostrarDatos() {
		System.out.println("Datos del Marinero");
		System.out.println("Numero de Carnet: " + getNumeroCarnet());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Edad: " + getEdad());
		System.out.println("Telefono: " + getTelefono());
		System.out.println("Tiempo en la Empresa: " + getTiempoEnLaEmpresa() + " años");
		System.out.println("Monto del bono: " + Bono);
		System.out.println("Sueldo Total: " + SueldoTotal + " Bs.\n");		
	}

	private void CalcularBonos() {
		float bonoPorcentaje = 0;
		if (PesoPescado >= 1) {
			bonoPorcentaje = (float) 0.25;
		}
		setBono(Sueldo * bonoPorcentaje);
	}	
	
	public int getPesoPescado() {
		return PesoPescado;
	}

	public void setPesoPescado(int pesoPescado) {
		PesoPescado = pesoPescado;
	}

	public float getBono() {
		return Bono;
	}

	public void setBono(float bono) {
		Bono = bono;
	}

	public float getSueldoTotal() {
		return SueldoTotal;
	}

	public void setSueldoTotal(float sueldoTotal) {
		SueldoTotal = sueldoTotal;
	}

	private int PesoPescado;
	final int Sueldo = 90000;
	private float SueldoTotal;
	private float Bono;
	
}
