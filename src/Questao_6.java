import java.util.HashSet;

public class Questao_6 {
    public static void main(String[] args) {
        HashSet<String> listaCidades = new HashSet<String>();
        listaCidades.add("Amazonas");
        listaCidades.add("Sergipe");
        listaCidades.add("Amapa");
        listaCidades.add("Parana");

        for (String cidade : listaCidades) {
            System.out.println(cidade);

        }
    }
}
