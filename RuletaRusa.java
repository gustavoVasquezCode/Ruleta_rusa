import java.io.*;
import java.lang.Math;
import java.util.Random;

public class RuletaRusa{
	
	private String nombre;
	private int edad;
	private String estado = "Vivo";
	int i;
	
	InputStreamReader stream = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(stream);
	
	public void pedirDatos() throws IOException{
		System.out.println("********** <Bienvenido a la Ruleta Rusa> **********");
		System.out.println("--Ingrese sus datos");
		System.out.print("Ingrese el nombre: ");
		nombre = reader.readLine();
		System.out.print("Ingrese la edad: ");
		edad = Integer.valueOf(reader.readLine()).intValue();
	}
	
	private void comprobarEdad(){
		if(edad >= 18)
			System.out.println("\nPuede ingresar al juego, es mayor de edad.");
		else
			System.out.println("\nNo puede ingresar al juego, es menor de edad.");
	}
	
	public void disparar(){
		int numero = 0;
		comprobarEdad();
		if(edad >= 18){
			for(i=0; i<=6; i++)
				numero = (int)(Math.random()*6+1);
			
			System.out.println("\nLa bala salio del numero: " + numero);
			
			if(numero == 4){
				estado = "Muerto";
				System.out.println("El jugador esta: " + estado);
			}
		}
	}
	
	public void mostrarDatos(){
		System.out.println("\n********** -Estado actual del jugador- **********");
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Estado: " + estado);
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
		this.edad = edad;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int getEdad(){
		return edad;
	}
	
	public String getEstado(){
		return estado;
	}
	
}