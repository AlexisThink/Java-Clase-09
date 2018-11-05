package Constructores;



public class ComputadoraEscritorio 
{
	
String discoDuro;
String tarjetaMadre;
String unidadLectora;
String memoriaRAM;
String tarjetaVideo;
String procesador;
String sistemaEnfriamiento;
String fuente;
String gabinete;
public ComputadoraEscritorio(String discoDuro, String tarjetaMadre, String unidadLectora, String memoriaRAM,
		String tarjetaVideo, String procesador, String sistemaEnfriamiento, String fuente, String gabinete) {
	this.discoDuro = discoDuro;
	this.tarjetaMadre = tarjetaMadre;
	this.unidadLectora = unidadLectora;
	this.memoriaRAM = memoriaRAM;
	this.tarjetaVideo = tarjetaVideo;
	this.procesador = procesador;
	this.sistemaEnfriamiento = sistemaEnfriamiento;
	this.fuente = fuente;
	this.gabinete = gabinete;
}
public ComputadoraEscritorio() {
}
public ComputadoraEscritorio(String tarjetaMadre, String procesador, String gabinete) {
	this.tarjetaMadre = tarjetaMadre;
	this.procesador = procesador;
	this.gabinete = gabinete;
}



/*public ComputadoraEscritorio(){
	System.out.println("Dentro de la clase ComputadoraEscritorio");
	int x = 5;
	int y = 10;
	int resultado = x + y;
}*/

}
