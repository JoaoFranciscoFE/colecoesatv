import java.util.ArrayList;

public class Questao_3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        for (int i = 0; i < frutas.size(); i++) {
            if(frutas.contains("Banana")){
                System.out.println("Existe");
            } else {
                System.out.println("Não existe");
            }
        }

    }
}
