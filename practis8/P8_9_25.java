/*Из слова информатика путем "вырезок" и "склеек" его букв получить слова
форма и тик.*/




class P8_9_25{
  public static void main(String[] args) {
    String word = "информатика";

    String word1 = word.substring(2,7);
    String word2 = word.substring(7,10);

    System.out.println(word1);
    System.out.println(word2);
  }
}