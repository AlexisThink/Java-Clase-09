package HerenciaMultinivel;

public class CalcularTresSum extends CalcularDosSum{
	
	int c = 3;
	
	public int encontrarTresSum (){
		int resultado = EncontrarDosSum() + c;
		
		return resultado;
	}
}

