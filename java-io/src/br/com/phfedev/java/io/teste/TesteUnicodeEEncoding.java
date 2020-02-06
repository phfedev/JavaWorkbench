package br.com.phfedev.java.io.teste;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws IOException {
		String s = "Pedro";
		System.out.println(s.codePointAt(0));
		
		Charset ch = Charset.defaultCharset();
		System.out.println(ch.displayName());
		
		byte[] b = s.getBytes("unicode");
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

}
