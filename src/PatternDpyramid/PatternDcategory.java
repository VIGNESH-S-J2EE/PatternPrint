package PatternDpyramid;

public class PatternDcategory {


    //Print Pattern - 1
     /*
        Like This - > star pattern
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

       */
    static void pattern1(int n) {
        // Upper Half - outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Half - outer loop
        for (int row = 1; row < n; row++) {
            // create a inner loop
            for (int col = 1; col <= (n - row) ; col++) {
                //print star
                System.out.print("* ");
            }
            // print nextline
            System.out.println();
        }
    }




    //pattern -> 2 - number pattern
    /*
1
12
123
1234
12345
1234
123
12
1

    */
    static void pattern2(int n) {
        // Upper Half - outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        // Lower Half - outer loop
        for (int row = 1; row < n; row++) {
            // create a inner loop
            for (int col = 1; col <= (n - row) ; col++) {
                //print number
                System.out.print(col);
            }
            //print nextline
            System.out.println();
        }
    }



    //pattern - 3

    //Print Pattern - 3
     /*
        Like This - > star pattern
* * * *
* * *
* *
*
* *
* * *
       */

    static void pattern3(int n) {
        // Upper Half - outer loop
        for (int row = 1; row < n; row++) {
            // inner loop
            for (int col = 1; col <= (n - row) + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower Half - outer loop
        for (int row = 1; row < n; row++) {
            // inner loop
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // print nextline
            System.out.println();
        }
    }



    /*
       pattern - 4
    E
   D E
  C D E
 B C D E
A B C D E

   */
    public void pattern4 (int n) {
        // outet loop
        for (int row = 0; row < n; row++) {
            // print space for alignment
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            // print character from ( E - row ) to E
            for (char ch = (char) ('E' - row); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            // print nextLine
            System.out.println();
        }
    }



    /*
          pattern - 7
            1                         space = col <= n - row - 1
          1   1                       num = num * (i - j) / (j + 1);
        1   2   1
      1   3   3   1               loops start at - 0
    1   4   6   4   1

  */
    public void pattern7(int n) {
        // create outer loop
        for (int row = 0; row < n; row++) {
            // print leading space
            for (int col = 0; col < n - row - 1; col++) {
                System.out.print(" ");
            }
            int num = 1;

            for (int col = 0; col <= row; col++) {
                System.out.print(num + " ");
                num = num * (row - col) / (col + 1);
            }
            // print nextLine
            System.out.println();
        }
    }


       /*

        // pattern - 8 => number pyramid
             separate two half the triangle to print easily
             1|          row = 1 , space = 3 , n = 4 , num = 4
           2 1| 2         row = 2 , space = 2 , n = 4 , num = 4  => Formula - leading space
         3 2 1| 2 3       row = 3 , space = 1 , n = 4 , num = 4          1) col < n - row
       4 3 2 1| 2 3 4     row = 4 , space = 0 , n = 4 , num = 4          2) col = 1; col >= 1; col-- print decreasing num
                                    mainly print two empty space         3) col = 2; col <= row; col ++ print increasing num
    */

    public void pattern8(int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // create inner loop
            for (int col = 1; col <= n - row; col++) {
                // print space
                System.out.print("  ");
            }
            // print decreasing numbers
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            // print increasing num start with '2'
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }
            // print nextLine
            System.out.println();
        }

    }

}
