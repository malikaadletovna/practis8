/*Дано слово из четного числа букв. Поменять местами его половины. Задачу
решить двумя способами:
1) без использования оператора цикла;
2) с использованием оператора цикла.*/


import java.util.Scanner;
class P8_9_37a{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();

    String word1 = word.substring(0,word.length()/2);
    String word2 = word.substring(word.length()/2);

    System.out.println("New word is: "+word2+""+word1);
  }
}

