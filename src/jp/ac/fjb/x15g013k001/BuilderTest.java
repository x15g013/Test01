package jp.ac.fjb.x15g013k001;

public class BuilderTest {

	public static void main(String[] args) {
		int loop = 100000;
		
//		//Stringの+演算子
//		String plusKekka = new String("");
//		for(int i=1;i<=loop;i++){
//			plusKekka = plusKekka + "オラ";
//			if(i % 100 == 0){
//				plusKekka = plusKekka + "\n";	//100行ごとに改行
//			}
//		}
//		System.out.println(plusKekka);
//		System.out.println("結合1が終了しました");
		
		
		//StringBuilderの処理
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=loop;i++){
			sb.append("無駄");
			if(i % 100 == 0){		//100行ごとに改行
				sb.append("\n");
			}
			String sbKekka = sb.toString();
			System.out.println(sbKekka);
			System.out.println("結合2が終了しました");
		}

	}

}
