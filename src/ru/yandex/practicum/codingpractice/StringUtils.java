package ru.yandex.practicum.codingpractice;

public class StringUtils {

    public static String reverse (String str) {
        String result = "";
        char[] arr = str.toCharArray();

        for (int i = arr.length-1; i >= 0; i--) {
            result += arr[i];
        }
        return result;
    }

    public static int countWords (String str) {
        String[] arr = str.split(" ");
        return arr.length;
    }

    public static boolean isPalindrome (String str) {
        String reverse = StringUtils.reverse(str);
        return str.equals(reverse);
    }
}
