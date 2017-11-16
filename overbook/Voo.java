package overbook;

import java.util.ArrayList;
import java.util.List;

public class Voo {

	private int numero;
	private Aviao aviao;
	private OverbookPolicy overbookPolicy;
	private List<Passageiro> listaDosEmbarcados = new ArrayList<Passageiro>();
	private List<Passageiro> listaDosExcluidos = new ArrayList<Passageiro>();
	private List<Passageiro> listaDosCancelados = new ArrayList<Passageiro>();
	private List<Passageiro> lista = new ArrayList<Passageiro>();
	
	public List<Passageiro> getListaDosEmbarcados() {
		return listaDosEmbarcados;
	}
	
	public List<Passageiro> getListaDosExcluidos() {
		return listaDosExcluidos;
	}
	
	public List<Passageiro> getListaDosCancelados() {
		return listaDosCancelados;
	}
	
	public void setListaDosEmbarcados(List<Passageiro> listaDosEmbarcados) {
		this.listaDosEmbarcados = listaDosEmbarcados;
	}

	public void setListaDosExcluidos(List<Passageiro> listaDosExcluidos) {
		this.listaDosExcluidos = listaDosExcluidos;
	}

	public void setListaDosCancelados(List<Passageiro> listaDosCancelados) {
		this.listaDosCancelados = listaDosCancelados;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public Aviao getAviao() {
		return aviao;
	}

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	public OverbookPolicy getOverbookPolicy() {
		return overbookPolicy;
	}

	public Voo(int numero, Aviao aviao, OverbookPolicy overbookPolicy) {
		this.numero = numero;
		this.aviao = aviao;
		this.overbookPolicy = overbookPolicy;
	}

	public void embarcar(Passageiro passageiro, boolean flagUltimo) {

		try {
			if (lista.contains(passageiro)) {
				throw new PassageiroExistenteException();
			}
			passageiro.setPoltrona(lista.size() + 1);
			
			boolean podeIncluir = true;
			if (lista.size() >= aviao.getCapacidade()) {
				passageiro.setPoltrona(0);
				podeIncluir = overbookPolicy.podeIncluir(passageiro);
			}
			
			if (podeIncluir) {
				lista.add(passageiro);
			}
			encerrarEmbarque(flagUltimo);

		} catch (PassageiroExistenteException exc) {
			System.out.println(exc);
		}
	}
	
	public void cancelarPassagem(Passageiro passageiro) {
		this.listaDosCancelados.add(passageiro);
	}
	
	public List<Passageiro> getLista() {
		return lista;
	}

	public void setLista(List<Passageiro> lista) {
		this.lista = lista;
	}

	private void applyPolicy(boolean flagUltimo) {
		overbookPolicy.applyPolicy(this, flagUltimo);
	}

	public void encerrarEmbarque(boolean flagUltimo) {
		this.applyPolicy(flagUltimo);
	}
}
