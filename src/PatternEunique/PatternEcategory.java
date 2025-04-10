package PatternEunique;

public class PatternEcategory {

        /*

        // pattern - 1

                ****       row = 1 , space = 3 , n = 4 , star = 4
               ****        row = 2 , space = 2 , n = 4 , star = 4  => Formula - leading space
              ****         row = 3 , space = 1 , n = 4 , star = 4          1) col < n - row
             ****          row = 4 , space = 0 , n = 4 , star = 4          2) col <= n = print star

    */

    public void pattern1(int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // create inner loop
            for(int col = 1; col <= n - row; col++) {
                // print space
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= n; col ++) {
                System.out.print("*");
            }
            // print nextLine
            System.out.println();
        }
    }



    /*

        // pattern - 2

                1234       row = 1 , space = 3 , n = 4 , star = 4
               1234        row = 2 , space = 2 , n = 4 , star = 4  => Formula - leading space
              1234         row = 3 , space = 1 , n = 4 , star = 4          1) col < n - row
             1234          row = 4 , space = 0 , n = 4 , star = 4          2) col <= n = print star

    */

    public void pattern2(int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // create inner loop
            for(int col = 1; col <= n - row; col++) {
                // print space
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= n; col ++) {
                System.out.print(col + " ");
            }
            // print nextLine
            System.out.println();
        }
    }

    /*
  pattern - 3
4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4
*/
    public void pattern3 (int n) {
        // create outer loop
        for (int row = 0; row < 2 * n - 1; row++) {
            // create inner loop
            for (int col = 0; col < 2 * n - 1; col++) {
                int top = row;
                int left = col;
                int right = (2 * n - 2) - col;
                int bottom = (2 * n - 2) - row;

                int min = Math.min(Math.min(top , bottom) , Math.min(left , right));
                System.out.print((n - min) + " ");
            }
            System.out.println();
        }
    }




       /*

        // pattern - 4 =>  pure pyramid

                *      *
                **    **
                ***  ***    => Upper half
                ********
            -----------------
                ********
                ***  ***        => Lower half
                **    **
                *      *
                          Upper left half
             row = 1 , space = 6 , n = 4 , star = 1    formula
             row = 2 , space = 4 , n = 4 , star = 2          col <= row for left half pyramid
             row = 3 , space = 2 , n = 4 , star = 3          space = (n - i) * 2
             row = 4 , space = 0 , n = 4 , star = 4

         */

    public void pattern4(int n) {
        // Upper left half Pyramid
        // create a outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= row; col++) {
                // print star
                System.out.print("*");
            }
            // print leading space
            for (int col = 1; col <= (n - row) * 2; col++) {
                System.out.print(" ");
            }
            // print right star
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            //print nextLine
            System.out.println();
        }
            /*
                        Lower half
             row = 1 , space = 0 , n = 4 , star = 4    formula
             row = 2 , space = 2 , n = 4 , star = 3          col <= n - row + 1 for left half pyramid
             row = 3 , space = 4 , n = 4 , star = 2          space = (row - i) * 2
             row = 4 , space = 6 , n = 4 , star = 1

             */
        // lower half pyramid
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= n - row + 1; col++) {
                // print star
                System.out.print("*");
            }
            // print leading star
            for (int col = 1; col <= (row - 1) * 2; col++) {
                System.out.print(" ");
            }
            // print right star pyramid
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            // print nextLine
            System.out.println();
        }
    }
}
