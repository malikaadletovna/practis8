import java.util.Scanner;
public class P8_9_55{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c1='a';// o мен а нын каншаншы турганын шыгарып береди
        char c2='o';
        String word="Hello JIHC, now are you?";
        for(int i=0;i<word.length();i++){
	        char c=word.charAt(i);
	        if(c==c1 || c==c2){
		        System.out.println(i+": "+c);
		    }
        }
    }
}
	



