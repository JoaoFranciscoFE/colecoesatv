import java.util.ArrayList;

public class Questao_1 {
    public static void main(String[] args) {
        ArrayList<Integer> listanum = new ArrayList<>();
        listanum.add(10);
        listanum.add(20);
        listanum.add(30);
        listanum.add(40);
        listanum.add(50);



        for (int i = 0; i < listanum.size(); i++) {
            System.out.println(listanum.get(i));
        }
    }
}
