import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] ints = new int[n];
        for (int i = 0 ; i<n ; i++) {
            ints[i] = in.nextInt();
        }
        int result = Main.solution(ints,0);
        System.out.println(result);
    }
    public static int solution(int []ints,int t){
        if (t==ints.length-1){
            return 0;
        }
        if(t+ints[t]>=ints.length){
            return solution(ints,t+1)+1;
        }else{
            int temp = Math.min(solution(ints, t + 1)+1, solution(ints, t + ints[t])+1);
            return temp;
        }
    }

}
