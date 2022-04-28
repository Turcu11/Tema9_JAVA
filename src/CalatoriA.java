
public class CalatoriA extends Vagon {

	protected int capacitateCalatori = 40;
	protected int capacitateColete = 300;

	public void deschideAutomatUsile() {
		System.out.println("Usile s-au deschis automat.");
	}

	public void inchideAutomatUsile() {
		System.out.println("Usile s-au inchis automat.");
	}

	@Override
	public String toString() {
		return "CalatoriA [capacitateCalatori=" + capacitateCalatori + ", capacitateColete=" + capacitateColete + "]";
	}

	public int getCapacitateCalatori() {
		return capacitateCalatori;
	}

	public int getCapacitateColete() {
		return capacitateColete;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CalatoriA other = (CalatoriA) obj;
		if (capacitateCalatori != other.capacitateCalatori)
			return false;
		if (capacitateColete != other.capacitateColete)
			return false;
		return true;
	}

}
