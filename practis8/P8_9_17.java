/*Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же
букву?*/

class P8_9_17{
  public static void main(String[] args) {
    String  word = "malika";

    char q = word.charAt(0);
    char w = word.charAt(5);

    if(q==w){
	    System.out.println("true");
    }else{
        System.out.println("false");
    }
  }
}