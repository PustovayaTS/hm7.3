import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        example();
        System.out.println("  ");
        example1();
    }
    static void example() {
        //List<Integer> biDemArrList = new ArrayList<>();
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            List<String> intList = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                intList.add("◯");
            }
            biDemArrList.add(i, intList);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.print('\n');
        }
    }
    static void example1() {
        //List<Integer> biDemArrList = new ArrayList<>();
        List<List<String>> biDemArrList = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            List<String> intList = new ArrayList<>();
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0 && j % 2 == 0)||(i % 2 != 0 && j % 2 != 0)){
                    intList.add("◯");
                } else if ((i % 2 != 0 && j % 2 == 0)||(i % 2 == 0 && j % 2 != 0)) {
                    intList.add("●");
                }
            }
            biDemArrList.add(i, intList);
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.print('\n');
        }
    }
}