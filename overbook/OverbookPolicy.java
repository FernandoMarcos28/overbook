package overbook;

import java.util.ArrayList;
import java.util.List;

public abstract class OverbookPolicy {
		
	protected List<Passageiro> listaDosEmbarcados = new ArrayList<Passageiro>();
	protected List<Passageiro> listaDosExcluidos = new ArrayList<Passageiro>();
	
	public abstract void applyPolicy(Voo v, boolean flagUltimo);
	
	public List<Passageiro> getListaDosEmbarcados() {
		return listaDosEmbarcados;
	}
	
	public List<Passageiro> getListaDosExcluidos() {
		return listaDosExcluidos;
	}
	
	public abstract boolean podeIncluir(Passageiro passageiro);
}
