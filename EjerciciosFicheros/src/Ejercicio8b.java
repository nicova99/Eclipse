import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class Ejercicio8b { 
	public static void main(String[] args) { 
		FileReader fr = null;
		try { fr = new FileReader("D:\\\\nico\\\\ADT ACCESO A DATOS\\\\Workspace\\\\\\\\EjerciciosFicheros\\\\\\\\texto.txt");
		BufferedReader entrada = new BufferedReader(fr);
		PrintWriter salida = new PrintWriter("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\\\EjerciciosFicheros\\\\texto" + "copia.txt"); // se crea el fichero copia
		String cadena = entrada.readLine(); //se lee la primera línea del fichero
		salida.println(cadena);
		
		
		while (cadena != null) {  //mientras no se llegue al final del fichero 
			System.out.println(cadena); //se nuestra por pantalla
		
			cadena = entrada.readLine(); //se lee la siguiente línea del fichero   
			salida.println(cadena);
			} 
		fr.close(); 
		salida.flush();
		salida.close();
		
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
		} 
	}  
	