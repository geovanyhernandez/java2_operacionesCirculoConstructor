import java.util.Scanner;

public class OperacionesCirculo{

public static void main (String args[]) {

double radio, resultadoArea, resultadoCircunferencia;

	Scanner sc = new Scanner(System.in);
	System.out.print("\nIngresa el radio : ");
	radio = sc.nextDouble();


	Circulo operaciones = new Circulo(radio);
	
	resultadoArea = operaciones.Area();
	resultadoCircunferencia = operaciones.Circunferencia();

	System.out.print("\n la area del circulo es : " + resultadoArea);
	System.out.print("\n la circunferencia del circulo es : " + resultadoCircunferencia);

	}
}
