package ExemploPilha;

public class Pilha {
	
	private int topo;
	private int[] pilha;
	
	public Pilha(int tamanhoPilha){
		this.topo = -1;
		pilha = new int[tamanhoPilha];
	}
	
	boolean isEmpty() {
		if (topo == -1) {
			return true;
		}
		return false;
	}
	
	boolean isFull() {
		if (topo == (pilha.length-1)) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
		if (!isFull()) {
			topo++;
			pilha[topo] = valor;
		}
	}
	
	public void pop() {
		if (!isEmpty()) {
			topo--;
		}
	}
	
	public void peek() {
		if (!isEmpty()) {
			System.out.println(topo);
		}else {
			System.out.println("-1");
		}
	}
	
	public void exibe() {
		if (isEmpty()) {
			System.out.println("Pilha Vazia");
		}else {
			for (int i =0; i <= topo; i++) {
			System.out.println(pilha[i]);
			}
		}
	}
	
	public void ehPalidromo() {
		
	}
	
	

}
