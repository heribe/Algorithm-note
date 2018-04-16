import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//要输入的行数
        ArrayList<Integer> list ;
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            list = new ArrayList<>();
            String s = sc.nextLine();
            String[] strings = s.split(" ");
            for (String temp :
                    strings) {
                list.add(Integer.parseInt(temp));
            }
            System.out.println(list);
            //处理
        }

    }

    public static void solution(ArrayList<Integer> a) {
        for (int i = 1; i < a.get(a.size()) - a.get(0); i++) {
            for (int j = 0; j < a.size(); j++) {
                int add = a.get(j) + i;
                if (add > a.get(a.size())) {
                    break;
                } else {
                    if (!a.contains(add)) {

                        break;
                    }
                }
            }
        }
    }
}
