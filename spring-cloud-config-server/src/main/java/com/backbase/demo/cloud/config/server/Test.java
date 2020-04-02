package com.backbase.demo.cloud.config.server;

public class Test {

    public static void main (final String[] args)
    {
        System.out.println("here");
        assertEquals(true, isPalindrome("a"));

        assertEquals(true, isPalindrome("madam"));

        assertEquals(true, isPalindrome("abba"));

        assertEquals(true, isPalindrome("$2!2$"));

        assertEquals(false, isPalindrome("Scopus"));
    }
    public static boolean isPalindrome (String inputStr){
        StringBuilder builder = new StringBuilder(inputStr);
        return ((inputStr.equals(builder.reverse().toString())));
    }
    private static void assertEquals(boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println(String.format("Expected: %s, Actual: %s", expected, actual));
        }
    }
}
