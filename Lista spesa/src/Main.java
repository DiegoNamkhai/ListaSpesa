
public class Main {

	public static void main(String[] args) {
		Spesa diego = new Spesa();
		diego.add("sos");
		diego.add("pera");
		diego.add("ananas");
		diego.add("aaa");
		diego.add("a");
		diego.add("z");
		diego.add("zzz");
		diego.remove("zzz");
		diego.print();
	}

}
