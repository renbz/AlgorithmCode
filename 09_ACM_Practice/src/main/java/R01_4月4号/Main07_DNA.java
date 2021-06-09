package R01_4月4号;

/**
 * @author Ren
 */
import java.util.*;
public class Main07_DNA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        while(k-->0){
            HashMap<Character,Integer> hashMap = new HashMap();
            int n =in.nextInt();
            for (int i = 0; i < n; i++) {
                String s = in.nextLine();
                int index1 = s.lastIndexOf('A');
                int index2 = s.lastIndexOf('C');
                int index3 = s.lastIndexOf('G');
                int index4 = s.lastIndexOf('T');
                if(hashMap.get('A')==null || hashMap.get('A')< index1+1 ) hashMap.put('A',index1+1);
                if(hashMap.get('C')==null || hashMap.get('C')< index2+1 ) hashMap.put('C',index2+1);
                if(hashMap.get('G')==null || hashMap.get('G')< index3+1 ) hashMap.put('G',index3+1);
                if(hashMap.get('T')==null || hashMap.get('T')< index4+1 ) hashMap.put('T',index4+1);

            }
            int t = hashMap.get('A')+hashMap.get('C')+hashMap.get('G')+hashMap.get('T');
            System.out.println(t);
        }
    }
}
