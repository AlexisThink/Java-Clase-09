package HerenciaMultinivel;

public class EncontrarCuatroSum extends CalcularTresSum{
	
	int d = 7;
	
	public void encontrarCuatroSum (){
		int e = encontrarTresSum() + d;
	
		System.out.println(e);
	
	}

}
