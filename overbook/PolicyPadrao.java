package overbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolicyPadrao extends OverbookPolicy {

	@Override
	public void applyPolicy(Voo voo, boolean flagUltimo) {
		int limitePassageiros = (int) (voo.getAviao().getCapacidade() * 1.1);

		if (voo.getLista().size() == limitePassageiros || flagUltimo == true) {
			List<Passageiro> invertida = voo.getLista();
			Collections.reverse(invertida);

			List<Passageiro> excedidos = new ArrayList<Passageiro>();

			int cont = 0;
			for (Passageiro passageiro : invertida) {
				cont++;

				excedidos.add(passageiro);

				if (cont == (limitePassageiros - voo.getAviao().getCapacidade()))
					break;
			}

			for (Passageiro passageiro : excedidos) {

				for (Passageiro cancelado : voo.getListaDosCancelados()) {
					if (voo.getLista().contains(cancelado)) {
						voo.getLista().remove(passageiro);
						voo.getLista().remove(cancelado);
						passageiro.setPoltrona(cancelado.getPoltrona());
						voo.getLista().add(passageiro);
					}
				}
			}

			for (Passageiro passageiro : voo.getLista()) {
				if (passageiro.getPoltrona() == 0) {
					voo.getListaDosExcluidos().add(passageiro);
				} else {
					voo.getListaDosEmbarcados().add(passageiro);
				}
			}
		}
	}

	@Override
	public boolean podeIncluir(Passageiro passageiro) {
		return true;
	}
}
