
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
		List<String> sos = new List<String>();
		sos.insertFromHead("a");
		//sos.insertFromTail("c");
		//sos.insertFromTail("d");
		//sos.insertAtPosition("b", 0);
		sos.print();
		System.out.println((Object)sos.indexOf("a"));
		//sos.removeAtPosition(3);
		//sos.print();
		//sos.removeFromHead();
		//sos.print();
		//sos.removeFromTail();
		//vsos.print();
	}

}
