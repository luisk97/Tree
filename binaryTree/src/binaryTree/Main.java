package binaryTree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree arbol = new Tree();
		arbol.insert(5);
		arbol.insert(5);
		arbol.insert(3);
		arbol.insert(7);
		arbol.insert(7);
		arbol.insert(4);
		arbol.insert(6);
		arbol.insert(2);
		arbol.insert(8);
		System.out.println("Listo se creo el arbol :D");
		System.out.println("");
		arbol.inOrder();
//		arbol.postOrder();
//		arbol.preOrder();
		arbol.eliminar(9);
		arbol.eliminar(8);
		arbol.eliminar(3);
		arbol.eliminar(7);
		arbol.eliminar(4);
	}

}
