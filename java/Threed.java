import java.util.*;
class Threed
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int [][][]a=new int[2][3][5];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.println("blocks" +i+ "class" +j+ "students" +k);
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        System.out.println("values are");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(a[i][j][k] + " ")
                }
                System.out.println();
            }
        }
    }
}