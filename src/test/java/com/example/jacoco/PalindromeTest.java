package com.example.jacoco;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PalindromeTest {

    @Test
    public void whenEmptyString_thenAccept() {
        Palindrome palindromeTester = new Palindrome();

        Assertions.assertTrue(palindromeTester.isPalindrome("noon"));
    }

    @Test
    public void whenNearPalindrom_thanReject(){
        Palindrome palindromeTester = new Palindrome();
        Assertions.assertFalse(palindromeTester.isPalindrome("neon"));
    }

}