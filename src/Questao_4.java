import java.util.ArrayList;
import java.util.Collections;


public class Questao_4 {
    public static void main(String[] args) {
        ArrayList<Integer> organizarNum = new ArrayList<>();

        organizarNum.add(1);
        organizarNum.add(2);
        organizarNum.add(3);
        organizarNum.add(4);

        Collections.sort(organizarNum);
        System.out.println(organizarNum);
    }
}
