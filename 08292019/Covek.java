package Fakultet;

public class Covek {

	private static int unijmbg=1110;
		private String ime;
		private String prezime;
		private int dob;
		private int jmbg;
		
		public Covek(String ime, String prezime,int dob) {
			this.ime=ime;
			this.prezime=prezime;
			this.dob=dob;
			jmbg=++unijmbg;
		}
		
		public String getIme() {
			return ime;
		}
		public void setIme(String ime) {
			this.ime=ime;
		}
		public String getPrezime() {
			return prezime;
		}
		public void setPrezime(String prezime) {
			this.prezime=prezime;
		}
		public int getDob() {
			return dob;
		}
		public String ispisi() {
			return ime + " " + prezime+ " ["+ dob + "]";
		}
 

}


