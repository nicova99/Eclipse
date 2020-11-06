import java.io.DataOutputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.Scanner; 


public class Ejercicio13 {
	public static void main(String[] args) {      
		Scanner sc = new Scanner(System.in); 
		FileOutputStream fos = null; 
		DataOutputStream salida = null; 
		float n;
		try { fos = new FileOutputStream("/ficheros/datos.dat"); 
		salida = new DataOutputStream(fos); 
		System.out.print("Introduce número float. -1.0 para acabar: ");    
		n = sc.nextFloat();
		while (n != -1.0) { 
			salida.writeFloat(n); //se escribe el número entero en el fichero 
			System.out.print("Introduce número float. -1.0 para acabar: ");
			n = sc.nextFloat();    
			}       
		}
		catch (FileNotFoundException e) { System.out.println(e.getMessage()); 
		} catch (IOException e) { System.out.println(e.getMessage());        
		} finally { try { if (fos != null) { fos.close();             
		} if (salida != null) { salida.close();             
		}           
		} catch (IOException e) { System.out.println(e.getMessage());     
		}      
	}   
	} 
	} 

