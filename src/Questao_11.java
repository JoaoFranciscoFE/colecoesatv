import java.util.HashMap;
import java.util.Map;

public class Questao_11 {
    static class Pessoa {
        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return String.format("Nome: %s, Idade: %d", nome, idade);
        }
    }

    public static void main(String[] args) {

        Map<String, Pessoa> idades = new HashMap<>();

        Pessoa pessoa1 = new Pessoa("João", 10);
        Pessoa pessoa2 = new Pessoa("Paulo", 15);
        Pessoa pessoa3 = new Pessoa("Joana", 20);

        idades.put(pessoa1.getNome(), pessoa1);
        idades.put(pessoa2.getNome(), pessoa2);
        idades.put(pessoa3.getNome(), pessoa3);

        System.out.println(idades);
    }
}
