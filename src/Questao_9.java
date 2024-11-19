import java.util.HashMap;

public class Questao_9 {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<String, Integer>();

        idades.put("João", 13);
        idades.put("Maria", 16);
        idades.put("Paulo", 19);

        String nome = "João";
        if (idades.containsKey(nome)){
            int idade = idades.get(nome);
            System.out.println(idade);
        }
    }
}
