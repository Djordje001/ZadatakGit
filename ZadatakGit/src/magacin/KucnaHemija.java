package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {
     private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
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
