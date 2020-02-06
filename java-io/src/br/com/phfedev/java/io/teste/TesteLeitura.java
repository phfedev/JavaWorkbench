package br.com.phfedev.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		//Fluxo de entrada com um arquivo
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("lorem2.txt")));
		
		String text = "";
		
		while(br.readLine() != null) {
			text = br.readLine().toString();
			System.out.println(text);
			br.readLine();
		}
		br.close();
	}

}
