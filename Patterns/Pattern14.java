import java.util.*;

public class Pattern14 
{
    public static void diamondPattern(int n)
    {
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= (2*i)-1;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i = n-1;i>=1;i--)
        {
            for(int j = 1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j <= (2*i)-1;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of no. of rows : ");
        int n = sc.nextInt();
        diamondPattern(n);

    }
}
