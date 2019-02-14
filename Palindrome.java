import java.util.Scanner;
class Palindrome{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt(),t=n,s=0;

while(t!=0){
s=s*10+t%10;
t=t/10;
}

if(s==n)
System.out.println("yes");
else
System.out.println("no");

}

}
