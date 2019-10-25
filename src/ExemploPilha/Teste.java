package ExemploPilha;

public class Teste {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha(3);
		
		pilha.push(2);
		pilha.push(3);
		pilha.push(5);

		//		pilha.pop();
		
		pilha.peek();
		
		if(pilha.isFull()) {
			System.out.println("cheia");
		}
		
		pilha.exibe();
		
	}

}
