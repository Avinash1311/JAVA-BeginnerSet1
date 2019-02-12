import java.util.Scanner;
class CountInt{
public static void main(String[] qwe){

Scanner scan=new Scanner(System.in);

int n=scan.nextInt(),x=0;

while(n!=0){
n=n/10;
x++;
}

System.out.println(x);
}

}
