package PatternB;

public class PatternBcategory {


    //Print Pattern - 1
    /*
        Like This - >
       *
       * *
       * * *
    */

    public void pattern1(int n) {
        // create a outer loop
        for (int row = 1; row < n; row++) {
            // create a inner loop
            for (int col = 1; col < row; col++) {
                //print the Star Pattern "* "
                System.out.print("* ");
            }
            //print the nextLine()
            System.out.println();
        }
    }



    //Print Pattern - 2
      /*
        Like This - >
      * * *
      * *
      *
    */
    public void pattern2(int n) {
        // create a outer loop
        for (int row = 1; row <= n; row++) {
            // create a inner loop
            for (int col = 1; col < (n + 1) - row; col++) {
                //print the Star Pattern "* "
                System.out.print("* ");
            }
            //print the nextLine()
            System.out.println();
        }
    }



    //Print Pattern - 3 -> number pattern
     /*
        Like This - > number pattern

        1
        12
        123
    */
    public void pattern3(int n) {
        // create a outer loop
        for (int row = 1; row < n; row++) {
            // create a inner loop
            for (int col = 1; col < row; col++) {
                //print the number Pattern
                System.out.print(col);
            }
            //print the nextLine()
            System.out.println();
        }
    }



    //Print Pattern - 4 -> number pattern
     /*
        Like This - > number pattern

        123
        12
        1
    */
    public void pattern4(int n) {
        // create a outer loop
        for (int row = 1; row < n; row++) {
            // create a inner loop
            for (int col = 1; col < (n - row) + 1; col++) {
                //print number
                System.out.print(col);
            }
            // print nextline
            System.out.println();
        }
    }




    //pattern - 5
    //Print Pattern - 5
     /*
        Like This - > number pattern
1                               11              -> 1 + 1 => 2  (2 % 2) == 0 -> return 1
0 1                 ->          21 22           -> 2 + 1 -> 3  (3 % 2) == 1 -> return 0
1 0 1                           31 32 33
0 1 0 1                         41 42 43 44
       */
    public void pattern5(int n) {
        // create a outer loop
        for (int row = 1; row < n; row++) {
            // create a inner loop
            for (int col = 1; col <= row; col++) {
                //print the number Pattern
                if ((row + col) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            //print the nextLine()
            System.out.println();
        }
    }
}
