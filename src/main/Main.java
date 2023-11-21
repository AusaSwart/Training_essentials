package main;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {
    public static void main(String[] args) {
        System.out.print(" Game r-p-s started: ");
        System.out.println(Rps.game("rock", "paper"));
    }

    public static class Rps {
        public static String game(String p1, String p2) {
            if (Objects.equals(p1, p2)) return "Draw!";
            int plr = (p1 + p1).equals("scissorspaper") ||
                    (p1 + p1).equals("paperrock") ||
                    (p1 + p1).equals("rockscissors") ? 1:2;
            return "Player " + plr + " won!";

        }
    }

    public static class RpsTest {

        @Test
        public void test1() {
            System.out.println("Fixed Tests Player 1 won!");
            assertEquals("Player 1 won!", Rps.game("rock", "scissors"));
            assertEquals("Player 1 won!", Rps.game("scissors", "paper"));
            assertEquals("Player 1 won!", Rps.game("paper", "rock"));
        }
        @Test
        public void test2() {
            System.out.println("Fixed Tests Player 2 won!");
            assertEquals("Player 2 won!", Rps.game("scissors", "rock"));
            assertEquals("Player 2 won!", Rps.game("paper", "scissors"));
            assertEquals("Player 2 won!", Rps.game("rock", "paper"));
        }
        @Test
        public void test3() {
            System.out.println("Fixed Tests Draw!");
            assertEquals("Draw!", Rps.game("scissors", "scissors"));
            assertEquals("Draw!", Rps.game("paper", "paper"));
            assertEquals("Draw!", Rps.game("rock", "rock"));
        }

//        private static String sol(String p1, String p2){
//            if (Objects.equals(p1, "rock") && Objects.equals(p2, "scissors")
//                    || Objects.equals(p1, "scissors") && Objects.equals(p2, "paper")
//                    || Objects.equals(p1, "paper") && Objects.equals(p2, "rock"))
//                return "Player 1 won!";
//            else if (Objects.equals(p1, p2)) return "Draw!";
//            else return "Player 2 won!";
//        }
//
//        @Test
//        public void randomTests(){
//            Random r = new Random();
//            String [] arr = {"scissors", "rock", "paper"};
//            String a = arr[r.nextInt(3)];
//            String b = arr[r.nextInt(3)];
//            assertEquals("Should work when p1 = " + a + ", p2 = " + b, sol(a, b), Rps.game(a, b));
//        }
    }

}