package OOPSBannerApp;
public class UC3 {
    static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    static String[] getPPattern() {
        return new String[]{
                "***** ",
                "*    *",
                "***** ",
                "*     ",
                "*     "
        };
    }

    static String[] getSPattern() {
        return new String[]{
                " *****",
                "*     ",
                " *****",
                "      *",
                "***** "
        };
    }

    static String[] buildPattern() {
        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        String[] banner = new String[5];

        for (int i = 0; i < 5; i++) {
            banner[i] = O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i];
        }
        return banner;
    }

    static void printPattern(String[] banner) {
        for (String line : banner) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String[] banner = buildPattern();
        printPattern(banner);
    }
}
