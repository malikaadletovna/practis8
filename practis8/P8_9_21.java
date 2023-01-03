/*Дано слово. Получить его часть, образованную второй, третьей и четвертой
буквами.*/

class P8_9_21{
	public static void main(String[] args) {
		String word="Malika";
		char b = word.charAt(2);
		char m = word.charAt(3);
		char n = word.charAt(4);

		System.out.print(b);
		System.out.print(m);
		System.out.print(n);
	}
}