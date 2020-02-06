package br.com.phfedev.java.io.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {
		// Fluxo de entrada com um arquivo

		// Socket s = new Socket();

//		OutputStream fos = System.out; // s.getOutputStream();////new FileOutputStream("lorem2.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);

//		FileWriter fw = new FileWriter("lorem2.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		File file = new File("lorem3.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		//PrintStream ps = new PrintStream(file);
		PrintWriter ps = new PrintWriter(file);
		ps.println("Olá novo arquivo");
		ps.println();
		ps.println();
		ps.print("Tchau!!");
		ps.close();
		// bw.close();

	}
}
