package aestudar;

import java.util.ArrayList;
import java.util.Random;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numeros = new ArrayList<>();
		
		
		Random random = new Random();
		
		for (int i = 0; i< 5; i++) {
			int numeroAleatorio = random.nextInt(100);
			numeros.add(numeroAleatorio);
		}
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
	}

}
