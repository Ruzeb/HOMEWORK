public class KnightRider {

		private static int fsize = 8; // board size (5*5)
		private static int board[][] = new int[fsize][fsize];
		private static int[] move_x = {1, 2, 2, 1, -1, -2, -2, -1}; // possible moves (x-axis)
		private static int[] move_y = {-2, -1, 1, 2, 2, 1, -1, -2}; // possible moves (y-axis)

		// x = current x coordinate
		// y = current y coordinate
		public static boolean solve(int move_number, int x, int y)
		{
		    boolean ret = true;
		    board[x][y] = move_number;
		    if(move_number == ((fsize * fsize) - 1))
		    {
		        for(int i = 0; i < fsize; i++)
		        {
		            for(int c = 0; c < fsize; c++)
		            {
		                System.out.printf("%3d", board[i][c]);
		            }
		            System.out.println("\n");
		        }
		    }
		    else
		    {
		        for(int i = 0; i < 8; i++)
		        {
		            if((x + move_x[i]) >= 0 && (x + move_x[i]) < fsize
		                    && (y + move_y[i]) >= 0
		                    && (y + move_y[i]) < fsize)
		            {
		                if(board[x + move_x[i]][y + move_y[i]] == -1)
		                {
		                    if (solve(move_number + 1, (x + move_x[i]), (y + move_y[i]))) {
		                        break;
		                    }
		                }
		            }
		        }
		        ret = false;
		        board[x][y] = -1;
		    }
		    return ret;
		}
		public static void main(String[] args) {
		    for (int i = 0; i < fsize; i++) {
		        for (int c = 0; c < fsize; c++) {
		            board[i][c] = -1;
		        }
		    }

		    solve(0, 0, 0);
		}

	}

