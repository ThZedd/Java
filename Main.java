{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //Widening Casting
        //Widening casting is done automatically when passing a smaller size type to a larger size type:
        int myInt = 10;

        System.out.println(myInt);

        System.out.println((double) myInt);

        //Narrowing Casting
        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        double mySecondDouble = 9.78;
        int mySecondInt = (int) mySecondDouble;

        System.out.println(mySecondDouble);

        System.out.println(mySecondInt);

        // String Length
        // A String in Java is actually an object, which contain methods that can perform certain operations on strings. For example, the length of a string can be found with the length() method:
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("The length of the txt string is: " + txt.length());
        // or
        int txtLength = txt.length();

        System.out.println("The length of the txt string is: " + txtLength);

        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase());   // Outputs "hello world"

        //Finding a Character in a String
        //The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indexOf("locate")); // Outputs 7

        //String Concatenation
        //The + operator can be used between strings to combine them. This is called concatenation:
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        // You can also use the concat() method to concatenate two strings:
        System.out.println(firstName.concat(lastName));

        System.out.println(Math.max(10, 15)); // this will determinate which number is higher
        System.out.println(Math.min(10, 15)); // this will determinate which number is lower
        System.out.println(Math.sqrt(128)); // this will say the square root
        System.out.println(Math.abs(-10)); // this will return the same number but as a positive
        System.out.println(Math.random()); // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println((int) (Math.random() * 101)); // To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }


    }
}
