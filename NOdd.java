import java.util.Scanner;
class NOdd{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int s=scan.nextInt();
int e=scan.nextInt();

for(int i=s+1;i<e;i++){
if(i%2==1)
System.out.print(i+" ");
}

}
	
}
