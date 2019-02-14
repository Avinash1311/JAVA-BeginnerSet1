import java.util.Scanner;
class Power{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt();
int k=scan.nextInt(),p=1;

for(int x=0;x<k;x++)
p=p*n;

System.out.println(p);

}

}
