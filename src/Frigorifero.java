public class Frigorifero {
	 double capienza;
	 String classe;
	
	public Frigorifero(int capienza, String classe) {
		this.capienza = capienza;
		this.classe = classe;
	}
	

	public double getCapienza() {
		return capienza;
	}

	public String getClasse() {
		return classe;
	}
	

	
	 @Override
	public String toString() {
		return " capienza=" + getCapienza() + ", classe=" + getClasse() ;
	}
	 
	public void calcoloPrezzo() {
		 double prezzo = 0;
		 if(classe.equals("a")) {
			 prezzo = capienza*5*5;
			 System.out.println(prezzo);
		 }else if(classe.equals("a+")) {
			 prezzo = capienza*5.0*1.5;
			 System.out.println(prezzo);
		 }else if(classe.equals("a++")) {
			 prezzo = capienza*5*2;
			 System.out.println(prezzo);
			 
		 }
	 }
}
