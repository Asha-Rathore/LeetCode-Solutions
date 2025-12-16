public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String reverse = "";
        String str = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        reverse = new StringBuilder(str).reverse().toString();

        return str.equals(reverse);
    }

    static void main(String[] args) {
        boolean isValid = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(isValid);
    }
}
