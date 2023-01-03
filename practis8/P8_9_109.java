/*Дано слово.
а) Удалить из него третью букву.
б) Удалить из него k-ю букву.
*/




import java.util.Scanner;

class P8_9_109a{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();
    String newword = word.replace(word.charAt(3),'0');

    System.out.println(newword);
  }
}

/*
class P8_9_109b{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();
    System.out.println("Enter the kerek emes index");
    int n = in.nextInt();
    String newword = word.replace(word.charAt(n),'0');

    System.out.println(newword);
  }
}
*/