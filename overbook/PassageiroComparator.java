package overbook;

import java.util.Comparator;

public class PassageiroComparator implements Comparator<Passageiro> {
	@Override
	public int compare(Passageiro o1, Passageiro o2) {
		return o1.getNome().compareTo(o2.getNome());
	}
}
