

public class FastSort{


    
    public void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];
        
        
        while(end>start){
            //从后往前比较
            while(end>start&&a[end]>=key)  //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
                end--;
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            //从前往后比较
            while(end>start&&a[start]<=key)//如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
               start++;
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
        }
        //递归
        if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
        if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
    }
    
    
    private static int randomizedPartition(int[] a,int p,int r){
        java.util.Random random = new java.util.Random();
        int i=Math.abs(random.nextInt() % (r-p+1)+p);//产生指定范围内的随机数
        swap(a,i,r);
        return partition(a,p,r);
    }

    private static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    private static int partition(int[] a, int p, int r) {
        int x=a[r];
        int i=p-1;
        for(int j=p;j<r;j++){
            if(a[j]<=x){
                i=i+1;
                swap(a, i, j);
            }
        }
        swap(a, i+1, r);
        return i+1;
    }
}