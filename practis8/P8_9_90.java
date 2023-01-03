/*Дано предложение. Все буквы е в нем заменить буквой и*/



import java.util.Scanner;
class P8_9_90{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("ENter the word");
    String word = in.nextLine();
    int length = word.length();
        
    for(int i = 0; i<length; i++) {
      if(word.charAt(i) == 'e'){
        String newword = word.replace(word.charAt(i), 'i');
        System.out.println(newword);
      }
    }
  }
}