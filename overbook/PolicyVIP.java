package overbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PolicyVIP extends OverbookPolicy {

	@Override
	public void applyPolicy(Voo voo, boolean flagUltimo) {
		int limitePassageiros = (int) (voo.getAviao().getCapacidade() * 1.05);

		if (voo.getLista().size() == limitePassageiros || flagUltimo == true) {
			List<Passageiro> invertida = voo.getLista();
			Collections.reverse(invertida);

			List<Passageiro> excedidos = new ArrayList<Passageiro>();
			List<Passageiro> encontrouLugar = new ArrayList<Passageiro>();

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
						encontrouLugar.add(passageiro);

						passageiro.setPoltrona(cancelado.getPoltrona());
						voo.getLista().add(passageiro);
					}
				}
			}

			for (Passageiro passageiro : encontrouLugar) {
				excedidos.remove(passageiro);
			}

			for (Passageiro passageiro : invertida) {
				if (excedidos.contains(passageiro))
					continue;

				Passageiro voceVai = passageiro;
				Passageiro voceNaoVai = null;

				if (passageiro.getCategoria() != Categoria.VIP) {
					for (Passageiro passageiroVIP : excedidos) {
						passageiroVIP.setPoltrona(passageiro.getPoltrona());

						voceVai = passageiroVIP;
						voceNaoVai = passageiro;

					}
				}
				
				excedidos.remove(voceVai);
				voo.getListaDosEmbarcados().add(voceVai);
				if (voceNaoVai != null) {
					voo.getListaDosExcluidos().add(voceNaoVai);
				}
			}
			for (Passageiro passageiroVIP : excedidos) {
				voo.getListaDosExcluidos().add(passageiroVIP);
			}
			
			List<Passageiro> invertidaDosEmbarcados = voo
					.getListaDosEmbarcados();
			Collections.reverse(invertidaDosEmbarcados);
			voo.setListaDosEmbarcados(invertidaDosEmbarcados);
		}
	}

	@Override
	public boolean podeIncluir(Passageiro passageiro) {
		if (passageiro.getCategoria() == Categoria.VIP) {
			return true;
		}
		return false;
	}

}
