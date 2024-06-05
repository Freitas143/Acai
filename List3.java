package aestudar;

import java.util.ArrayList;
import java.util.Random;

public class List3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> frutas = new ArrayList<>();
		Random random = new Random();
		
		
		frutas.add("Morango");
		frutas.add("Pera");
		frutas.add("Uva");
		frutas.add("Banana");
		frutas.add("Jabuticaba");
		frutas.add("Pitaya");
		frutas.add("Tomate");
		frutas.add("Laranja");
		frutas.add("Caqui");
		frutas.add("Manga");
		
		for (int i = 0; i< 5; i++) {
			int num = random.nextInt(10);
			frutas.remove(num);
		}
		System.out.println(frutas.size());
		
		

	}

}
