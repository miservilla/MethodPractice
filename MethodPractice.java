/**
 * CS152 Lab 4 -- Welcome to Methods.
 *
 * Implement all the methods described below.
 *
 * Student name: YOUR NAME GOES HERE.
 */
public class MethodPractice {

    /**
     * Returns the difference of its arguments.
     * @param x First argument
     * @param y Second argument
     * @return Difference of x and y
     */
    public static int diffTwo( int x, int y ) {
        return x - y;
    }
    /**
     * Is argument even?
     * @param x Value to check.
     * @return True if x is an even number, false otherwise.
     */
    public static boolean isEven( int x ) {
                return (x % 2 == 0);
    }
    /**
     * Does the given string contain the letter M (either upper or
     * lower case)?
     * @param x String to check
     * @return True if x contains M, false otherwise.
     */
    public static boolean containsM( String x ) {
        String lowerCase = x.toLowerCase();
        return lowerCase.contains("m");
    }

    /**
     * Where is the location of the letter M (upper or lower case) in
     * the given string?
     * @param x String to check
     * @return 0 based location of first occurrence of M in x,
     *         -1 if M is not present.
     */
    public static int indexOfM( String x ) {
        String toLowerCase = x.toLowerCase();
        int index = toLowerCase.indexOf("m");
        return index;
    }
    /**
     * This method returns a response based on the string input:
     *     Apple => Orange
     *     Hello => Goodbye!
     *     meat => potatoes
     *     Turing => Machine
     *     Yay! => \o/
     * Any other input should be responded to with:
     *     I don't know what to say to that.
     * @param input The input string
     * @return Corresponding output string.
     */
    public static String respond( String input ) {
        String response;
        switch (input) {
            case "Apple":
                response = "Orange";
                break;
            case "Hello":
                response = "Goodbye!";
                break;
            case "meat":
                response = "potatoes";
                break;
            case "Turing":
                response = "Machine";
                break;
            case "Yay!":
                response = "\\o/";
                break;
            default:
                response = "I don't know what to say to that.";
                break;
        }
        return response;
    }
    /**
     * Average up to five positive numbers. Any non-positive values are
     * not included in the average. (Note: zero is not positive.)
     * @param a First value
     * @param b Second value
     * @param c Third value
     * @param d Fourth value
     * @param e Fifth value
     * @return Average of the positive input values. If none are positive, returns -1.
     */
    public static double averagePositives( int a, int b, int c, int d, int e ) {
        int sumNum = 0;
        int total = 0;
        double average;
        int[] input = {a, b, c, d, e};
        for (int num : input) {
            if (num > 0) {
                sumNum += num;
                total ++;
            }
        }
        if (total == 0) {
            average = -1;
        } else {
            average = (double) sumNum / total;
        }
        return average;
    }
    /**
     * A method to either divide by 2 an even number, or square an odd number.
     * @param x, the integer to test.
     * @return result, either the quotient or product of the method.
     */
    public static int squareOddHalveEven(int x){
        int result;
        if (x % 2 == 0){
            result = x / 2;
        } else result = x * x;
        return result;
    }
    /**
     * This method calculates total cost of meal including calculated tip.
     * Meal must be > 0 and tip must be > 0 and 0.5 or less.
     * @param meal, the cost of the meal
     * @param tip, the tip.
     * @return total, the sum of tip and meal. Will return
     * -1.0 if meal is < 1 or 0.5 < tip <= 0.
     */
    public static double calculatePayment(int meal, double tip) {
        double total;
        if ((meal <= 0) || (tip <= 0 || tip > 0.5)) {
            total = -1;
            return total;
        }
        total = meal * tip + meal;
        return total;
    }



    // This code tests your program's completeness.
    public static void main(String[] args) {
        int completeness = 0;

        if( diffTwo(2,3) == -1 ) { completeness++; }
        if( diffTwo(4,-5) == 9 ) { completeness++; }

        if( !isEven(-3) ) { completeness++; }
        if( isEven(2) ) { completeness++; }
        if( isEven(0) ) { completeness++; }

        if( containsM( "man" ) ) { completeness++; }
        if( !containsM( "dog" ) ) { completeness++; }
        if( containsM( "EXCLAIMS!" ) ) { completeness++; }

        if( indexOfM( "man" ) == 0 ) { completeness++; }
        if( indexOfM( "EXCLAIMS!" ) == 6 ) { completeness++; }
        if( indexOfM( "dog" ) == -1 ) { completeness++; }
        if( indexOfM( "klmmMmmM" ) == 2 ) { completeness++; }
        if( indexOfM( "klMMmMMm" ) == 2 ) { completeness++; }

        if( respond( "Apple" ).equals( "Orange" ) ) { completeness++; }
        if( respond( "Hello" ).equals( "Goodbye!" ) ) { completeness++; }
        if( respond( "meat" ).equals( "potatoes" ) ) { completeness++; }
        if( respond( "Turing" ).equals( "Machine" ) ) { completeness++; }
        if( respond( "Yay!" ).equals( "\\o/" ) ) { completeness++; }
        if( respond( "xxx" ).equals( "I don't know what to say to that." ) ) { completeness++; }

        if( averagePositives( 12,13,12,13,12 ) == 12.4 ) { completeness++; }
        if( averagePositives( 0,0,0,0,0 ) == -1 ) { completeness++; }
        if( averagePositives( 0,0,15,0,-2 ) == 15 ) { completeness++; }
        if( averagePositives( 100,-3,4021,-2,13 ) == 1378 ) { completeness++; }


//         UNCOMMENT AFTER IMPLEMENTING squareOddHalveEvenMethod
         if( squareOddHalveEven( 4 ) == 2 ) { completeness++; }
         if( squareOddHalveEven( 0 ) == 0 ) { completeness++; }
         if( squareOddHalveEven( 3 ) == 9 ) { completeness++; }


//         UNCOMMENT AFTER IMPLEMENTING calculatePayment
         if( calculatePayment( 0, .3 ) == -1 ) { completeness++; }
         if( calculatePayment( 10, .2 ) == 12.0 ) { completeness++; }
         if( calculatePayment( 100, .6 ) == -1 ) { completeness++; }
         if( calculatePayment( 120, .32 ) == 158.4 ) { completeness++; }

        System.out.println( "Your program's completeness is currently: " + completeness + "/30" );
    }

}
