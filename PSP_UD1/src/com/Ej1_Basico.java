package com;

import java.io.IOException;

public class Ej1_Basico {
	
	public static void main(String [] args) {
		
		try {
			Process p = new ProcessBuilder(Utils.sh("echos hola")).start();
			int rc = p.waitFor();
			System.out.println("Code:"+rc);
		} catch (IOException | InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
