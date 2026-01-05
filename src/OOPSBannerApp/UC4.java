
public class UC4 {

    static class BannerCharacter {
        private char character;
        private String[] pattern;

        BannerCharacter(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    static void printBanner(BannerCharacter[] characters) {

        for (int i = 0; i < characters[0].getPattern().length; i++) {
            for (BannerCharacter bc : characters) {
                System.out.print(bc.getPattern()[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BannerCharacter O = new BannerCharacter('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        BannerCharacter P = new BannerCharacter('P', new String[]{
                "***** ",
                "*    *",
                "*    *",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        });

        BannerCharacter S = new BannerCharacter('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " *****",
                "      *",
                "      *",
                "***** "
        });

        BannerCharacter[] banner = {O, O, P, S};
        printBanner(banner);
    }
}
