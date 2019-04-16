import java.util.Scanner;
public class Ejercicio1
	{
	public static void main (atrong []ar)
		{
		Scanner teclado=new Scanner(System.in);
		//Declaracion de variables
		float resul1;
		float resul2;
		float resul3;
		float resul4;
		float num1;
		float num2;
		//Introduccion de datos
		System out=print("Ingrese el primer numero:");
		num1=teclado.next float();
		System.out.print ("Ingrese el segundo numero:");
		num2= teclado.next float();
		System.out.print("A continuación se le mostrara la suma, resta, multiplicacion y division de los numeros que acaba de ingresar");
		// Suma
		resul1=num1+num2;
		System.out.print("El resultado de la suma de los numeros es: "+resul1);
		// Resta
		resul2=num1-num2;
		System.out.print("El resultado de la resta de los numeros es: "+resul2);
		// Multiplicacion
		resul3=num1*num2;
		System.out.print("El resultado de la multiplicacion de los numeros es: "+resul3);
		// Division
		resul4=num1/num2;
		System.out.print("El resultado de la division de los numeros es: "+resul4);
		}
	}