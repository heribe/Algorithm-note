import java.util.ArrayList;

public class pat{
    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     int sum = solution.movingCount(2, 2, 2);
    //     System.out.println(sum);
    // }
    // public static void main(String []args){
    //     System.out.println("Hello World");
    //     int[] a = {12,20,5,16,15,1,30,45,23,9,13,414,51,235,1341,4,19,54,7};
    //     int start = 0;
    //     int end = a.length-1;
    //     FastSort fastSort = new FastSort();
    //     fastSort.sort(a,start,end);
    //     for(int i = 0; i<a.length; i++){
    //          System.out.println(a[i]);
    //      }
        
    //  }

    public static void main(String[] args) {
        int a[]={2,5,3,0,2,3,0,3};
        int result=RanSelect.randomizedSelect(a,0,a.length-1,2);//产生第三小的数
        System.out.print("\n"+result);
   }
    
}
