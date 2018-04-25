package binaryTree;

public class Nodo {
	private int valor;
	private Nodo izq;
	private Nodo der;

	public Nodo(int valor) {
		this.valor = valor;
		izq = der = null;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Nodo getIzq() {
		return izq;
	}

	public void linkIzq(Nodo izq) {
		this.izq = izq;
	}

	public Nodo getDer() {
		return der;
	}

	public void linkDer(Nodo der) {
		this.der = der;
	}
	

}
