public class IslandCouting {
    public static void main(String[] args) {
       char grid[][] = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'1','0','1','0','0'},{'0','0','0','1','1'}};
       
       int count = numIslands(grid);
       System.out.println(" Number of Islands are "+ count);
    }


       public static int numIslands(char[][] grid) {
            
            int count = 0;
            //Just simple row iteration 
            //N.B : int[0] represents the the 1st row
            for (int i=0; i<grid.length; i++) {
                //Just simple Column iteration
                    System.out.println("I  is"+grid[i]);
                for (int j=0; j<grid[i].length; j++) {
                    //checking the value of each column of the row
                    if(grid[i][j] == '1'){
                    // if it is 1 then check the surroundings
                    callDFS(grid, i, j);
                    //increasing number of island
                    count++;
                    }
                }
            }
            return count;
        }
    
        public static void callDFS(char[][] grid, int i, int j){
            // Iteration around the cordinate and 
            // checking the values. If It gets 0. Then this is the only islan
            if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0'){
                System.out.println("Iterating"+i+" " + j);
                return;
            }
            grid[i][j] = '0';
            callDFS(grid, i+1, j);
            callDFS(grid, i-1, j);
            callDFS(grid, i, j+1);
            callDFS(grid, i, j-1);
            }
    }