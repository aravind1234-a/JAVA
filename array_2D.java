import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class array_2D {
    public static void main(String args[])throws IOException
    {
        BufferedReader ip=new BufferedReader(new InputStreamReader(System.in));

        int[][] a1={
                     {1,2,3},
                     {4,5,6},
                     {7,8,9}
                   };
        System.out.println("elements of 2d array:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }

        
        int[][] a2=new int[3][3];
        System.out.println("enter the elements of 2d array");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                a2[i][j]=Integer.parseInt(ip.readLine());
            }
        }

        System.out.println("elements of 2d array:");
        for(int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
