import java.util.Stack;

public class Pilha {
	
	Stack<String> p = new Stack<String>();
	
	public void inserir(String e) {
		
		p.push(e);
	
		
	}
	
	public void remover() {
		
		System.out.println(p.pop());
		
	}
	
	public void verificar() {
		System.out.println(p.size());
	}
	
	public void mostrar() {
		System.out.println(p.toString());
	}

}
