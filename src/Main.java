import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(0);
        List<Integer> randomArray = new ArrayList<>();
        int value = random.linearRandomize();

        // generate all pseudo random numbers
        do {
            randomArray.add(value);
            value = random.linearRandomize();
        } while (!randomArray.contains(value));

        System.out.println(Arrays.toString(randomArray.toArray()));

        double valueEqual = random.linearRandomizeEuqalChance();
        List<Double> randomArrayEquals = new ArrayList<>();

        do {
            randomArrayEquals.add(valueEqual);
            valueEqual = random.linearRandomizeEuqalChance();
        } while (!randomArrayEquals.contains(valueEqual));

        System.out.println(Arrays.toString(randomArrayEquals.toArray()));
    }
}
