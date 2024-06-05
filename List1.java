package aestudar;

import java.util.ArrayList;
import java.util.Random;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer>  numero = new ArrayList<>() ;
		Random random = new Random ();
		int soma = 0;
		
		for (int i = 0; i <5 ; i++) {
			int numCinco = random.nextInt(100);
			numero.add(numCinco);
		}
		System.out.println("Numeros escolhidos: "+numero);
		
		for (int i : numero ) {
			
			if (i % 2 == 0) {
			soma = soma + i;
			}
			
		
		}
		
		System.out.println("Soma dos pares: "+ soma);
	}

}
