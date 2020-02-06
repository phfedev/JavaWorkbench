package br.com.phfedev.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com um arquivo
		
		Socket s = new Socket();
		
		OutputStream fos = System.out; //s.getOutputStream();////new FileOutputStream("lorem2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		
		InputStream fis = System.in; //s.getInputStream();//new FileInputStream("lorem2.txt");//
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);

		String text = br.readLine();
		while (text != null && !text.isEmpty()) {
			bw.write(text);
			bw.newLine();
			text = br.readLine();
		}
		br.close();
		bw.close();

	}

}
