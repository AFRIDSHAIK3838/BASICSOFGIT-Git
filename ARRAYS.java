import java.util.Scanner;

public class ARRAYS {
    
    public static void main(String[] args) {
        int sum=0;
        int Avg;
        int  A[]=new int[4];;
        A[0]=10;
        A[1]=20;
        A[2]=30;
        A[3]=40;
        int B[]={50,60,70};
        for(int i=0;i<4;i++){
            System.out.println(A[i]);
        }
      for(int i=0;i<4;i++)
      {
        sum=sum+A[i];
        System.out.println(sum);
        Avg=sum/A.length;
        System.out.println(Avg);
      }
      for(int i=0;i<B.length;i++)
      {
        System.out.println(B[i]);
      }
      /*HII HELLO GOOD MOIRNING  */
      int Y;
      Scanner sc=new Scanner(System.in);
       Y=sc.nextInt();
     for(int i=0;i<4;i++)
     {
        if(A[i]==Y){
            System.out.println("Here is The Element"+i);
        }
     }

    }
}
