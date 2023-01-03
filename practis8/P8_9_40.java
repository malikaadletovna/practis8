/*Дано слово. Перенести первые k его букв в конец.
Задачу решить двумя способами:
1) без использования оператора цикла;
2) с использованием оператора цикла.*/
import java.util.Scanner;
/*
class P8ex9_40b{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    String word = in.nextLine();
	    String newword = "";
	    char first = word.charAt(0);

	    for(int i = 1; i<word.length(); i++) {
		    char letters = word.charAt(i);
		    newword = newword + letters;
	    }
	    System.out.println(newword+first);
	}
}
*/

class P8ex9_40a{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String word = in.nextLine();
    String word2 = word.substring(1,word.length());
    char first = word.charAt(0);
    System.out.println(word2+first); 

  }
}