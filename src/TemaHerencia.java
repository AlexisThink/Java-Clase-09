
public class TemaHerencia {

	public static void main(String[] args) 
	{
	Persona prs = new Persona();
	prs.nombre = "Alexis Olveres";
	prs.edad = 21;
	prs.domicilio = "Privada 21";
	prs.curp = "OEMA";		
		
	Empleado emp = new Empleado();
	emp.nombre = "Miriam";
	emp.edad = 22;
	emp.domicilio = "Sur 109";
	emp.curp = "VALE";
	
	emp.sueldo = 5000;
	emp.numeroEmpleado = 24;
	emp.rango = "Junior";
	emp.jefe = "Rodrigo";
	
	Administrativo adm = new Administrativo();
	adm.nombre = "Anahi";
	adm.edad = 21;
	adm.domicilio = "Calle 3";
	adm.curp = "AMGR";
	
	adm.sueldo = 3000;
	adm.numeroEmpleado = 9;
	adm.rango = "Junior";
	adm.jefe = "Rodrigo";
	
	adm.cubiculo = "03-96";
	adm.extencion = 107;
	adm.correo = "ddyponleplay@correo.com";
	
	Operativo oper = new Operativo();
	oper.nombre = "Marelyn";
	oper.edad = 25;
	oper.domicilio = "Indios Verdes";
	oper.curp = "MVRG";
	
	oper.sueldo = 2600;
	oper.numeroEmpleado = 11;
	oper.rango = "Junior";
	oper.jefe = "Rodrigo";
	
	oper.maquina = "Low-V5";
	oper.casillero = 302;
	
	System.out.println(prs.nombre);
	System.out.println(emp.nombre);
	System.out.println(adm.nombre);
	System.out.println(oper.nombre);
	
	}

}
