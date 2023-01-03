/*Дано предложение, в котором имеется несколько букв е. Найти:
а) порядковый номер первой из них;
б) порядковый номер последней из них*/
import java.util.Scanner;
class P8_9_76{
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        int q = word.indexOf('e');
        int jnf = word.lastIndexOf('e');
        System.out.println(q+1);
        System.out.println(jnf);
    }
}	
	





