import java.util.Scanner;
class SumNInt{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt(),s=0,x=1;

while(x<=n){
s=s+x;
x++;
}

System.out.println(s);

}

}
