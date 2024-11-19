import java.util.HashSet;

public class Questao_7 {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<Integer>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(25);

        for (int i = 0; i < nums.size(); i++) {
            if(nums.contains(15)){
                System.out.println("Está presente");
            } else {
                System.out.println("Não está");
            }

        }

    }
}
