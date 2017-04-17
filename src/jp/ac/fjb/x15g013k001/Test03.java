package jp.ac.fjb.x15g013k001;

public class Test03 {

	public static void main(String[] args) {
		//文字列の宣言
		String s1 = "Java Programming";
		String s2 = "JACK and JUE";
		
		//文字列の切り出し1
		System.out.println("s1の3文字目以降は" + s1.substring(3));
		
		//文字列の切り出し2
		System.out.println("s1の3～8文字目は" + s1.substring(3, 8));
		
		//大文字化
		System.out.println(s1.toUpperCase());
		
		//置き換え
		System.out.println(s2.replace("J","BL"));
	}
}
