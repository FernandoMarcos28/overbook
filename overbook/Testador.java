package overbook;

import java.util.Collections;

public class Testador {
	public static void main(String[] args) {
		
		System.out.println("Método Padrão 1");
		metodoPadrao1();
		
		System.out.println("\nMétodo Padrão 2");
		metodoPadrao2();
		
		System.out.println("\nMétodo Padrão 3");
		metodoPadrao3();
		
		System.out.println("Método VIP 1");
		metodoVIP1();
		
		System.out.println("\nMétodo VIP 2");
		metodoVIP2();
		
		System.out.println("\nMétodo VIP 3");
		metodoVIP3();
		
		System.out.println("\nMétodo VIP 4");
		metodoVIP4();
		
		
		/*
		Aviao aviao1 = new Aviao(1, "A330", 200);
		// Aviao aviao2 = new Aviao(1,"Boeing 727",20);

		Voo voo1 = new Voo(1, aviao1, new PolicyVIP());
		
		for (int i = 0; i < 200; i++) {
			String cod = i + "a";
			
			Passageiro pass = new Passageiro("Carinha",cod, Categoria.COMUM);
			voo1.embarcar(pass);
			
			if (i == 93) {
				voo1.cancelarPassagem(pass);
			}
		}
		for (int i = 0; i < 10; i++) {
			String cod = i + "B";
			voo1.embarcar(new Passageiro("Senhor Vip",cod, Categoria.VIP));
		}
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
		*/
	}

	
	public static void metodoPadrao1() {
		Aviao aviao1 = new Aviao(1, "A330", 10);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyPadrao());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("SEGUNDO","2", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("TERCEIRO","3", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","4", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","5", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","6", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","7", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","8", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","9", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("PENULTIMO","10", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("ULTIMO","11", Categoria.COMUM),false);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}
	
	public static void metodoPadrao3() {
		Aviao aviao1 = new Aviao(1, "A330", 10);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyPadrao());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("SEGUNDO","2", Categoria.COMUM),false);
		Passageiro pass = new Passageiro("TERCEIRO","3", Categoria.COMUM);
		voo1.embarcar(pass,false);
		voo1.embarcar(new Passageiro("OUTRO","4", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","5", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","6", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","7", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","8", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","9", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("PENULTIMO","10", Categoria.COMUM),false);
		
		voo1.cancelarPassagem(pass);
		voo1.embarcar(new Passageiro("ULTIMO","11", Categoria.COMUM),false);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}
	public static void metodoPadrao2() {
		Aviao aviao1 = new Aviao(1, "A330", 10);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyPadrao());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("SEGUNDO","2", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("TERCEIRO","3", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","4", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","5", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","6", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("OUTRO","7", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","8", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("PENULTIMO","9", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("ULTIMO","10", Categoria.COMUM),true);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}
	
	
	public static void metodoVIP1() {
		Aviao aviao1 = new Aviao(1, "A330", 40);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyVIP());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.COMUM),false);
		for (int i = 0; i < 38; i++) {
			int lugar = i + 1;
			String cod = lugar + "a";
			voo1.embarcar(new Passageiro("OUTRO CARA",cod, Categoria.COMUM),false);
		}
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","39A", Categoria.COMUM),false);
		voo1.embarcar(new Passageiro("PENULTIMO","V1", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("ULTIMO","V2", Categoria.VIP),false);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}
	
	
	public static void metodoVIP2() {
		Aviao aviao1 = new Aviao(1, "A330", 40);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyVIP());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.COMUM),false);
		for (int i = 0; i < 37; i++) {
			int lugar = i + 1;
			String cod = lugar + "a";
			voo1.embarcar(new Passageiro("OUTRO CARA",cod, Categoria.COMUM),false);
		}
		voo1.embarcar(new Passageiro("OUTROCARA VIP","V1", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","V2", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("PENULTIMO","V3", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("ULTIMO","V4", Categoria.VIP),false);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}

	
	public static void metodoVIP3() {
		Aviao aviao1 = new Aviao(1, "A330", 40);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyVIP());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.VIP),false);
		for (int i = 0; i < 38; i++) {
			int lugar = i + 1;
			String cod = lugar + "a";
			voo1.embarcar(new Passageiro("TODO MUNDO VIP",cod, Categoria.VIP),false);
		}
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","V1", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("PENULTIMO","V2", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("ULTIMO","V3", Categoria.VIP),false);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}
	
	
	public static void metodoVIP4() {
		Aviao aviao1 = new Aviao(1, "A330", 40);
		
		Voo voo1 = new Voo(1, aviao1, new PolicyVIP());
		voo1.embarcar(new Passageiro("PRIMEIRO","1", Categoria.COMUM),false);
		for (int i = 0; i < 39; i++) {
			int lugar = i + 1;
			String cod = lugar + "a";
			
			Passageiro pass = new Passageiro("OUTRO CARA",cod, Categoria.COMUM);
			voo1.embarcar(pass,false);
			
			if (i==25) {
				voo1.cancelarPassagem(pass);
			}
		}
		
		voo1.embarcar(new Passageiro("ANTEPENULTIMO","V1", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("PENULTIMO","V2", Categoria.VIP),false);
		voo1.embarcar(new Passageiro("ULTIMO","V3", Categoria.VIP),false);
		
		Collections.sort(voo1.getListaDosEmbarcados(),
				new PassageiroComparator());

		System.out.println("Lista dos Embarcados");
		for (Passageiro passageiro : voo1.getListaDosEmbarcados()) {
			System.out.println(passageiro);
		}
		
		Collections.sort(voo1.getListaDosExcluidos(),
				new PassageiroComparator());
		
		System.out.println();
		System.out.println("Lista dos Excluidos");
		for (Passageiro passageiro : voo1.getListaDosExcluidos()) {
			System.out.println(passageiro);
		}
	}
}
