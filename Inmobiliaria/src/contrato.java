import java.util.Scanner;

public class contrato {

	Fecha fecha;
	Vivienda vivienda;
	Float importe;	
	Persona arrendatario;
	Persona arrendador;
	
	contrato(){
		
		this.fecha = new Fecha();
		this.vivienda = new Vivienda();
		this.arrendatario = new Persona();
		this.arrendador = new Persona();
		
	}
	
	public static void main(String[] args) {
		
		int opcion;
		Scanner teclado1=new Scanner(System.in);
		
		do {
			System.out.println("1-Introducir datos de un nuevo contrato:");
			System.out.println("0-Salir:");
			opcion=teclado1.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				break;
				
			case 0:
			
			    break;
			
			
			}
			
			teclado1.close();
		}while(opcion!=0);

	}

}
