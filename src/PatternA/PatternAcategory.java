package PatternA;

public class PatternAcategory {

    // Print Pattern - 1
    /*
        Like This - >
        ****
        ****
        ****
    */
    public void pattern1(int n) {
        //create a row loop
        for (int row = 1; row < n; row++) {
            //create a col loop
            for (int col = 1; col < n; col++) {
                //print the Star pattern "* "
                System.out.print("* ");
            }
            //print the nextLine
            System.out.println();
        }
    }



    // Print Pattern - 2
    /*
        Like This - >
        1111
        2222
        3333
    */
    public void pattern2(int n) {
        //create a row loop
        for (int row = 1; row < n; row++) {
            //create a col loop
            for (int col = 1; col < n; col++) {
                //print the Star pattern "* "
                System.out.print(row + " ");
            }
            //print the nextLine
            System.out.println();
        }
    }



    // Print Pattern - 3
    /*
        Like This - >
        1234
        1234
        1234
    */
    public void pattern3(int n) {
        //create a row loop
        for (int row = 1; row < n; row++) {
            //create a col loop
            for (int col = 1; col < n; col++) {
                //print the Star pattern "* "
                System.out.print(col + " ");
            }
            //print the nextLine
            System.out.println();
        }
    }




    /*
   // pattern - 4

  Like This - >

   ******
   *    *          ->  using if else condition to achieve the empty space
   *    *          -> like formula are (i = 1 || j = 1 || i = n || j = n)
   ******

 */
    public void pattern4(int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            //inner loop
            for (int col = 1; col <= n; col++) {
                // use " if " to print star
                if (row == 1 || col == 1 || row == n || col == n) {
                    System.out.print("*");

                } else { // print only empty space
                    System.out.print(" ");
                }
            }
            // print nextline
            System.out.println();
        }
    }
}
