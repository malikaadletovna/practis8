/*Дано предложение. Все его символы, стоящие на четных местах, заменить
буквой ы.*/


import java.util.Scanner;
class P8_9_92{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter the word");
	    String word = in.nextLine();
	    String newword = "";
	    
	    for(int i = 0; i < word.length(); i++) {
		    char letter = word.charAt(i);
			    if(i % 2 == 0) {
				    newword = newword + "y";
				        
			    }else{
			        newword = newword + letter;
			    }
	    }    
	    System.out.println(newword);
	}
}