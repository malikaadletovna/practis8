/*Дано слово. Добавить к нему в начале и конце столько звездочек, сколько
букв в этом слове.
*/


import java.util.Scanner;
class P8_9_49{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the word");
    String word = in.nextLine();
    int length = word.length();
    String b = "";
    
    for(int i = 0; i<length; i++) {  
        b += "*";
    }
    System.out.println(b+word+b);
  }
}