package other_examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TotalPoints {

    public static List<String> points(String[] games) {
        for (String game : games) {
            return Arrays.stream(game.split(":")).collect(Collectors.toList());
        }
    return List.of("a", "b");
    }

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:1","2:2","3:3","4:4","2:2","3:3","4:4","3:3","4:4","4:4"}));
    }
}
