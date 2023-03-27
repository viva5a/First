package Lesson7;

public class Lesson7 {


    public class lesson7 {

        public static void main(String[] args) {
            //String pool

            String HelloWorld = "Hello world";
            String string = new String("string");
            String string1 = "string";
            String string2 = "string";
            String string3 = new String("string");
            String string4 = new String("string");


            System.out.println("string1 == string2 " + (string1 == string2));
            System.out.println("string1 == string3 " + (string1 == string3));
            System.out.println("string3 == string4 " + (string3 == string4));

            System.out.println("string1 equals string34" + (string1.equals(string2)));
            System.out.println("string3 equals string4 " + (string1.equals(string2)));
        }
    }

}
