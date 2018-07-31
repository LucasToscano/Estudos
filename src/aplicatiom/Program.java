package aplicatiom;

import java.util.Locale;
import java.util.Scanner;

import entiti.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro:");
		int n =sc.nextInt();
		Products[] vect = new Products[n];//<-- lembrando que não e pq ta instanciado aqui, que dentro do [] n terei q instanciar tbm igual na linha 27
		
		for(int i=0;i<vect.length;i++) 
		{
			sc.nextLine();//< isso daqui ta aqui para quebrar a linha do next int la em cima
			System.out.println("Digite o nome do produto:");
			String productName = sc.nextLine();
			
			System.out.println("Digite o preço do produto:");
			double productPrice = sc.nextDouble();
			
			vect[i] = new Products(productName,productPrice);
		}
		double soma=0;
		for(int i=0;i<vect.length;i++) {
			soma+=vect[i].getPrice();
		}
		soma=soma/vect.length;
		System.out.printf("Media dos produtos: %.02f%n",soma);
		sc.close();

	}

}
