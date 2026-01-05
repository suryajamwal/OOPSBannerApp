
import java.util.HashMap;
import java.util.Map;

public class UC5 {

    static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        map.put('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                "***** "
        });

        return map;
    }

    static void printBanner(String word, Map<Character, String[]> map) {

        int height = map.get(word.charAt(0)).length;

        for (int i = 0; i < height; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(map.get(ch)[i]).append("  ");
            }
            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();
        printBanner("OOPS", patternMap);
    }
}

