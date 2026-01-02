package OOPSBannerApp;

public class UC2 {
    public static void main(String[] args) {


                String[] bannerLines ={
                "   ***       ***      ******     ****** ",
                "  ** **     ** **     **    **   **      ",
                " **   **   **   **    **    **     **      ",
                " **   **   **   **    ******     ****** ",
                " **   **   **   **    **              **",
                "  ** **     ** **     **             **  ",
                "   ***       ***      **        ****** "
        };


        for (String line : bannerLines) {

        }

        String banner = String.join("\n", bannerLines);


        for (int i = 0; i < 1; i++) {
            System.out.println(banner);
        }
    }
}
