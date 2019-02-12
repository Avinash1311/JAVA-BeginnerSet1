import java.util.Scanner;
class SumNK{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int k=scan.nextInt();
int s=0;
int[] arr=new int[n];

for(int i=0;i<n;i++){
int temp=scan.nextInt();
arr[i]=temp;
}

for(int i=0;i<k;i++)
s=s+arr[i];

System.out.println(s);
 
}

}
