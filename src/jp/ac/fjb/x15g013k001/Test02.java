package jp.ac.fjb.x15g013k001;

public class Test02 {

	public static void main(String[] args) {
		// 文字列の宣言
		String s1 = "Java and JavaScript";
		
		//文字列の検査1
		if(s1.contains("Java")){
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		//文字列の検査2
		if(s1.endsWith("Java")){
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		//最初に登場する位置
		System.out.println("s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		//最後に登場する位置
		System.out.println("s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));

	}

}
