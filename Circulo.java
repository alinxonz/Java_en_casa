import java.util.Scanner;

public class Circulo {
  
	public static void main(String[] args) {
	double area,radio;
	
	
	System.out.println("Introduzca el radio de un circulo: ");
	Scanner Entrada=new Scanner (System.in);
	radio=Entrada.nextDouble();
	area=Math.PI*(radio*radio);
	
	System.out.println("El radio de un Circulo "+radio+"su area es:"+area);
	}
	
}
