import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//       int a = 100;
////       task1
//       for (int i=1; i<=a;i++){
//           System.out.println(i);
//       }
////        task2
//        int c = 1;
//        for (int i=100; i>=c;i--){
//            System.out.println(i);
//        }
//        task 3
//        int b = 100;
//        for (int i=1;i<=b;i++){
//            if(i%2==0){
//                System.out.println(i);
//            }
//        task4
//        int l = 100;
//        for (int i=1;i<=l;i++){
//            if(i%2!=0){
//                System.out.println(i);
//            }
//
//        }
//        task5
//        int f = 100;
//        for (int i = 1; i <= f; i++) {
//            if (i % 10 == 0) {
//                System.out.println(i);
//            }
//
//
//        }
//        task6
//        int u =98;
//        int i= 0;
//        while (i<u){
//            i+=7;
//            System.out.println(i);
//        }
//        task7
//        int k = 256;
//        int i = 1;
//        while (i<k){
//            i*=2;
//            System.out.println(i);
//        }
//        task8
//        int g0 = 1;
//        int g1 = 1;
//        int g2;
//        System.out.print(g0+" "+g1+" ");
//        for(int i = 1; i <= 11; i++){
//            g2=g0+g1;
//            System.out.print(g2+" ");
//            g0=g1;
//            g1=g2;
//        }
//        task8
//        int m=1;
//        int i=1024;
//        while (m<i){
//           m+=m;
//            System.out.println(m);
//        }
//        task9
//        int t = 3;
//        int sum;
//        for (int i=1;i<=10;i++){
//           sum= i*i;
//            System.out.println((t+"x"+i+"="+sum));
//        }
//        task10
        int a = 100;
        int last = 1;
        while (a >= last) {
            if (a == last) {
                System.out.print(a);
            } else {
                System.out.print(a + ",");
            }
            a--;
        }
//         task 11
//        int sum ;
//        int aa = 54734;
//        int a1 = aa/10000;
//        int a2 = (aa/1000)%10;
//        int a3 = (aa%1000)/100;
//        int a4= (aa%100)/10;
//        int a5= aa%10;
//        sum = (a1+a2+a3+a4+a5);
//        System.out.println((double)sum/5 );





    }}