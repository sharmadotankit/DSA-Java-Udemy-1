class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> ansSet = new HashSet();

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if( board[i][j]!= '.')
                    if(
                    !ansSet.add(board[i][j]+"in row"+i) ||
                    !ansSet.add(board[i][j]+"in col"+j) ||
                    !ansSet.add(board[i][j]+"in block"+i/3+"-"+j/3) ){
                        return false;
                    }
            }
        }


        return true;
    }
}