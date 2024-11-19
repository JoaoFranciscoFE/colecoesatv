import java.util.HashSet;
import java.util.TreeSet;

public class Questao_17 {
    public static void main(String[] args) {
        HashSet<Integer> numeros1 = new HashSet<Integer>();


        numeros1.add(5);
        numeros1.add(2);
        numeros1.add(9);
        numeros1.add(3);
        numeros1.add(7);
        System.out.println(numeros1);
        TreeSet<Integer> numeros2 = new TreeSet<Integer>();

        numeros2.add(5);
        numeros2.add(2);
        numeros2.add(9);
        numeros2.add(3);
        numeros2.add(7);

        System.out.println(numeros2);

    }
}
