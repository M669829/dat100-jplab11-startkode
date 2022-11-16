package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {
	
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
			
		int lengde = samling.getAntall();
		
		try {
			FileWriter skriver = new FileWriter(mappe + filnavn);
			
			for(int i = 0; i<lengde;i++) {
				skriver.write(samling.toString());
			}
			skriver.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		} catch (IOException e) {
			return false;
		}
		
	}
}
