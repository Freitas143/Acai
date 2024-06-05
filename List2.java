package aestudar;

import java.util.ArrayList;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> num = new ArrayList<>();
		
		int soma = 0;
		
		num.add(-2);
		num.add(2);
		num.add(-40);
		num.add(-90);
		num.add(90);
		num.add(98);
		num.add(13);
		num.add(1);
		num.add(-54);
		num.add(34);
		num.add(23);
		
		for (int i : num){
			if (i < 0) {
			soma = soma + i;
			}
		}
		
		System.out.println("A soma dos numeros negativos: "+soma);


	}

}
