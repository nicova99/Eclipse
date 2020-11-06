import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
public class Ejercicio11 { 
	public static void main(String[] args) { 
		int leidos = 0;
		int suma = 0;
		FileReader fr = null;
		try { fr = new FileReader("D:\\\\nico\\\\ADT ACCESO A DATOS\\\\Workspace\\\\\\\\EjerciciosFicheros\\\\\\\\enteros.txt");
		BufferedReader entrada = new BufferedReader(fr);
		String cadena = entrada.readLine(); 
		int i = 0;
		
		 
			while( i < cadena.length()-1) {
				if(cadena.charAt(i) ==' ') {
					System.out.println();
					i++;
				}
				else {
			System.out.print(cadena.charAt(i));
			leidos++;
			suma = suma + cadena.charAt(i);
			i++;}
		   
			}
			
		
	
		fr.close(); 

		} catch (FileNotFoundException e) { 
			System.out.println(e.getMessage());        
			} catch (IOException e) { System.out.println(e.getMessage());  
			} finally { 
				try { if (fr != null) {
					fr.close();           
					}           
				} catch (IOException e) {
					System.out.println(e.getMessage());  
					}       
				}    
		System.out.println();
		System.out.println("Numeros leidos: "+leidos);
		System.out.println("Suma: "+suma);
		} 
	}  
	