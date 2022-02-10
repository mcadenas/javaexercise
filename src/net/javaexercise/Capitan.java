package net.javaexercise;

public class Capitan extends Tripulante{
	
	public Capitan(int numeroCarnet, int edad, int tiempoEnLaEmpresa, String nombre, String telefono, char sexo, Barco barco, int horasDeExperticia) {
		setNumeroCarnet(numeroCarnet);
		setEdad(edad);
		setTiempoEnLaEmpresa(tiempoEnLaEmpresa);
		setNombre(nombre);
		setTelefono(telefono);
		setSexo(sexo);
		setBarco(barco);
		HorasDeExperticia = horasDeExperticia;
		Sueldo();
	}
	
	public void CalcularBono() {
		float bonoPorcentaje = 0;
		if (HorasDeExperticia >= 5000 && HorasDeExperticia < 150000) {
			bonoPorcentaje = (float) 0.20;
		}
		if (HorasDeExperticia >= 150000 && HorasDeExperticia < 300000) {
			bonoPorcentaje = (float) 0.40;
		}	
		if (HorasDeExperticia >= 300000) {
			bonoPorcentaje = (float) 0.75;
		}
		setBono(Sueldo * bonoPorcentaje);
	}
	
	@Override
	public void Sueldo() {
		CalcularBono();
		SueldoTotal = Sueldo + Bono;
	}
	
	@Override
	public void MostrarDatos() {
		System.out.println("Datos del Capitan");
		System.out.println("Numero de Carnet: " + getNumeroCarnet());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Sexo: " + getSexo());
		System.out.println("Edad: " + getEdad());
		System.out.println("Telefono: " + getTelefono());
		System.out.println("Tiempo en la Empresa: " + getTiempoEnLaEmpresa() + " años");
		System.out.println("Sueldo Base: " + Sueldo + " Bs.");
		System.out.println("Bono: " + Bono + " Bs.");
		System.out.println("Sueldo Total: " + SueldoTotal + " Bs.\n");
	}
	
	public float getHorasDeExperticia() {
		return HorasDeExperticia;
	}

	public void setHorasDeExperticia(int horasDeExperticia) {
		HorasDeExperticia = horasDeExperticia;
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

	private int HorasDeExperticia;
	final int Sueldo = 4500000;
	private float SueldoTotal;
	private float Bono;

}
