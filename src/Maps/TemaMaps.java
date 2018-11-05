package Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TemaMaps {

	public static void main(String[] args)
	{
		/*
		 * Declaracion de un Map (HashMap) con clave Integer y valor  String
		 * Las claves pueden ser de cualquier tipo de dato aunque los mas utilizado como clave son: String, Integer y Double
		  */
		
		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		nombreMap.size(); //Devuelve el numero de elementos del map
		nombreMap.isEmpty(); //Devuelve true si no hay elemntos en el
		
		//nombreMap.put(K Clave, V Valor); //AÑADE UN ELEMNTO AL MAP
		
		//nombreMap.get(K Clave); //Devuelve el valor de la clave ue se le pasa como parametro
		
	/*	nombreMap.clear(); //BORRA TODO LOS COMPONENTES DEL MAP
		
		nombreMap.remove(K Clave ); //BORRA EL PAR CLAVE/VALOR DE LA CLAVE QUE SE LE PASA COMO PARAMETRO
		
		nombreMap.containsKey(K Clave); //DEVUELVE TRUE SI EN EL MAP HAY UNA CLAVE QUE COINCIDE
		
		nombreMap.containsValue(V Valor); //DEVUELVE TRUE SI EN EL MAP HAY UN VALOR COINCIDE
		
		nombreMap.values(); //DEVUELVE UNA COLECCION CON LOS VALORES DEL MAP
*/		
		/*
		 * EXISTN TRES TIPOS DE MAPS
		 * 
		 * 1RO HASHMAP: LOS ELEMNTOS QUE INSERTAN EN EL MAP NO TENDRAN UN ORDEN ESPECIFICO
		 * 2DO TREEMAP: EL MAPA LO ORDENA DE FORMA NATURAL; POR EJEMPLO SI LA CLAVE SON VALORES ENTEROS LOS ORDENA DE MENOR A MAYOR
		 * 3RO LINKED: INSERTA EN EL MAPA EN EL ORDEN EN EL QUE SE VAN INSERTANDO; ES DECIR, QUE NO TIENEN UNA ORDENACION DE LOS ELEMENTOS 
		 * COMO TAL POR LO TNTO ESTA CLASE REALIZA LA BUSQUEDA DE LOS LEMENTO DE FORMA MAS LENTA
		 * 
		 */
		
		
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(16, "Alexis");
		hashmap.put(45, "Miguel");
		hashmap.put(33, "Mario");
		hashmap.put(42, "Sergio");
		
		Iterator<Integer> it= hashmap.keySet().iterator();
		
		while(it.hasNext()){
			Integer key = it.next();
			System.out.println("Clave " + key + "-Valor: " + hashmap.get(key));
			
		}
		System.out.println("******");
		
Map<Integer, String> treemap = new TreeMap<Integer, String>();
		
	treemap.put(16, "Alexis");
	treemap.put(45, "Miguel");
	treemap.put(33, "Mario");
	treemap.put(42, "Sergio");
		
		it= hashmap.keySet().iterator();
		
		while(it.hasNext()){
			Integer key = it.next();
			System.out.println("Clave " + key + "-Valor: " + treemap.get(key));
		}
		
			
			System.out.println("******");	
			
			
			Map<Integer, String> linkedHashmap = new LinkedHashMap<Integer, String>();
			
			linkedHashmap.put(16, "Alexis");
			linkedHashmap.put(45, "Miguel");
			linkedHashmap.put(33, "Mario");
			linkedHashmap.put(42, "Sergio");
				
				it= hashmap.keySet().iterator();
				
				while(it.hasNext()){
					Integer key = it.next();
					System.out.println("Clave " + key + "-Valor: " + linkedHashmap.get(key));
		
	//FOR EADGE 
			for(Entry<Integer, String> alumnos: linkedHashmap.entrySet()){
				Integer clave= alumnos.getKey();
				String valor = alumnos.getValue();
				
				System.out.println(clave + "->" + valor);
			}		

}
}
}