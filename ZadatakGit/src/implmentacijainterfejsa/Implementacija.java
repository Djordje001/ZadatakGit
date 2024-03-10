package implmentacijainterfejsa;

import java.util.List;

import interfejspaket.Interfejs;
import magacin.Artikal;

public class Implementacija implements Interfejs {
   private List<Artikal> artikli;
	@Override
	public void dodaj(Artikal artikal) {

		if(artikal!=null && !artikli.contains(artikal)) artikli.add(artikal);

		
	}

	@Override
	public void izbaci(Artikal artikal) {
		if(artikal!=null && artikli.contains(artikal)) artikli.remove(artikal);
		
	}

	@Override
	public Artikal pronadji(int sifra) {
		Artikal artikal=new Artikal();
		artikal.setSifra(sifra);
		for(int i=0;i<artikli.size();i++) {
			if(artikli.get(i).equals(artikal)) {
				return artikal;
			}
		}
		return null;
	}

}
