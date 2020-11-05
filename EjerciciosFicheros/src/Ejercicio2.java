import java.io.*;

class Ejercicio2 {
	public static void main(String args[]) throws IOException {
		
		if (args.length > 0) {
			
			for (int i = 0; i < args.length; i++) {
				
				File f = new File(args[i]);
			    System.out.println( "Nombre: "+f.getName() ); 
			    System.out.println( "Camino: "+f.getPath() ); 
				System.out.println("Camino absoluto: " + f.getAbsolutePath());
				System.out.println("Padre: " + f.getParent());
			    System.out.println("Ultima modificacion: " + f.lastModified()); 
			    File hola = new File("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\EjerciciosFicheros\\hola.txt");
			    File hola2 = new File("D:\\nico\\ADT ACCESO A DATOS\\Workspace\\EjerciciosFicheros\\hola2.txt");
			    
			    hola.renameTo(hola2);
			   
			    
				
				if (f.exists()) {
					System.out.print("Fichero existente ");
					System.out.print((f.canRead() ? " y se puede Leer" : ""));
					System.out.print((f.canWrite() ? " y se puede Escribir" : ""));

					System.out.println(".");
					System.out.println("La longitud del fichero son " + f.length() + " bytes");
				}
				else
					System.out.println("El fichero no existe.");

			}
		} 
		else
			System.out.println("Debe indicar un fichero.");
	}
} 