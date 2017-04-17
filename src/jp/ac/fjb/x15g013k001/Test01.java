package jp.ac.fjb.x15g013k001;

public class Test01 {

	public static void main(String[] args) {
		//文字列の宣言
		String s1 = "ほげほげFJB";
		String s2 = "FJB";
		String s3 = "fjb";
		String s4 = "";
		
		//文字列の長さ
		System.out.println("文字列s1の長さは" + s1.length());
		//文字列の比較1
		if(s2.equals(s3)){
			System.out.println("s2とs3は等しい");
		}else{
			System.out.println("s2とs3は等しくない");
		}
		//文字列の比較2
		if(s2.equalsIgnoreCase(s3)){
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}else{
			System.out.println("s2とs3はケースを区別しなければ等しくない");
		}
		//空文字か調べる
		if(s4.isEmpty()){
			System.out.println("s4は空です");
		}
		//nullか調べる
		if(s4 == null){
			System.out.println("s4はnullです");
		}

	}

}
