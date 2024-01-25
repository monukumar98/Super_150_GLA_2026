package Lec27;

public class Queen_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[] board = new boolean[n];
		int tq = 2;// total queen
		Combination(board, tq, 0, "", 0);

	}

	public static void Combination(boolean[] board, int tq, int qpsf, String ans, int idx) {
		if (tq == qpsf) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if (board[i] == false) {
				board[i] = true;// placed Queen
				Combination(board, tq, qpsf + 1, ans + "b" + i + "Q" + qpsf, i + 1);
				board[i] = false;// remove Queen undo
			}
		}

	}

}
