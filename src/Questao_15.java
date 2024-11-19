import java.util.Stack;

public class Questao_15 {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<String>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.push("D");

        while (!pilha.isEmpty()){
            pilha.pop();
            System.out.println(pilha);
        }
    }
}
