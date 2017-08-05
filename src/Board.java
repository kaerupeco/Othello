import java.security.spec.ECParameterSpec;
import java.util.Scanner;

public class Board {
    //盤面の広さ、空のマス、自分の石、相手の石を定義
    private static final int L = 8;
    private static final int EMPTY = 0;
    private final static int BLACK = 1;
    private final static int WHITE = 2;
    public static int TURN = BLACK;

    //盤面を定義
    private final int[][] board = new int[L][L];

    //コンストラクタで盤面を空で初期化、白と黒の初期配置
    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; i < 8; i++) {
                board[i][j] = EMPTY;
            }
        }
        board[3][3] = WHITE;
        board[4][4] = WHITE;
        board[3][4] = BLACK;
        board[4][3] = BLACK;
    }
}



