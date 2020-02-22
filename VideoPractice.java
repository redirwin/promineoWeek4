/**
 * VideoPractice
 */
public class VideoPractice {

    public static void main(String[] args) {
        
        String firstName = "Sally";
        String lastName = "Smith";
        System.out.println(firstName + " " + lastName);
    
        String tripleHi = multiplyString("Hi", 3);
        System.out.println(tripleHi);

        System.out.println(firstName.concat(lastName));
        System.out.println(firstName);

        StringBuilder fullName = new StringBuilder("Sam");
        fullName.append(" Smith");
        System.out.println(fullName.toString());

    }

    public static String multiplyString(String str, int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(str);
        }
        return result.toString();
    }
}