public class StringComparison {
    String str1 = "hello";
    String str2 = "Hello";

    public void compare() {
        boolean isEqual = str1.equals(str2);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println(str1.equals(str2));//False
        System.out.println(str1.equalsIgnoreCase(str2)); //true
    }


}
