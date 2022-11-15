package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
    int Id;
	String Bruker;
	String Dato;
	int Likes;
	
	public Innlegg() {
	}
	
	public Innlegg(int id, String bruker, String dato) {
       Id =id;
       Bruker =bruker;
       Dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		Id = id;
        Bruker = bruker;
		Dato = dato;
		Likes = likes;
	}
	
	public String getBruker() {
		
		return Bruker; 

	}

	public void setBruker(String bruker) {
		
		this.Bruker = bruker; 
	}

	public String getDato() {
		return Dato;
		
	}

	public void setDato(String dato) {
		this.Dato = dato; 
	}

	public int getId() {
		return this.Id;

	}

	public int getLikes() {
		
		return this.Likes;

	}
	
	public void doLike () {
		
		Likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		boolean lik;
		
		if (innlegg.Id == getId()) {
			lik = true;
		}else {
			lik = false;
		}
return lik;
	}
	
	@Override
	public String toString() {
		
		String std;
		
		std = getId() +"\n"+ getBruker()+"\n"+getDato()+"\n"+getLikes()+"\n";
		
		return std;
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
