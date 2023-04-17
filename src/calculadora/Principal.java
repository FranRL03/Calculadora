package calculadora;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0;
		double num = 0.0, num2 = 0.0, res=0.0;
		
		System.out.println("Elige una operación");
		op=Leer.datoInt();
		
		switch(op) {
		
			case 1:
				
				System.out.println("Número 1");
				num=Leer.datoDouble();
				
				System.out.println("Número 2");
				num2=Leer.datoDouble();
				
				res = num+num2;
				
				System.out.println(num + " + " + num2 + " = " + res);
				
				break;
			
				
		
		}

	}

}
