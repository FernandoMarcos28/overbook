package overbook;

public class Aviao {

	private int id;
	private int capacidade;
	private String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Aviao(int id, String modelo, int capacidade) {
		super();
		this.id = id;
		this.capacidade = capacidade;
		this.modelo = modelo;
	}

	public int getId() {
		return id;
	}

	public void setId(int numero) {
		this.id = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

}
