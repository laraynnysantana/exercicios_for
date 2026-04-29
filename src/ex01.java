import java.util.Scanner;

public class ex01 {
    void main(){
        Scanner sc = new Scanner(System.in);
        IO.println(" Digite um numero");
        int cal = sc.nextInt();
        int cont = 0;
        int num = 0;

      while( num <= cal ){
         cont = cont + num;
         num++;

        }
        IO.println(cont);
    }
}


