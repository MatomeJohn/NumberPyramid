public class NumberPyramid {

    public static void main(String[] args) {
        int rows = 4;  // Number of rows for the pyramid
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
