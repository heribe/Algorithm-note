```java

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int []A = new int[N];
        A[1] = p;
        Main.culshuzu(A);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sum+=A[gcd(i,j)];
            }
        }
        System.out.print(sum);
    }

    public static void culshuzu(int []A){
        for (int i = 2; i < A.length; i++) {
            A[i] = (A[i-1]+153)%A[1];
        }
    }

    public static int gcd(int num1,int num2){
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int remainder = num1%num2;
        int n1=num1,n2=num2;

        while(remainder!=0){
            num1=num2;
            num2=remainder;
            remainder=num1%num2;
        }
        return num2;
    }

}

```
```java

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int []A = new int[N];
        A[1] = p;
        Main.culshuzu(A,p);
        int sum = Main.solution(A,n,m);
        System.out.print(sum);
    }

    public static int solution(int []A,int a,int b){
        int sum = 0;
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        for (int i = 1; i <= a; i++) {
            for (int j = i; j <= a; j++) {
                if(i==j){
                    sum+=A[gcd(i,j)];
                }else{
                    sum+=A[gcd(i,j)]*2;
                }
            }
            for (int j = a+1; j <= b ; j++) {
                sum+=A[gcd(i,j)];
            }
        }
        return sum;
    }

    public static void culshuzu(int []A,int p){
        for (int i = 2; i < A.length; i++) {
            A[i] = (A[i-1]+153)%p;
        }
    }

    public static int gcd(int num1,int num2){
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int remainder = num1%num2;
        int n1=num1,n2=num2;

        while(remainder!=0){
            num1=num2;
            num2=remainder;
            remainder=num1%num2;
        }
        return num2;
    }

}

```