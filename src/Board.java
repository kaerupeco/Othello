import java.security.spec.ECParameterSpec;

public class Board {
        //８×８の盤面を定義
        private final int[][] board = new int[8][8];

        //空状態、自分の石、相手の石を定義
        private final static int EMPTY = 0;
        private final static int ZIBUN = 1;
        private final static int AITE = 2;

        //コンストラクタで盤面を空で初期化
        public Board(){
            for(int i = 0; i<8; i++){
                for(int j = 0; i<8; i++){
                    board[i][j] = EMPTY;
                }
            }
        }

    //指定した位置が空かどうか調べる
    public boolean isEmpty() {
        return false;
    }

    //指定した位置に自分の石があるか調べる
    public boolean isZibun(){
        return  false;
    }

    //指定した位置に相手の石があるか調べる
    public boolean isAite(){
        return false;
    }

    //指定した位置に自分の石を置く
    public void put(){

    }

    //石を置いたときに裏返せる石の数を数える
    public int tryPut(){
        return 0;
    }

    //自分の石を数える
    public int countZibun(){
        return 0;
    }

    //相手の石を数える
    public int countAite(){
        return 0;
    }
}
