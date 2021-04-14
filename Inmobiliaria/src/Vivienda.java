
public class Vivienda {

	Direccion direccion;
	int m2;
	int habitaciones;
	int banos;
	boolean garaje;
	boolean trastero;
	
	Vivienda(){
		this.direccion = new Direccion();
		this.m2 = 120;
		this.habitaciones = 3;
		this.banos = 1;
		this.garaje = true;
		this.trastero = false;
		
	}

}
