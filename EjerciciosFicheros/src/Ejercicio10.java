import java.io.File; 
import java.io.FileNotFoundException; 
import java.util.Scanner; 
public class Ejercicio10 { 
	public static void main(String[] args) {
		File f = new File("D:\\\\nico\\\\ADT ACCESO A DATOS\\\\Workspace\\\\\\\\EjerciciosFicheros\\\\\\\\texto.txt");         
		String cadena; Scanner entrada = null; 
		try { entrada = new Scanner(f); //se crea un Scanner asociado al fichero 
		while (entrada.hasNext()) { //mientras no se alcance el final del fichero 
			cadena = entrada.nextLine(); //se lee una l�nea del fichero 
			System.out.println(cadena); //se muestra por pantalla            
			}         } catch (FileNotFoundException e) { System.out.println(e.getMessage());       
			} finally{ entrada.close();         }      
		} 
}