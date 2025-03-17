import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;

        HashMap<Integer, String> rules = new HashMap<>();
        rules.put(3, "Fizz");
        rules.put(5, "Buzz");

        for(int i = start; i <= end; i++) {
            var output = "";
            for (Map.Entry<Integer, String> entry : rules.entrySet())
                if (i % entry.getKey() == 0)
                    output += entry.getValue();
            if (output.isEmpty())
                output += i;
            System.out.println(output);
        }

    }
}