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

        // enhanced for-loop traversal
        for (String line : bannerLines) {
            // traversal demonstration
        }

        // join lines using String.join()
        String banner = String.join("\n", bannerLines);

        // traditional for-loop for printing
        for (int i = 0; i < 1; i++) {
            System.out.println(banner);
        }
    }
}
