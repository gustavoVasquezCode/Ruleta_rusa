import java.io.*;

public class MainRuletaRusa{
	public static void main(String[] args) throws IOException{
		RuletaRusa obj1 = new RuletaRusa();
		obj1.pedirDatos();
		obj1.disparar();
		obj1.mostrarDatos();
	}
}