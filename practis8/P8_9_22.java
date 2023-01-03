/*Дано слово, состоящее из четного числа букв. Вывести на экран его первую
половину, не используя оператор цикла.*/

import java.util.Scanner;
class P8_9_22{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the word");
	    String word = in.nextLine();

	    String newword = word.substring(0,word.length()/2);

	    System.out.println(newword);
	  }
}