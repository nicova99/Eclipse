import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio3 {
	public static void main(String[] args)
{    //Creamos un String para almacenar el nombre del fichero en que escribir
	//Utiliza una ruta en la que puedas crear ficheros en tu equipo 
	String fich=new String("C:\\Temp\\escritext.txt");//Declaramos un objeto de tipo FileWriter 
	
	FileWriter fw=null; try { //Creamos un nuevo objeto de tipo FileWriter
		
		fw = new FileWriter(fich); //Escribimos un n�mero entero que indicar� un car�cter a escribir seg�n el //c�digo ASCII. En este caso el n�mero 65 es la letra A may�scula
		fw.write(65); //Escribimos una cadena 
		
		fw.write("Esto es una prueba de escritura");//Escribimos un salto de l�nea en algunas Sistemas Operativos basta con poner
		// \n y en otros hay que poner \r\n 
		
		fw.write("\r\n"); 
		
		//Escribimos en el fichero parte del String que guarda la ruta del fichero
		
		//En este ejemplo empezamos en la primera posici�n y escribimos 5 caracteres 
		
		fw.write(fich, 0, 5); //En este ejemplo empezamos en la primera 3 y escribimos 4 caracteres
		
		fw.write(fich, 3, 4); //Cerramos el fichero 
		
		fw.close(); } //Capturamos las excepciones de fichero no encontrado y de error de 
	// entrada/salida 
	
	catch (FileNotFoundException e) { 
		
System.out.println(e.getMessage()); } catch(IOException e) {  System.out.println(e.getMessage());      } }
}