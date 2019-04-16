import java.util.Scanner;
public class Ejercicio2
	{
	public static void main (atrong []ar)
		{
		Scanner teclado=new Scanner(System.in);
		//Declaracion de variables
		String alumno;
		float nota1;
		float nota2;
		float nota3;
		float promedio;
		//Introdusccion de datos
		System out=print("Bienvenido, ingrese el nombre del alumno:");
		alumno=teclado.next String();
		System.out.print ("Ingrese la nota de la primer evaluacion:");
		nota1= teclado.next float();
		System.out.print ("Ingrese la nota de la segunda evaluacion:");
		nota2= teclado.next float();
		System.out.print ("Ingrese la nota de la tercer evaluacion:");
		nota3= teclado.next float();
		//Promedio
		promedio=(nota1+nota2+nota3)/3;
		System.out.print("El promedio de "+alumno+" es "+promedio);
		}
	}