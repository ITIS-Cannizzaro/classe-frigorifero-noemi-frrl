public class RunnerFrigorifero {

	public static void main(String[] args) {
		Frigorifero f1 = new Frigorifero(500, "a");
		Frigorifero f2 = new Frigorifero(400, "a+");
		
		System.out.println("frigorifero 1" + f1.toString());
		System.out.println("frigorifero 2" + f2.toString());

		System.out.println("prezzo primo frigorifero: ");
		f1.calcoloPrezzo();
		System.out.println("prezzo secondo frigorifero: ");
		f2.calcoloPrezzo();
	}

}
