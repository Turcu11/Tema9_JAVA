import java.util.ArrayList;
import java.util.Iterator;

public class Tren {

	public static void main(String[] args) {
		ArrayList<Vagon> listaVagoane = new ArrayList<Vagon>();

		CalatoriA v1Ca = new CalatoriA();
		CalatoriA v2Ca = new CalatoriA();
		CalatoriB v3Cb = new CalatoriB();
		Marfa v4M = new Marfa();

		v1Ca.deschideAutomatUsile();
		v3Cb.bolocareAutomataGeamuri();

		listaVagoane.add(v1Ca);
		listaVagoane.add(v2Ca);
		listaVagoane.add(v3Cb);
		listaVagoane.add(v4M);

		Iterator<Vagon> it = listaVagoane.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println(v1Ca.equals(v2Ca));

	}
}
