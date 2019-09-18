package Fakultet;

public class Covek_ver2 {

	
		private String ime;
		private String prezime;
		private int dob;
		
		
		public Covek_ver2(String ime, String prezime,int dob) {
			this.ime=ime;
			this.prezime=prezime;
			this.dob=dob;
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
		public String ispis() {
			String s="";
			s+=this.ime+ " "+ this.prezime +"["+this.dob+"]";
			return s;
		}
		
		/*
		 public String ispisi() {
		 return ime + " " + prezime+ " ["+ dob + "]";
		}
 */

}


