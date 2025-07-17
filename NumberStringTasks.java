public class NumberStringTasks {


    public static void convertNumberString() {
        int num = 123;
        String numAsString = Integer.toString(num);
        int stringToNum = Integer.parseInt(numAsString);

        System.out.println("Original Number: " + num);
        System.out.println("Converted to String: " + numAsString);
        System.out.println("Converted back to Number: " + stringToNum);
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {
 
        convertNumberString();


        String original = "hello world";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
