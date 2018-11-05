package HerenciaHibrida;

public class CalcularTresSumDos extends CalcularDosSum{
	
	int c = 15;
	
	public void encontrarTresSum (){
		int resultado = EncontrarDosSum() + c;
		
		System.out.println(resultado);
	}
}

