import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio5 {
	public static void main(String[] args)
{   
	String fich=new String("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\EjerciciosFicheros\\texto.txt");
	FileWriter fw=null;
	String palindromo = "Anita, la gorda lagartona, no traga la droga latina";
	try {
		
		fw = new FileWriter(fich); 
		fw.write(palindromo,0,5);
		fw.write(palindromo,5,20);
		fw.write(palindromo,20,31);
		fw.close(); }  
	
	catch (FileNotFoundException e) { 
		
System.out.println(e.getMessage()); } catch(IOException e) {  System.out.println(e.getMessage());      } }
}