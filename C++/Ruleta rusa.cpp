#include<iostream>
#include<stdlib.h>
#include<time.h>
using namespace std;

class Jugador{
	private:
		string nombre;
		int edad;
		string estado;

	public:
		//métodos set()
		void setEstado(string);
		//métodos get()
		string getNombre();
		int getEdad();
		string getEstado();
		//métodos de la clase
		void pedirDatos(string, int);
		void comprobarEdad();
		void disparar();
		void mostrarDatos();
};

void Jugador::pedirDatos(string _nombre, int _edad){
	nombre = _nombre;
	edad = _edad;
	estado = "Vivo";
}

void Jugador::comprobarEdad(){
	if(Jugador::getEdad() >= 18){
		cout << "Podra entrar al juego" << endl;
	}
	else{
		cout << "Es menor de edad, no puede jugar" << endl;
	}
}

void Jugador::disparar(){
	int num, i;
	srand(time(NULL));
	
	if(Jugador::getEdad() >= 18){
		for(i=1; i<=6; i++){
			num = 1 + rand() % (7-1);
		}
		cout << "Numero: " << num << endl;
		if(num == 4){
			estado = "muerto";
		}
	}
}

void Jugador::mostrarDatos(){
	cout << "\n*****Datos del Jugador*****" << endl;
	cout << "Nombre: " << nombre << endl;
	cout << "Edad:  " << edad << endl;
	cout << "Estado: " << estado << endl;
}

string Jugador::getNombre(){
	return nombre;
}

int Jugador::getEdad(){
	return edad;
}

string Jugador::getEstado(){
	return estado;
}

int main(){
	string nombreJugador;
	int edadJugador;
	Jugador obj1;
	
	cout << "********** Bienvenido a la ruleta rusa **********" << endl;
	cout << "Da enter para ingresar los datos del jugador: " << endl;
	system("pause");
	cout << "Ingrese el nombre: ";
	cin >> nombreJugador;
	cout << "Ingrese la edad del jugador: ";
	cin >> edadJugador;
	obj1.pedirDatos(nombreJugador, edadJugador);
	obj1.comprobarEdad();
	obj1.disparar();
	obj1.mostrarDatos();
	
	system("pause");
	return 0;
}
