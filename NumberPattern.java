
/*
Print a Number Pattern like as follows:
Givne N=5 then output should be
543210
 43210
  3210
   210
    10
     0
 */
public class NumberPattern {

    public static void main(String arg[])
    {
        int n=5;//OR any input number
        for (int x=n;x>=0;x--)
        {

           for(int k=x;k<n;k++)
          { System.out.print(" ");
            }
            for(int j=x;j>=0;j--){
                System.out.print(j);
            }

            System.out.println("");

        }
    }
}