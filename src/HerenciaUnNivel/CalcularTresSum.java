package HerenciaUnNivel;

public class CalcularTresSum extends CalcularDosSum{
	
	int c = 3;
	
	public void encontrarTresSum (){
		int resultado = EncontrarDosSum() + c;
		
		System.out.println(resultado);
	}
}

