import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5b {
	public static void main(String[] args)
{   
	String fich=new String("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\EjerciciosFicheros\\texto.txt");
	FileWriter fw=null;
	String palindromo = "Anita, la gorda lagartona, no traga la droga latina";
	try {
		
		fw = new FileWriter(fich); 
		
	
		for (int i = palindromo.length()-1;i>=0;i--) {
			
		fw.write(palindromo.charAt(i));
		}
	
		fw.close(); }  
	
	catch (FileNotFoundException e) { 
		
System.out.println(e.getMessage()); } catch(IOException e) {  System.out.println(e.getMessage());} }
}