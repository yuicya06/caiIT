package sukkiri.practice.practice_print16.practice04;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Main {

	//	問4	【HashSetの操作】
	//	ビンゴカードを作成しましょう。
	//	処理手順は以下の通りになります。
	//	1.	コレクションのSetをInteger型で宣言
	//	2.	While文を使い無限ループさせ、その中で乱数０～９９の値を繰り返し取得する。
	//	初めて取得した値ならSetに格納していく。
	//	3.	Setのサイズが24になったときに無限ループからbreakで抜ける。
	//	4.	最後に表示処理を行う。
	//
	//	実行結果例(値はランダム)
	//	1　14　 35  42  58
	//	3  20  40  50  62
	//	7　24　 ☆  53  68
	//	8  28  41  54  74
	//	9  32  42  57  89
	//

	public static void main(String[] args) {

		//		1.	コレクションのSetをInteger型で宣言
		Set<Integer> bingo = new HashSet<>();

		//		2.	While文を使い無限ループさせ、その中で乱数０～９９の値を繰り返し取得する。
		Random rand = new Random();
		while (true) {
			int n = rand.nextInt(100);
			//		初めて取得した値ならSetに格納していく。
			bingo.add(n);
			//		3.	Setのサイズが24になったときに無限ループからbreakで抜ける。
			if (bingo.size() == 24) {
				break;
			}

		}
		Set<String> bingo2 = new LinkedHashSet();
		bingo2 = bingo.tostring(); 
		
		
		
//
//		int count = 0;
//		for (int z : bingo) {
//			
//			
//			
//			count++;
//			if (count <=10 &&count % 5 == 0) {
//				System.out.printf("%2d\n", z);
//			} else {
//				System.out.printf("%2d ", z);
//			}
//			
//			if(count % 13 == 0) {
//			System.out.printf("%s%3d ", "☆", z);
//			}
//			
			
		

			//}

	//	}

}

}
