
public class CalatoriB extends Vagon {

	protected int capacitateCalatori = 50;
	protected int capacitateColete = 400;

	public void deschideAutomatUsile() {
		System.out.println("Usile s-au deschis automat.");
	}

	public void inchideAutomatUsile() {
		System.out.println("Usile s-au inchis automat.");
	}

	public void bolocareAutomataGeamuri() {
		System.out.println("Geamurile s-au blocat automat.");
	}

	public void debolocareAutomataGeamuri() {
		System.out.println("Geamurile s-au deblocat automat.");
	}

	@Override
	public String toString() {
		return "CalatoriB [capacitateCalatori=" + capacitateCalatori + ", capacitateColete=" + capacitateColete + "]";
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
		CalatoriB other = (CalatoriB) obj;
		if (capacitateCalatori != other.capacitateCalatori)
			return false;
		if (capacitateColete != other.capacitateColete)
			return false;
		return true;
	}

}
