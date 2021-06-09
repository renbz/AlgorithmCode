package ch03;

/**
 * @author Ren
 */

public class R06_TuPackage {

    public static void main(String[] args) {
        int c= 100;
        int[][] arr  = arr(c);
        int[] index = new int[c];
        ConvexHull(arr,index);
        print(arr,index);

    }


    /**
     * 获取边界点
     * @param p
     * @param index
     */
    static int ccc=0;
    static void ConvexHull(int p[][],int [] index){
        int pl = p.length;
        for (int i = 0; i < pl; i++) {
            for (int  j = i+1; j < pl; j++) {
                int a = p[j][1]-p[i][1];
                int b = p[j][0]-p[i][0];
                int c = p[i][0]*p[j][1]-p[i][1]*p[j][0];
                int count1 = 0;
                int count2 = 0;
                for (int k = 0; k < pl; k++) {
                    if(k==j || k==i){
                        continue;
                    }
                    if(a*p[k][0]+b*p[k][1]==c){
                        count1++;
                        count2++;
                    }else if(a*p[k][0]+b*p[k][1]>c){
                        count1++;
                    }else if(a*p[k][0]+b*p[k][1]<c){
                        count2++;
                    }
                }

                if((count1== (pl-2)) || (count2==(pl-2))){
                    System.out.println("----------------  "+ccc++);
                    index[i]=1;
                    index[j]=1;
                }
            }
        }
    }


    /**
     * 打印边界点
     */
    static void print(int p[][] , int index[]){
        for (int i = 0; i < index.length; i++) {
            if(index[i]==1){
                System.out.println(p[i][0]+","+p[i][1]);
            }
        }
    }


    /**
     * 生成随机数组
     */
    static int[][] arr(int c){
        int [][] arr= new int[c][2];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        return arr;
    }

}
