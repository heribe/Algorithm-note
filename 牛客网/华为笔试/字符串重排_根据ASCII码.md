# 字符串重排_根据ASCII码

**题目：**   
>1.给你一个原始字符串，根据该字符串内每个字符出现的次数，按照ASCII码递增顺序重新调整输出。  
举例！假设原始字符串为：  
eeefgghhh  
则每种字符出现的次数分别是：  
(1) .eee        3次  
(2) .f          1次  
(3) .gg         2次  
(4) .hhh        3次  
重排输出后的字符串如下：  
efghegheh  
编写程序，实现上述功能。  
【温馨提示】  
(1). 原始字符串中仅可能出现“数字”和“字母”；  
(2). 请注意区分字母大小写。  

**输入描述:**  
>eeefgghhh  

**输出描述:**  
>efghegheh  
  
#### 示例1   
**输入:**  
>eeefgghhh  
  
**输出:**  
>efghegheh  
  
___  
__我的解法:__  
用到了map和map的排序（treemap）
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        String ouput = Main.out(string);
        System.out.println(ouput);
    }

    public static String out(String a){
        String output="";
        Map<Character,Integer> map = new TreeMap<Character, Integer>();
        map.put(a.charAt(0),1);
        for (int i = 1; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i),map.get(a.charAt(i))+1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }

        Map<Character,Integer> resultMap = sortMapByKey(map);
        Boolean flag=true;
        while (flag){
            flag=false;
            for (Map.Entry<Character,Integer> entry: resultMap.entrySet()){
                if (entry.getValue()>0){
                    output = output+entry.getKey();
                    resultMap.put(entry.getKey(),entry.getValue()-1);
                    flag=true;
                }
            }
        }


        return output;
    }

    /**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static Map<Character, Integer> sortMapByKey(Map<Character, Integer> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }

        Map<Character, Integer> sortMap = new TreeMap<Character, Integer>(
                new MapKeyComparator());

        sortMap.putAll(map);

        return sortMap;
    }

    /**
     *     比较器类
     */

    static class MapKeyComparator implements Comparator<Character>{

        @Override
        public int compare(Character o1, Character o2) {
            return o1.compareTo(o2);
        }
    }
}


```

__夏瑞松的解法:__
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        char[] chars = str.toCharArray();
        int[] s = new int['z' + 1];
        for (char c : chars) {
            s[c] += 1;
        }
        StringBuffer sb = new StringBuffer();
        int c = str.length();

        boolean flag = false;
        while (c > 0) {
            int j = 0;
            for (; j < s.length; j++) {
                if (s[j] > 0) {
                    sb.append((char) j);
                    c--;
                    s[j]--;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.print(sb.toString());
    }
}
```