package magacin;

public class Artikal {
  private String naziv;
  private int sifra;
  private String opis;
  private int kolicina;
public String getNaziv() {
	return naziv;
}
public void setNaziv(String naziv) {
	if(naziv.equals("") || naziv==null) {
		return;
	}
	this.naziv = naziv;
}
public int getSifra() {
	return sifra;
}
public void setSifra(int sifra) {
	
	this.sifra = sifra;
}
public String getOpis() {
	return opis;
}
public void setOpis(String opis) {
	if(opis.equals("") || opis==null) {
		return;
	}
	this.opis = opis;
}
public int getKolicina() {
	return kolicina;
}
public void setKolicina(int kolicina) {
	this.kolicina = kolicina;
}
  
  
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
  @Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
  @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
