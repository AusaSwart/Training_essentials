package main;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static void main(String[] args) {
        System.out.print(" Args 1, 2, -15, 29. Smallest one is ");
        System.out.println(SmallestIntegerFinder.findSmallestInt(new int[]{1, 2, -15, 29}));
    }

    public static class SmallestIntegerFinder {
        public static int findSmallestInt(int[] args) {

            int smallest = args[0];
            for (Integer arg: args) {
                if ( smallest > arg )
                    smallest = arg;
            }
            return smallest;
        }
    }

    public static class SmallestIntegerFinderTest {

        @Test
        public void example1(){
            int expected = 11;
            int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
            assertEquals(expected, actual);
        }


        @Test
        public void example2(){
            int expected = -33;
            int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
            assertEquals(expected, actual);
        }

        @Test
        public void example3(){
            int expected = Integer.MIN_VALUE;
            int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
            assertEquals(expected, actual);
        }
    }

}