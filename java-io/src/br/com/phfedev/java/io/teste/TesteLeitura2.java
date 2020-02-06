package br.com.phfedev.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("contas.csv"));

		ArrayList<String> contasJuntas = new ArrayList<String>();
		ArrayList<String> contasSeparadas = new ArrayList<String>();

		// System.out.println(scanner.nextLine());
		int cont = 0;
		while (scanner.hasNext()) {
			contasJuntas.add((String) scanner.nextLine());
			Scanner scanLinha = new Scanner(contasJuntas.get(cont));
			scanLinha.useDelimiter(",");

			String valorFormatado = String.format(new Locale("pt","BR") ,"Tipo de conta:%s%n%s %n%s %n%s %n%1.2f", 
														scanLinha.next(), scanLinha.next(),
														scanLinha.next(), scanLinha.next(), scanLinha.nextDouble());

//			contasSeparadas.add("\nTipo de conta: "+scanLinha.next()+"\nNúmero da Conta: "+scanLinha.next()+""
//					+ "\nAgencia: "+scanLinha.next()+"\nNome do Titular: "+scanLinha.next()+"\nSaldo: R$"+scanLinha.nextDouble()
//							+ "\n--------------------------------");
			contasSeparadas.add(valorFormatado);
			// System.out.println();
			cont++;

			scanLinha.close();
		}
//		for(int i = 0; i< cont; i++) {
//			//System.out.println(contasJuntas.get(i));
//			String contaJunta = contasJuntas.get(i);
//			String[] dadosDaConta = contaJunta.split(",");
//			contasSeparadas.add("\nTipo de conta: "+dadosDaConta[0]+"\nNúmero da Conta: "+dadosDaConta[1]+""
//					+ "\nAgencia: "+dadosDaConta[2]+"\nNome do Titular: "+dadosDaConta[3]+"\nSaldo: R$"+dadosDaConta[4]
//							+ "\n--------------------------------");
//		}
		for (int i = 0; i < contasSeparadas.size(); i++) {
			System.out.println(contasSeparadas.get(i));
		}
		// System.out.println(contasJuntas.get(0));
		// System.out.println(nome);
//		String[] teste = nome.split(",");
//		for(int i = 0; i < teste.length; i++) {		
//			String cli = "Tipo de conta: "+teste[i];
//			System.out.println(teste[i]);
//		}
	}

}
