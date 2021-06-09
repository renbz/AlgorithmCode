package java_2014_C;

public class Main001_猜年龄 {
    public static void main(String[] args) {
        for(int i=1;i<100;i++)
            for(int j=1;j<100;j++)
                if(i!=j && i*j==6*(i+j) && i-j<=8 && i-j>0)
                    System.out.println(i+"    "+j );
    }
}
