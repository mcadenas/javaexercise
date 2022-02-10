package net.javaexercise;

public class Principal {

	public static void main(String[] args) {
		GPS gps = new GPS("8'25'10", "9'30'15", "17/08/2021", "17:25", 30);
		Barco barco = new Barco("Titanic", "Pesquero", 10, 30000, gps);
		Capitan capitan = new Capitan(995, 20, 20, "Yesenia", "0414-456321", 'F', barco, 400000);
		JefeDeFlota jefeDeFlota = new JefeDeFlota(187, 23, 15, "Nataly", "0416-456123", 'F', barco, 93000, 8100);
		Marinero[] marineros = new Marinero[2];
		marineros[0] = new Marinero(779, 31, 10, "Osman", "0224-456321", 'M', barco, 10000);
		marineros[1] = new Marinero(879, 25, 8, "Mariangel", "0224-456321", 'F', barco, 20000);
		
		System.out.println("Control de Personal y Pago");
		System.out.println("Marejada Feliz c.a\n");
		barco.MostrarDatos();
		
		System.out.println("Datos de la Tripulación:\n");
		capitan.MostrarDatos();
		jefeDeFlota.MostrarDatos();
		
		for (Marinero marinero : marineros) {
			marinero.MostrarDatos();
		}
		
	}

}
