package sukkiri.practice.practice_print16.practice02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	//問2	【ArrayListの操作】
	//Integer型(整数)でArrayListを宣言し、キーボードから数値を複数回入力し、ArrayListに入力した値を追加していってください(入力する回数は別途キーボードから回数を指定する)
	//その後、ArrayListの中にある数値から最小値を表示するようにプログラムを作成してください。
	//処理手順：
	//①	キーボードから入力する回数を変数nに代入。
	//②	 for文を使い、n回キーボードから数値の入力を繰り返し、ArrayListに追加していく。
	//③	 for文を再度使い、if文を使って最小値を求める。
	//④	 求めた最小値を表示する。

	public static void main(String[] args) {

		//Integer型(整数)でArrayListを宣言
		List<Integer> input = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		//入力回数
		System.out.print("入力回数:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			//入力値
			System.out.print("入力値：");
			input.add(sc.nextInt());
		}

		//最小値の変数作成
		int min = Integer.MAX_VALUE;

		//最小値のfor文
		for (int i = 0; i < n; i++) {

			if (input.get(i) < min) {
				min = input.get(i);
			}

		}
		//表示
		System.out.println(min);

	}

}
