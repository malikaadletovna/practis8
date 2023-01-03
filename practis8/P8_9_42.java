/*Составить программу, которая печатает заданное слово, начиная с последней
буквы.*/

import java.util.Scanner;
class P8_9_42{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();
    String newword = "";
    int length = word.length();
    for(int i = length - 1; 0 <= i; i-- ) {
      newword = newword + word.charAt(i);
      System.out.println(newword);
    }
  }
}