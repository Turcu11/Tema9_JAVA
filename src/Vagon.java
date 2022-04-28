
public abstract class Vagon {
	protected int capacitateCalatori;
	protected int capacitateColete;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vagon other = (Vagon) obj;
		if (capacitateCalatori != other.capacitateCalatori)
			return false;
		if (capacitateColete != other.capacitateColete)
			return false;
		return true;
	}

}
