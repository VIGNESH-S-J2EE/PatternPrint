package PatternCpyramid;

public class PatternCcategory {

     /*
    // pattern - 1

   Like This - > number changing pyramid pattern

    1
    23   => formula is number are increasing by 1 so just use to increase any value to achieve
    456     => num = 1 ; num++ on inside a loop.

  */

    public void pattern1(int n) {
        // create a variable
        int num = 1;
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= row; col++) {
                // print number
                System.out.print(num + " ");
                num++;
            }
            // print nextline
            System.out.println();
        }
    }



      /*
    // pattern - 2

   Like This - >

    *****                                   n = 5; row = 1; space = 0; star = 5
     ****   => reverse the operation        n = 5; row = 2; space = 1; star = 4
      ***                                   n = 5; row = 3; space = 2; star = 3
       **                                   n = 5; row = 4; space = 3; star = 2
        *                                   n = 5; row = 5; space = 4; star = 1

  */

    public void pattern2(int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col < row; col++) {
                // print space
                System.out.print(" ");
            }
            // print star method to use another col loop
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            // print nextline
            System.out.println();
        }
    }



      /*
    // pattern - 3

   Like This - > pure pyramid
            *      => the condition 1 - first run on a loop given n value
           ***      row = 1; space = 3; n = 4; star = 1;
          *****     row = 2; space = 2; n = 4; star = 3;   => formula "n - row" to print empty space
         *******    row = 3; space = 1; n = 4; star = 5;   => formula for star print
                    row = 4; space = 0; n = 4; star = 7;           star = (2 * i) - 1;
  */

    public void pattern3(int n) {
        // create a outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= n - row; col++) {
                //print leading space
                System.out.print(" ");
            }
            for (int col = 1; col <= (2 * row) - 1; col++) {
                // print star
                System.out.print("*");
            }
            // print nextLine
            System.out.println();
        }
    }




    /*
    // pattern - 4

   Like This - > number pyramid
            1      => the condition 1 - first run on a loop given n value
           2 2      row = 1; space = 3; n = 4; star = 1;
          3 3 3     row = 2; space = 2; n = 4; star = 3;   => formula "n - row" to print empty space
         4 4 4 4    row = 3; space = 1; n = 4; star = 5;   => formula for star print
                    row = 4; space = 0; n = 4; star = 7;           star = col <= row;
  */

    public void pattern4(int n) {
        // create a outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= n - row; col++) {
                //print leading space
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                // print number
                System.out.print(row + " ");
            }
            // print nextLine
            System.out.println();
        }
    }




         /*
    // pattern - 5

   Like This - > reverse number pyramid
                => the condition 1 - first run on a loop given n value
     1 2 3 4        row = 1; space = 0; n = 4; star = 4;
      2 3 4         row = 2; space = 1; n = 4; star = 3;   => formula "row - 1" to print empty space
       3 4          row = 3; space = 2; n = 4; star = 2;   => formula for star print
        4           row = 4; space = 3; n = 4; star = 1;           star = col = row ; col <= n;
  */

    public void pattern5(int n) {
        // create a outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= row - 1; col++) {
                //print leading space
                System.out.print(" ");
            }
            for (int col = row; col <= n; col++) {
                // print number
                System.out.print(col + " ");
            }
            // print nextLine
            System.out.println();
        }
    }



    /*
     pattern - 6
    a
   B c
  D e F
 g H i J
k L m N o

 */
    public void pattern6(int n) {
        char ch = 'a';

        for (int row = 1; row <= n; row++) {
            // print leading space
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // print character
            for (int col = 1; col <= row; col++) {
                if ((col % 2) == 0) {
                    System.out.print(Character.toUpperCase(ch) + " ");
                }
                else {
                    System.out.print(Character.toLowerCase(ch) + " ");
                }
                ch++; // move next character
                if (ch > 'z') ch = 'a';
            }
            // print nextLine
            System.out.println();
        }
    }
}
