public class Fecha {
	
	int dia;
	int mes;
	int ano;
	
	Fecha(){
	
		this.dia=1;
		this.mes=1;
		this.ano=1900;
		
	}
	Fecha(String f){
		String [] fecha=f.split("/");
		this.dia=Integer.valueOf(fecha[0]);
		this.mes=Integer.valueOf(fecha[1]);
		this.ano=Integer.valueOf(fecha[2]);
		
	}
	
	boolean m18(Fecha f1) {
		int aux;
		
		
		aux=this.ano-f1.ano;
		
		if(aux>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		Fecha f1=new Fecha ("12/08/2002");
		Fecha f2=new Fecha ("20/08/2021");
		
		System.out.println(f1.dia+" "+f1.mes+" "+f1.ano);
		System.out.println(f1.m18(f2));
		
		

	}

}
