package PP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Restriccion {

	/**
	 * @param args
	 * @throws IOException 
	 */
	boolean obtenienePlaca(String placa, String [] placas){		
		boolean PLACAS=false;
		//Valida si la placa existe
		for(int i=0;i<placas.length;i++){
			if (placa.equalsIgnoreCase(placas[i])){				
				PLACAS=true;
				i=placas.length+1;
			}
			else 
				PLACAS=false;
		}		
		return PLACAS;
	}

	boolean obtenieneDia(String day, String [] dias){
		boolean DIAS=false;
		//Valida si el dia existe		
		for(int i=0;i<dias.length;i++){
			if (day.equalsIgnoreCase(dias[i])){				
				DIAS=true;
				i=dias.length+1;
			}
			else
			DIAS=false;
		}
		
		return DIAS;
	}


	public static void main(String[] args) throws IOException {

		//Creo los objetos de las clases
		vehiculo ob=new vehiculo();
		Auto at=new Auto();
		Restriccion res=new Restriccion();
		BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
		//Ingreso los datos del vehiculo y si se desea se imprime
		ob.matricula="xxx";
		ob.color="Azul";
		ob.modelo="Sedan";

		String [] placas={"PLACA1","PLACA2","PLACA3"};
		String [] dias={"lunes","martes","miercoles","jueves","viernes"};

		//Los siguientes datos estan quemados como datos de configuracion.
		//El usuario administrador establece la placa, dia,tiempo de restricción y hora de inicio "Estos datos pueden ser ingresados por TEXTBOX"
		String placaRestriccion="PLACA1";
		String diaRestriccion="lunes";
		double tiempoRestriccion=2.5;
		double horaInicioRestriccion=8;
		double horaFinRestriccion=horaInicioRestriccion+tiempoRestriccion;
		boolean PLACAS=false;
		boolean DIAS=false;
		boolean TIEMPO=false;


		//Pido los datos por teclado para las pruebas respectivas
		System.out.println("Ingrese la placa");
		String placa=at.placa;
		placa=b.readLine();
		System.out.println("Ingrese el dia");
		String day=b.readLine();
		System.out.println("Ingrese la hora");
		int hour=Integer.parseInt(b.readLine());
		
		//Valida para que el horario sea restringuido hasta antes de media noche y puede restringuirse desde las 0 horas.
		if(horaFinRestriccion<24){
			TIEMPO=true;
		}
		//Compara todo lo anterior devolviendo el resultado
		if(res.obtenienePlaca(placa, placas)==true && res.obtenieneDia(day, dias)==true && hour>=horaInicioRestriccion && hour<=horaFinRestriccion  && TIEMPO==true){			

			System.out.println("El vehiculo ="+ob.matricula+ "  Color= "+ob.color+ "con PLACA N="+placa+"  NO PUEDE CIRCULAR");
		}
		else
			System.out.println("SI PUEDE CIRCULAR");		
		
		
		/*
		 * EJEMPLO PARA SU EJECUCION:
		 * PLACA: placa1
		 * DIA: lunes
		 * HORA: 9 
		 * 
		 * */
		
	}
}
