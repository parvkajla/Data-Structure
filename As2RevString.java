class As2RevString{

    public static String reverseString(String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }

        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {

        String input = "hello";
        String output = reverseString(input);
        System.out.println(output);

    }
}