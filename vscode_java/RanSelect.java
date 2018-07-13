public class RanSelect {
  
/**
     * 随机选择方法
     * @param a 数组
     * @param p 数组的第一个元素
     * @param r 数组的最后一个元素
     * @param i 需要求第几小的元素
     * @return
     */
    public static int randomizedSelect(int[] a,int p,int r,int i){
        if(p==r){
            return a[p];//这种情况就是数组内只有一个元素
        }
        int q=randomizedPartition(a,p,r);
        int k=q-p+1;//拿到上一句中作为枢纽的数是第几小的数
        if(i==k){
            return a[q];
        }else if(i<k){
            return randomizedSelect(a,p,q-1,i);
        }else{
            return randomizedSelect(a,q+1,r,i-k);
        }
        
    }

    //随机划分方法
    private static int randomizedPartition(int[] a,int p,int r){
        java.util.Random random = new java.util.Random();
        int i=Math.abs(random.nextInt() % (r-p+1)+p);//产生指定范围内的随机数
        swap(a,i,r);//位置为i和r的数交换，从而可以使用正常划分方法
        return partition(a,p,r);
    }

    //正常划分方法（以末尾的数为标准划分数组）
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

    //交换a数组中下标为i和j的元素
    private static void swap(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


}