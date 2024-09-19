public class MyFirstProgram {
    public static void main(String[] args) {
      System.out.println("Hello World");
      
      String name = "Bernardo";
      System.out.println(name);

      /*int myNum = 5;
      float myFloatNum = 5.99f;
      char myLetter = 'D';
      boolean myBool = true;
      String myText = "Hello";*/

      int width = 6;
      int length = 4;
      int area = width * length;

      System.out.println("The area of the rectangle is: " + area);

      float floatNumber = (float) area;

      System.out.println(floatNumber);

      String iade = "Universidade Europeia";
      System.out.println("The length of the iade string is: " + iade.length());

      System.out.println(iade.toUpperCase());   
      System.out.println(iade.toLowerCase());

      // Finding a Character in a String
      /* The indexOf() method returns the index (the position) 
      of the first occurrence of a specified text in a string(including whitespace)*/

      System.out.println(iade.indexOf("Europeia"));

      // for more string methods: https://www.w3schools.com/java/java_ref_string.asp

      if (width == length){
        System.out.println("Its a Square!");
      } else if(width > length){
        System.out.println("Its a Rectangle!");
      }else{
        System.out.println("Wtf is that?!");
      }
      /* Short Hand if...else
      There is also a short-hand if else, which is known as the 
      ternary operator because it consists of three operands.

      It can be used to replace multiple lines of code with a single line, 
      and is most often used to replace simple if else statements: */

      // Syntax
      // variable = (condition) ? expressionTrue :  expressionFalse;

      String result = (width == length) ? "Its a Square!" : "Its a Rectangle!";
      System.out.println(result);
    }  
}