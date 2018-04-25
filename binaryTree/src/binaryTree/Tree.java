package binaryTree;

import java.util.ArrayList;

public class Tree {
	private Nodo raiz;
	
	public Tree() {
		raiz = null;
	}
	
	public void insert(int valor) {
		raiz = insert(valor,raiz);
	}

	private Nodo insert(int valor,Nodo actual) {
		if(actual == null) {
			System.out.println("Se inserto el nodo con el valor "+valor);
			return new Nodo(valor);
		}else if(valor<actual.getValor()) {
			actual.linkIzq(insert(valor,actual.getIzq()));
		}else if(valor>actual.getValor()) {
			actual.linkDer(insert(valor,actual.getDer()));
		}else if(actual.getValor() == valor) {
			System.out.println("El valor "+valor+" ya existe");
		}
		return actual;
	}
	
	public void eliminar(int valor) {
		raiz = eliminar(valor,raiz);
	}
	
	private Nodo eliminar(int valor,Nodo actual) {
		if(actual == null) {
			System.out.println("El valor "+valor+" no existe");
		}else if(valor < actual.getValor()) {
			actual.linkIzq(eliminar(valor,actual.getIzq()));
		}else if(valor > actual.getValor()) {
			actual.linkDer(eliminar(valor,actual.getDer()));
		}else {
			if(actual.getDer() == null && actual.getIzq() == null) {
				System.out.println("Se elimino el valor: "+actual.getValor());
				return null;
			}else if(actual.getDer() == null && actual.getIzq() != null) {
				System.out.println("Se elimino el valor: "+actual.getValor());
				return actual.getIzq();
			}else if(actual.getDer() != null && actual.getIzq() == null) {
				System.out.println("Se elimino el valor: "+actual.getValor());
				return actual.getDer();
			}else {
				System.out.println("Se elimino el valor: "+actual.getValor());
				actual.setValor(menor(actual.getDer()).getValor());
				actual.linkDer(eliminar(actual.getValor(),actual.getDer()));
			}
		}
		return actual;
	}
	
	private Nodo menor(Nodo actual) {
		if(actual.getIzq() == null) {
			return actual;
		}else {
			return menor(actual.getIzq());
		}
	}
	
	public void preOrder() {
		preOrder(raiz);
	}
	private void preOrder(Nodo root) {
		if(root==null) {
			return;
		}
		System.out.println(root.getValor());
		preOrder(root.getIzq());
		preOrder(root.getDer());
	}
	public void inOrder() {
		inOrder(raiz);
	}
	private void inOrder(Nodo node) {
		if(node==null) {
			return;
		}
		inOrder(node.getIzq());
		System.out.println(node.getValor());
		inOrder(node.getDer());
		
	}
	public void postOrder() {
		
	}
	private void postOrder(Nodo node) {
		if(node==null) {
			return;
		}
		postOrder(node.getIzq());
		postOrder(node.getDer());
		System.out.println(node.getValor());
	}
	
	public void mezcla(Tree b) {
		ArrayList<Integer> a;
		
		
	}
}
