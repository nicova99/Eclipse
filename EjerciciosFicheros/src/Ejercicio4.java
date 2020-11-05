import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio4 {
	public static void main(String[] args)
{   
	String fich=new String("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\EjerciciosFicheros\\texto.txt");
	FileWriter fw=null;
	try {
		
		fw = new FileWriter(fich); 
		fw.write(78); 
		fw.write(73); 
		fw.write(67); 
		fw.write(79); 
		fw.write(76); 
		fw.write(65); 
		fw.write(83); 
		
		fw.close(); }  
	
	catch (FileNotFoundException e) { 
		
System.out.println(e.getMessage()); } catch(IOException e) {  System.out.println(e.getMessage());      } }
}