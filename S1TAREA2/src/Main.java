import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion=-1;
		
	Venta venta = new Venta();
		do  {
		opcion= introNumInt("Introduzca\n0 para salir del programa"
				+ "\n1 para ingresar productos\n2 para terminar venta");
			if (opcion==1) {
				venta.setProducto(introCadena("Introduzca el nombre del producto :"),introNumDouble("el precio del producto  € "));
			} else if (opcion==2) {
				
			try {	System.out.println("El total de la venta es € " +venta.calcularTotal());
			} 	catch  (VentaVaciaException e) {
				System.out.println(e.getMessage());
				}
			}
		}while (opcion!=0);
		System.out.println("fin del programa");
	}

	static String introCadena(String texto)  {
		Scanner input= new Scanner(System.in);
		System.out.print(texto);
		return input.nextLine(); 
	}
	static int introNumInt(String texto)  {
		Scanner input= new Scanner(System.in);
		System.out.print(texto);
		return input.nextInt(); 
	}
	static double introNumDouble(String texto)  {
		Scanner input= new Scanner(System.in);
		System.out.print("Introduzca " + texto + ":");
		return input.nextDouble(); 
	}
}
