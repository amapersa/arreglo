package arreglos;

public class Arregloprueba {

	public static void main(String[] args) {
	
		int[]miarreglo=new int[3];
		int menor=0;
		int mayor=0;
		
			
			miarreglo[0]=6;
			miarreglo[1]=1;
			miarreglo[2]=7;
			
				// realizar el mayor
				for (int i = 0; i < miarreglo.length; i++) {
					
					if (mayor <miarreglo[i]) {
						mayor = miarreglo[i];						
					}
						
					
					}
                      for (int i = 0; i < miarreglo.length; i++) {
					
					if (menor > mayor) {
						menor = mayor;
						
					
			
						
					}
						
					
					}
							
				
				System.out.println("Elemento en indice  0: " + miarreglo[0]);
				System.out.println("elemento en indice  1: " +miarreglo [1]);
				System.out.println("Elemento en indice  2: " + miarreglo[2]);
				
				System.out.println("el numero MAYOR  es :" +mayor);
				System.out.println("el numero MENOR  es :" +menor);
				
				
				
				
				}
				
	}
			
		
		
		
		

	


