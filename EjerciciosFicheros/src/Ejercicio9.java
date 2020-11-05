import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio9 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\\\nico\\\\ADT ACCESO A DATOS\\\\Workspace\\\\\\\\EjerciciosFicheros\\\\\\\\texto.txt");
			PrintWriter salida = new PrintWriter("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\\\EjerciciosFicheros\\\\texto" + "copia.txt"); // se crea el fichero copia
			BufferedReader entrada = new BufferedReader(fr);
			int car = entrada.read(); // se lee el primer carácter del fichero
			salida.print((char)car);
			while (car != -1) { // mientras no se llegue al final del fichero
				System.out.print((char) car); // se nuestra por pantalla
				car = entrada.read(); // se lee el siguiente carácter del fichero
				salida.print((char)car);
				
			}
			salida.flush();
			salida.close();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}