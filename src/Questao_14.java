import java.util.LinkedList;
import java.util.Queue;

public class Questao_14 {
    public static void main(String[] args) {
        Queue<Integer> numfila = new LinkedList<Integer>();

        for (int i = 0; i <= 5  ; i++) {
            numfila.add(i);
        }
        while(!numfila.isEmpty()){
            numfila.poll();
            System.out.println(numfila);
        }
    }
}
