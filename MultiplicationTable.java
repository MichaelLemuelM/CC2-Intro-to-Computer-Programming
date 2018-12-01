import java.io.*;

public class MultiplicationTable {

    public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        System.out.println("Enter dimension: ");
        int dm = Integer.parseInt(br.readLine());
        int rw;
        int cl;
        
        if( ){
            
        }
        int[][] data = new int[10][10];

    data = timesTable(10,10);


    for (int row = 0; row < data.length ; row++)
    {
        for (int column = 0; column < data[row].length; column++)
        {
            System.out.printf("%2d ",data[row][column]);
        }
        System.out.println();

    }
}

public static int[][] timesTable(int r, int c)
{
    int [][] yes = new int[r][c];
    for (int row = 0; row < yes.length ; row++)
    {
        for (int column = 0; column < yes[row].length; column++)
        {
            yes[row][column] = (row+1)*(column+1);
        }

    }
    return yes;
}

}