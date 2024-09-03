package sukkiri.practice.practice_print16.practice01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	//	問1	【ArrayListの基本操作】
	//	(1)整数値を扱うArrayListを宣言してください。変数名はnumList
	//	(2)文字列を扱うArrayListを宣言してください。変数名はstrList
	//	(3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
	//	(4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」「出木杉君」を順番に追加してください。
	//	(5)for文を使い変数numListの中身を順番に表示してください。（要素数はsizeを使う。P584参照） 
	//	(6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）
	//	(7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
	//	(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)

	public static void main(String[] args) {
		//		(1)整数値を扱うArrayListを宣言してください。変数名はnumList
		List<Integer> numList = new ArrayList<>();
		//		(2)文字列を扱うArrayListを宣言してください。変数名はstrList
		List<String> strList = new ArrayList<>();
		//		(3)変数 numListに（1,10,100,200,5,50,500）の順番に値を追加してください。
		numList.add(1);
		numList.add(10);
		numList.add(100);
		numList.add(200);
		numList.add(5);
		numList.add(50);
		numList.add(500);
		//		(4)変数strListに「のび太」「すねお」「ジャイアン」「しずかちゃん」「出木杉君」を順番に追加してください。
		strList.add("のび太");
		strList.add("すねお");
		strList.add("ジャイアン");
		strList.add("しずかちゃん");
		strList.add("出木杉君");
		//		(5)for文を使い変数numListの中身を順番に表示してください。（要素数はsizeを使う。P584参照） 
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		//		(6)イテレータを使い変数strListの中身を順番に表示してください。（テキストP588参照）

		//Iteratorの生成
		Iterator<String> it = strList.iterator();
		//while文で各要素を見ていく
		while (it.hasNext()) {
			String e = it.next();// next()で次の要素を取得
			System.out.println(e);
		}

		//		(7)for文を使い変数numListの中身の値が100以上の要素を削除してください。
		
		
		
		
		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) >= 100) {
				numList.remove(i);
			}
		}
		for (int i = 0; i < numList.size(); i++) {
			if (numList.get(i) >= 100) {
				numList.remove(i);
			}
		}

		//		(8)拡張for文を使い変数numListの中身を順番に表示してください。(P585参照)
		for (int i : numList) {
			System.out.println(i);
		}

	}

}
