import java.util.Scanner;
class Prime{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt(),flag=0;

for(int i=2;i<n;i++){
if(n%i==0){
flag=1;
break;
}
}

if(flag==0)
System.out.println("yes");
else
System.out.println("no");

}

}
