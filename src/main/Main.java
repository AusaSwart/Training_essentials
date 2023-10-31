package main;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static void main(String[] args) {
        System.out.println(SmashWords.smash("Smash", "Words"));

    }

    public static class SmashWords {
        public static String smash (String ... words){
            return Stream.of(words).collect(Collectors.joining(" "));
            //  stream.collect() method is used to perform a mutable reduction operation
            //  on the elements of a stream. It returns a new mutable object containing
            //  the results of the reduction operation.
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