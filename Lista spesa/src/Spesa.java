//import java.util.Vector;

public class Spesa {
	
	List<String> spesa = new List<String>();
	
	public Spesa() {}
	
	public void add(String obj) {//é stato creato in precedenza della spiegazione, ed é a parer mio il modo
		//piú complicato di farlo.
		//Dimostra una bassa capapictá come programmatore, ma una buon livello in quanto risoluzione
		//di problemi e tenacia.
		// mi spiace ma non sono stato abbastanza sveglio da riuscir a capire
		//subito la soluzione migliore
		//In nuoto ho usato quello piú corretto e funzionale.
		String [] v = new String[0];
		v = spesa.allInfo(v);
		if(spesa.allInfo(v)==null) {
			spesa.insertFromHead(obj);
		}
		else {
			if (spesa.getElement() == 1) {
				if (obj.compareTo(v[0])>0) {
					spesa.insertFromTail(obj);
				}
				else {
					spesa.insertFromHead(obj);
				}
			}
			else {
				boolean flagNeg = false;
				int maxneg = obj.compareTo(v[0]);
				int indexneg = 0;
				int minpos = obj.compareTo(v[0]);
				int indexpos = 0;
				int index = 0;
				for(int i=0; i<spesa.getElement(); i++) {
					if(obj.compareTo(v[i])>0) {
						if(obj.compareTo(v[i])<minpos) {
							minpos = obj.compareTo(v[i]);
							indexpos = i;
						}
					}
					else {
						if(obj.compareTo(v[i])>maxneg) {
							maxneg = obj.compareTo(v[i]);
							indexneg = i;
							
						}
						flagNeg = true;
					}
				}
				if(flagNeg) {
					if(minpos-(maxneg*-1)==1 || minpos-(maxneg*-1)>(maxneg*-1)-minpos) {
						index = indexneg;
					}
					else {
						index = indexpos;
					}
				}
				else {
					index = indexpos;
				}
				if (index == spesa.getElement()-1) {
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
