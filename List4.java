package aestudar;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> carros = new ArrayList <>();
		
		carros.add("XC60");
		carros.add("Civic");
		carros.add("City");
		carros.add("Golf");
		carros.add("Gol 1.6");
		carros.add("Uno");
		carros.add("Corsa");
		carros.add("X1");
		carros.add("CLA200");
		carros.add("Kwid");
		
		int posicao = sc.nextInt();
		
		
		System.out.println(carros.get(posicao));
		
		
		sc.close();
		
		

	}

}
