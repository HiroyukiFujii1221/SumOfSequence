//高校の数学Bの知識を使って数列の和を計算する（もちろん単なる偶数や奇数、倍数の計算もできる）
public class SumOfSequence {
	public static void main(String args[]) {
		//一般項がan^2+bn+cで表せる数列の上限値limitまでの和を求める→数列の各項の係数a, b, c、上限値limitの順に引数を渡す
		//例えば2の倍数（偶数）なら2nで表せるから100までで和を求めたかったら引数は0, 2, 0, 100を渡せばよい
		int result = sum(0, 2, -1, 100);
		System.out.print(result);
	}

	//メソッドsumの4つの引数a, b, c, limitの意味は上の通り
	public static int sum(int a, int b, int c, int limit) {
		//Σの公式に代入する要素の個数nを求める処理
		int n = 0;
		for (int i = 1; i <= limit; i++) {
			//数列（sequence）の各項の値を表す変数：sequenceValueに1から順に代入して計算→上限値を超えるまで個数が増える
			int sequenceValue = a * i * i + b * i + c;
			if (sequenceValue <= limit) {
				n = n + 1;
			}
		}
		//Σを使った数列の和の公式に数値を代入→既にある公式だからモジュールみたいに使っている
		int sum = (a * n * (n + 1)*(2 * n + 1)) /6 + (b * n * (n + 1)) /2 + c * n;
		return sum;
	}
}