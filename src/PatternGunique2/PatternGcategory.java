package PatternGunique2;

public class PatternGcategory {
    
         /*
                             row = 1 , space = 3 , n = 4 , star = 1    formula
        pattern - 1          row = 2 , space = 2 , n = 4 , star = 2          col <= 2 * row - 1   pyramid
                             row = 3 , space = 1 , n = 4 , star = 3          space = n - row
             *               row = 4 , space = 0 , n = 4 , star = 4
            * *
           *   *
          *     *
         *********
     */

    public void pattern1 (int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= 2 * row - 1; col++) {
                if (row == n || col == 1 || col == 2 * row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // print nextLine
            System.out.println();
        }
    }


   
    /*
                         row = 1 , space = 0 , n = 4 , star = 7    formula
    pattern - 2         row = 2 , space = 1 , n = 4 , star = 5          col <= 2 * (n - row + 1 ) - 1  pyramid
                            row = 3 , space = 2 , n = 4 , star = 3          space =  row - 1
     *********              row = 4 , space = 3 , n = 4 , star =  1
      *     *
       *   *
        * *
         *
 */
    public void pattern2 (int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop for leading space
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*(n - row + 1) - 1; col++) {
                if (row == 1 || col == 1 || col == 2 * (n - row + 1) -1) {
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
                pattern - 3

                1 2 3 4
                 2 3 4
                  3 4
                   4
                  3 4
                 2 3 4
                1 2 3 4

                 Upper  half
             row = 1 , space = 0 , n = 4 , num = 4    formula
             row = 2 , space = 1 , n = 4 , num = 3          col <= row - 1 -> space  upper half pyramid
             row = 3 , space = 2 , n = 4 , num = 2          star -> col = row; col <= n
             row = 4 , space = 3 , n = 4 , num = 1

             lower  half
             row = 1 , space = 2 , n = 4 , num = 3,4    formula
             row = 2 , space = 1 , n = 4 , num = 2,3,4          col <= n - row - 1 -> space  upper half pyramid
             row = 3 , space = 0 , n = 4 , num = 1,2,3, 4          star -> col = n - row; col <= n

     */
    public void pattern3 (int n) {
        // upper half
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // inner loop
            for (int col = 1; col <= row - 1; col++) {
                // print leading space
                System.out.print(" ");
            }
            // print num
            for (int col = row; col <= n; col++) {
                System.out.print(col+" ");
            }
            // print nextLine
            System.out.println();
        }
        // lower half
        // create outer loop
        for (int row = 1; row < n; row++) {
            //inner loop
            for (int col = 1; col <= n - row - 1; col++) {
                // print leading space
                System.out.print(" ");
            }
            // print num
            for (int col = n - row; col <= n; col++) {
                System.out.print(col + " ");
            }
            // print nextline
            System.out.println();
        }
    }




    /*
            pattern - 4

     *********
      *     *
       *   *
        * *
         *
        * *
       *   *
      *     *
     *********

             Upper  half
             row = 1 , space = 0 , n = 4 , star = 4   formula
             row = 2 , space = 1 , n = 4 , star = 3          col <= row - 1 -> space  upper half pyramid
             row = 3 , space = 2 , n = 4 , star = 2          star -> col = 1; (n - row + 1)
             row = 4 , space = 3 , n = 4 , star = 1

             lower  half
             row = 1 , space = 3 , n = 4 , star = 2    formula
             row = 2 , space = 2, n = 4 ,  star = 3        space = col <= n - row - 1 pyramid
             row = 3 , space = 1 , n = 4 , star = 4         star -> row + 1

     */
    public void pattern4(int n) {
        // upper pyramid
        //create outer loop
        for (int row = 1; row <= n; row++) {
            // leading space
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= n - row + 1; col++) {
                if(row == 1 || col == 1 || col == n - row +  1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            // print nextLine
            System.out.println();
        }
        // lower pyramid
        // create outer loop
        for (int row = 1; row < n; row++) {
            // inner loop leading space
            for (int col = 1; col <= n - row - 1; col++) {
                System.out.print(" ");
            }
            // print star
            for (int col = 1; col <= row + 1; col++) {
                if (row == n - 1 || col == 1 || col == row + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            // print nextLine
            System.out.println();
        }
    }

    
    
    /*
                pattern - 5

      *     *
       *   *
        * *
         *
        * *
       *   *
      *     *

             Upper  half
             row = 1 , space = 0 , n = 4 , star = 4   formula
             row = 2 , space = 1 , n = 4 , star = 3          col <= row - 1 -> space  upper half pyramid
             row = 3 , space = 2 , n = 4 , star = 2          star -> col = 1; (n - row + 1)
             row = 4 , space = 3 , n = 4 , star = 1

                        lower  half
             row = 1 , space = 3 , n = 4 , star = 2    formula
             row = 2 , space = 2, n = 4 ,  star = 3        space = col <= n - row - 1 pyramid
             row = 3 , space = 1 , n = 4 , star = 4         star -> row + 1


     */
    public void pattern5 (int n) {
        // create outer loop
        for (int row = 1; row <= n; row++) {
            // leading space
            for (int col = 1; col <= row - 1; col++) {
                System.out.print(" ");
            }
            //print star
            for (int col = 1; col <= n - row + 1; col++) {
                if (col == 1 || col == n - row + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            // print nextLine
            System.out.println();
        }
        // lower pyramid
        for (int row = 1; row < n; row++) {
            // leading space
            for(int col = 1; col <= n - row - 1; col++) {
                System.out.print(" ");
            }
            //print star
            for (int col = 1; col <= row + 1; col++) {
                if (col == 1 || col == row + 1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            //print nextLine
            System.out.println();
        }
    }

}
