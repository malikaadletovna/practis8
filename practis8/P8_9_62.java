/*Дано предложение. Определить долю (в %) букв а в нем*/

import java.util.Scanner;
public class P8_9_62{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//System.out.println("Sandy jaz:");
		int b= in.nextInt();
		//System.out.println("Ainalymdy jaz:");
		int m= in.nextInt();



		while(m>=0){
			if (b%10==0){
				b=b/10;
				//System.out.println(b);
			}else{
				b--;
				//System.out.println(b);
				//m--;
			}
            m--;
            if(m==0){
            	break;
            }
		}
		System.out.println(b); 

        /*System.out.println(b);
        while(b>0){
			while(m>=0){
				//m--;
				//b--;
				System.out.println(b);
                m--;
				if (b%10==0){
					b=b/10;
					b--;
					System.out.println(b);
				m--;
				}

				if (b==0 ){
					break;
				}
				if(m==0){
				    break;
			    }
			    break;
			}
			//m--;
		}*/
	}
}