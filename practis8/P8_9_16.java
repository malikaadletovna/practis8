/*Дано слово. Определить, одинаковы ли второй и четвертый символы в нем*/


class P8_9_16{
	public static void main(String[] args) {
		String word = "Malika";
	    char b = word.charAt(2);
	    char m = word.charAt(4);

	    if (b==m){
	    	System.out.println("true"); 
	    }else{
	    	System.out.println("false");
	    }
	}
}