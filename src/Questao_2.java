import java.util.ArrayList;

public class Questao_2 {
    public static void main(String[] args) {
        ArrayList<Integer> listanum = new ArrayList<Integer>();
        listanum.add(10);
        listanum.add(20);
        listanum.add(30);
        listanum.add(40);
        listanum.add(50);

        listanum.remove(2);
//      listanum.remove(Integer.valueOf(30));

        for (int i = 0; i < listanum.size(); i++) {
            System.out.println(listanum.get(i));
        }
    }
}
