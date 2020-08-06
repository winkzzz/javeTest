package ph.mobile.training.extra;

public class LoopPyramid {
    public static void main(String[] args) {
        for (int row = 0; row <= 9; row++) {
            // space before number
            for (int col = 9; col >= row; col--) {
                System.out.print(" ");
            }

            // number here
            for (int col = 0; col <= row; col++) {
                System.out.print(" "+ col);
            }
            // space for rows
            System.out.println();
        }
    }
}
