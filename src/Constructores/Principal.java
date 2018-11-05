package Constructores;

public class Principal {

	public static void main(String[] args) 
	{
	
		ComputadoraEscritorio desk = new ComputadoraEscritorio("HDD 2TB", "ASUS MothrBoard", "SuperDrive", "16 GB DDR3", "NVIDIA GTX1080", "INTEL CORE I7", "SIN SISTEMA DE ENFRIAMIENTO", "EVGA", "COLOR NEGRO CON COLOR AZUL");
		
		ComputadoraEscritorio desk1 = new ComputadoraEscritorio();
		
		//desk1.discoDuro;
		
		//Se inicializa uno a la vez
		
		//ComputadoraEscritorio desk2 = new ComputadoraEscritorio(tarjetaMadre, procesador, gabinete);

	}

}
