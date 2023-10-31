package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static void main(String[] args) {
        System.out.println(SmashWords.smash("Smash", "Words"));

    }

    public static class SmashWords {
        public static String smash (String ... words){
            StringBuilder str = new StringBuilder();
            for (String word : words) {
                str.append(word).append(" ");
            }
            return str.toString().trim();
            // .append() a StringBuilder and StringBuffer class method used to append a value to the current sequence
            // .trim() method gets rid of all the spaces before and after the String
        }
    }

    public static class SmashWordsTest {
        @Test
        public void validate(){
            assertEquals("Smash Words", SmashWords.smash("Smash", "Words"));
        }

        @Test
        public void validateEmpty() {
            assertEquals("", SmashWords.smash());
        }

        @Test
        public void validateOneWord(){
            assertEquals("Smash", SmashWords.smash("Smash"));
        }
    }

}