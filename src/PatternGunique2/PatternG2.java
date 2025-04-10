package PatternGunique2;

public class PatternG2 {

    /*
        pattern - 6
          1 2 3 4 17 18 19 20
            5 6 7 14 15 16
              8 9 12 13
                10 11
    */
    public void pattern6 (int n) {
        int count = 1;
        int total = n * (n + 1);
        int rightStart = total;

        for (int row = 0; row < n; row++) {
            // print space
            for (int col = 0; col < row * 2; col++) {
                System.out.print(" ");
            }

            int leftCount = n - row;
            int rightCount  = leftCount;

            //print left numbers
            for (int col = 0; col < leftCount; col++) {
                System.out.print(count++ + " ");
            }

            rightStart -= rightCount;

            // print right numbers
            for (int col = 0; col < rightCount; col++) {
                System.out.print((rightStart + col) + " ");
            }
            // print nextLine
            System.out.println();
        }
    }

    /*
        pattern - 7
     *      *
     *   *  *   *
     *      *      *
     */
    public void pattern7 (int n) {
        int i = 3;
        int j = 13; // Total width of the pattern (adjusted for perfect look)

        for (int row = 0; row < i; row++) {
            for (int col = 0; col < j; col++) {
                // Positions of stars in each row (manually placed for easy understanding)
                if (row == 0 && (col == 5 || col == 11)) {
                    System.out.print("*");
                } else if (row == 1 && (col == 2 || col == 6 || col == 8 || col == 12)) {
                    System.out.print("*");
                } else if (row == 2 && (col == 0 || col == 6 || col == 12)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
