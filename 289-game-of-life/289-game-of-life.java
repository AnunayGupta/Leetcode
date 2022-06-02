class Solution {
    public void gameOfLife(int[][] board) 
    {
        /*
        The thing to notice in this quesetion is that we have to take advantage of odd and         even.
        We try to add 2 to all neighbours if the current cell is alive(ie odd number is present) and 2 to current if neighbour cell is odd 
        
        this way at the end the cells with 5(1 with 2 live neighbours), 6(0 with 3 live neighbours, 7(1 with 3 live neighbours will stay alive) all else will die
        
        */
        
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                check(board,i,j,i,j+1) ; 
                check(board,i,j,i+1,j+1) ; 
                check(board,i,j,i+1,j) ; 
                check(board,i,j,i+1,j-1) ; 
            }
        }
        for(int i = 0 ; i < board.length ; i++)
        {
            for(int j = 0 ; j < board[0].length ; j++)
            {
                if(board[i][j] == 5 || board[i][j] == 6 || board[i][j] == 7)
                {
                    board[i][j]= 1 ; 
                }
                else
                {
                    board[i][j] = 0 ; 
                }
            }
        }
        
    }
    private void check(int[][]board,int i,int j, int a, int b)
    {
        if(a < board.length && b < board[0].length && b>=0)
        {
            if(board[i][j] %2 != 0)
            {
                board[a][b] +=2 ; 
            }
            if(board[a][b] % 2 != 0)
            {
                board[i][j] += 2 ; 
            }
        }
    }
    
}