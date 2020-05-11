
public class nesting {
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        // The outer loop is always going to change faster. It will iterate first and then the inner loop will iterate, so on and so forth until there are no more possible iterations. This would mean that the variable is always controlled by the outer loop.
        // Changing the n loop to the outside will cause all letters of each number printing first. Number takes precedence over character.
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        // All of the answers print on separate lines because println() creates a linebreak between each iteration
        // Nothing will print because the 'b' variable will not be accessible/the b variable is out of scope
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
            System.out.println();
        }

        System.out.println("\n");

    }
}

//* Question 1
// The inner loop changes faster than the outer loop. The outer loop relies (is controlled by) on the inner loop.

//* Question 2
// With (c) on the inside and (n) on the outside, the letters print first.

//* Question 3
// Adding "ln" makes the string print out on new lines.

//* Question 4
// When "System.out.println()" is in the outer loop, the output prints as a table instad of a list