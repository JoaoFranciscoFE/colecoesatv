import java.util.LinkedList;

public class Questao_12 {
    public static void main(String[] args) {
        LinkedList<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        System.out.println(numeros);

        numeros.add(0);
        numeros.add(6);

        System.out.println(numeros);

    }
}

