package com.memorygame;
import java.util.*;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> cards = new ArrayList<>();

        //Add 4 pairs of cards
        cards.add("A");
        cards.add("A");
        cards.add("B");
        cards.add("B");
        cards.add("C");
        cards.add("C");
        cards.add("D");
        cards.add("D");

        Collections.shuffle(cards); //randomizes their order so the game isn’t predictable.

        String[] board = new String[cards.size()];
        Arrays.fill(board, " "); //shows what the player currently sees (initially all blank " ").
        boolean[] flipped = new boolean[cards.size()]; //tracks which cards are face up
        int pairsFound = 0; //counts how many pairs have been matched so far.

        System.out.println("Welcome to the Memory Game!");
        while (pairsFound < 4) { //The game continues until all 4 pairs are found.
            printBoard(board);


            /**
             * The player enters the index (0–7) of the first card.
             * The chosen card’s value is revealed on the board.
             * That card is temporarily marked as flipped.
             */
            int firstIndex = getCardIndex(input, board, flipped,
                    " Enter index of first card to flip: ");
            board[firstIndex] = cards.get(firstIndex);
            flipped[firstIndex] = true;
            printBoard(board);

            int secondIndex = getCardIndex(input, board, flipped,
                    "Enter index of second card to flip:");
            board[secondIndex] = cards.get(secondIndex);
            flipped[secondIndex] = true;
            printBoard(board);


            /**
             * If both cards have the same letter, it’s a match.
             * → The pair stays visible and pairsFound increases.
             *
             * If not, both cards flip back face down (" ").
             */
            if (cards.get(firstIndex).equals(cards.get(secondIndex))) {
                System.out.println("You found a pair!");
                pairsFound++;
            } else {
                System.out.println("Sorry, those cards don't match.");
                board[firstIndex] = " ";
                board[secondIndex] = " ";
                flipped[firstIndex] = false;
                flipped[secondIndex] = false;
            }
        }
        System.out.println("Congratulations, you win!");
        input.close(); //Once all 4 pairs are found, the loop ends.
    }

    public static int getCardIndex(Scanner input, String[] board, boolean[] flipped, String prompt) {
        int index;
        while (true) {
            System.out.println(prompt);
            index = input.nextInt();
            if (index < 0 || index >= board.length) {
                System.out.println("Invalid index, try again.");
            } else if (flipped[index]) {
                System.out.println("Card already flipped, try again.");
            } else {
                break;
            }
        }
        return index;
    }

    public static void printBoard(String[] board) {
        for (String value : board) {
            System.out.print("| " + value + " ");
        }
        System.out.println("|");
    }
}