package br.com.phfedev.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.Socket;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com um arquivo

		// Socket s = new Socket();

//		OutputStream fos = System.out; // s.getOutputStream();////new FileOutputStream("lorem2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

		FileWriter fw = new FileWriter("lorem2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Lorem Ipsum Dolor");
		bw.newLine();
		bw.write("Lorem Ipsum Dolor");

		bw.close();
		// bw.close();

	}

}
