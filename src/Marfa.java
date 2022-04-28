
public class Marfa extends Vagon {
	protected int capacitateColete = 300;
	protected int capacitateCalatori = 0;

	public void deschideManualUsile() {
		System.out.println("Usile s-au deschis manual.");
	}

	public void inchideManualUsile() {
		System.out.println("Usile s-au inchis manual.");
	}

	@Override
	public String toString() {
		return "Marfa [capacitateColete=" + capacitateColete + ", capacitateCalatori=" + capacitateCalatori + "]";
	}

	public int getCapacitateColete() {
		return capacitateColete;
	}

	public int getCapacitateCalatori() {
		return capacitateCalatori;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marfa other = (Marfa) obj;
		if (capacitateCalatori != other.capacitateCalatori)
			return false;
		if (capacitateColete != other.capacitateColete)
			return false;
		return true;
	}

}
