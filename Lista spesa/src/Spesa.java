//import java.util.Vector;

public class Spesa {
	
	List<String> spesa = new List<String>();
	
	public Spesa() {}
	
	public void add(String obj) {
		System.out.println(obj);
		String [] v = new String[12];
		v = spesa.allInfo(v);
		if(spesa.allInfo(v)==null) {
			System.out.println("first");
			spesa.insertFromHead(obj);
		}
		else {
			System.out.println("else");
			spesa.allInfo(v);
			if (spesa.getElement() == 1) {
				System.out.println("element == 1");
				if (obj.compareTo(v[0])>0) {
					System.out.println("head");
					spesa.insertFromTail(obj);
				}
				else {
					System.out.println("tail");
					spesa.insertFromHead(obj);
				}
				spesa.print();
			}
			else {
				boolean flagNeg = false;
				int maxneg = obj.compareTo(v[0]);
				int indexneg = 0;
				int minpos = obj.compareTo(v[0]);
				System.out.println("minpos " + minpos);
				int indexpos = 0;
				int index = 0;
				System.out.println("1element " + spesa.getElement());
				for(int i=0; i<spesa.getElement(); i++) {
					System.out.println("i " + i);
					System.out.println("differcence " + obj.compareTo(v[i]));
					if(obj.compareTo(v[i])>0) {
						System.out.println("pos");
						if(obj.compareTo(v[i])<minpos) {
							System.out.println("change minpos");
							System.out.println("obj " + obj + " v[i] " + v[i]);
							System.out.println(obj.compareTo(v[i]));
							System.out.println("minpos " + minpos);
							minpos = obj.compareTo(v[i]);
							System.out.println("new minpos " + minpos);
							indexpos = i;
						}
						System.out.println("indexpos " + indexpos+ " " + v[indexpos]);
					}
					else {
						System.out.println("neg");
						if(obj.compareTo(v[i])>maxneg) {
							System.out.println("change maxneg");
							maxneg = obj.compareTo(v[i]);
							indexneg = i;
							flagNeg = true;
						}
						System.out.println("indexneg " + indexneg+ " " + v[indexneg]);
					}
				}
				System.out.println("minpos " + minpos+ " maxneg " + maxneg);
				System.out.println(flagNeg);
				if(flagNeg) {
					if(minpos-(maxneg*-1)==1 || minpos-(maxneg*-1)>(maxneg*-1)-minpos) {
						index = indexneg;
					}
					else {
						System.out.println("1index = indexpos");
						index = indexpos;
					}
				}
				else {
					System.out.println("2index = indexpos");
					index = indexpos;
				}
				if (index == spesa.getElement()-1) {
					System.out.println("index = element");
					if(obj.compareTo(v[index])>0){
						spesa.insertFromTail(obj);
					}
					else {
						spesa.insertAtPosition(obj, index);
					}
				}
				else {
					spesa.insertAtPosition(obj, index);
				}
				System.out.println(index);
				System.out.println("2element" + spesa.getElement());
				spesa.print();
			}	
			
			
		
		}
	}

	public boolean remove (String obj) {
		return spesa.remove(obj);
		
	}
	
	public boolean check(String obj) {
		return spesa.contain(obj);
	}
	
	public void print() {
		spesa.print();
	}
	

}
