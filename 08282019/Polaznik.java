package ucionica;

public class Polaznik {
/*Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika.
 * Polaznik poseduje i identifikacioni broj  koji se moze dohvatiti.
 * Ime i prezime polaznika se moze dohvatiti ali ne i postaviti.
 * Vozac se ispisuje u obliku: IME_PREZIME{ID}.
*/
private static int UID=0;	
	
private String ime;
private String prezime;
private int id;

//konstruktor:
public Polaznik(String ime, String prezime) { 
	this.ime=ime;
	this.prezime=prezime;
	id=++UID;
}
public static int getUID() {
	return UID;
}
public String getIme() {
	return ime;
}
public String getPrezime() {
	return prezime;
}
public int getId() {
	return id;
}

public String ispisi() {
	return ime+"_"+prezime+"{"+id+"}";
}


}
