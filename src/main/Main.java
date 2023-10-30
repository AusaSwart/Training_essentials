package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static void main(String[] args) {
        System.out.println(SmashWords.smash("Smash", "Words"));

    }

    public static class SmashWords {

        public static String smash (String ... words){
            return String.join(" ", words);
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