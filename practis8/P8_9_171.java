import java.util.Scanner;
public class P8_9__154{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String soz = ("asdfghjkl;");
		String soz1[]=soz.split(" ");
		int sum [] =new int[soz.length()];
		int l;
		int sum1 =0;
		int k =0
		int min = 100000;
		for (int i = 0;i<soz1.length;i++){
			l = soz1[i].length();
			sum[i]=l;
		}
		for (int i =0;soz1.length;i++){
			if(min>sum[i])min = sum[i];
		}
		System.out.println(min);
	}
}