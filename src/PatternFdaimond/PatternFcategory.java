package PatternFdaimond;

public class PatternFcategory {

      /*

        // pattern - 1 =>  pure pyramid
             *              Upper half
            ***         row = 1 , space = 3 , n = 4 , star = 1    formula
           *****        row = 2 , space = 2 , n = 4 , star = 3          for leading space
         *********      row = 3 , space = 1 , n = 4 , star = 5                  col <= n - row
       *************    row = 4 , space = 0 , n = 4 , star = 7          for star : col (2 * row) - 1;
        ***********          Lower half
          *******       row = 1 , space = 0 , n = 4 , satr = 5
            ***         row = 2 , space = 1 , n = 4 , star = 3          for leading space
             *          row = 3 , space = 2 , n = 4 , star = 1                  col <= row;
                        row = 4 , space = 3 , n = 4 , star = 0          for star :col <= (n - row) * 2 - 1;
         */


    public void pattern1(int n) {
        // Upper half of pyramid
        // create a outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= n - row; col++) {
                // print the leading space
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                // print the pyramid star
                System.out.print("*");
            }
            // print nextLine
            System.out.println();
        }
        // Lower half of pyramid
        // create a outer loop
        for (int row = 1; row < n; row++) {
            // inner loop
            for (int col = 1; col <= row; col++) {
                // print leading space
                System.out.print(" ");
            }
            for (int col = 1; col <= (n - row) * 2 - 1; col++) {
                // print the pyramid star
                System.out.print("*");
            }
            // print the nextLine
            System.out.println();
        }
    }



    /*
          pattern - 2

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
  */
    public void pattern2 (int n) {
        // Upper Half
        for (int row = 0; row < n; row++) {
            //print left star
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }

            // Space in the middle
            for (int col = 0; col < 2 * row; col++) {
                System.out.print(" ");
            }

            // print right star
            for (int col = 0; col < n - row; col++) {
                System.out.print("*");
            }
            // print nextLine
            System.out.println();
        }
        // Lower Half
        for (int row = 0; row < n; row++) {
            // print left star
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            // print middle space
            for (int col = 0; col < 2 * (n - row - 1); col++) {
                System.out.print(" ");
            }
            //print right star
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            // print nextLine
            System.out.println();
        }
    }



    /*
        pattern - 3
              *
             * *
            *   *    => upper
           *     *
          *       *
           *     *
            *   *   => lower
             * *
              *

                 Upper  half
           row = 1 , space = 4 , n = 4 , star = 1    formula
           row = 2 , space = 3 , n = 4 , star = 3          col <= n - row  -> space  upper half pyramid
           row = 3 , space = 2 , n = 4 , star = 5          star -> col = 1; col <= 2 * row - 1
           row = 4 , space = 1 , n = 4 , star = 7

           lower  half
           row = 1 , space = 2 , n = 4 , star = 5    formula
           row = 2 , space = 1 , n = 4 , star = 3        space = col <= row pyramid
           row = 3 , space = 0 , n = 4 , star = 1         star ->(n - row) * 2 - 1
       */
    public void pattern3 (int n) {
        // upper pyramid
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop for leading space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (col == 1  || col == 2 * row - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            // print mextLine
            System.out.println();
        }
        // lower pyramid
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // print leading space
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= (n - row)*2-1; col++) {
                if (col == 1 || col == (n - row) * 2 - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            // print nextLine
            System.out.println();
        }
    }


    /*
     pattern - 4
           1                    two parts - > UPPER and LOWER
          212                            print two loop separately
         32123                                   1) descending order number
        4321234                                  2) Ascending order number
         32123
          212
           1
*/
    public void pattern4 (int n) {
        // Upper half -> create outer loop
        for (int row = 1; row <= n; row++) {
            // print leading space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // print descending numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            // print ascending numbers
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            // print nextLine
            System.out.println();
        }
        // Lower half -> create outer loop
        for (int row = n - 1; row >= 1; row--) {
            //print leading space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // print descending numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col);
            }
            // print ascending numbers
            for (int col = 2; col <= row; col++) {
                System.out.print(col);
            }
            // print nextLine
            System.out.println();
        }
    }
}
