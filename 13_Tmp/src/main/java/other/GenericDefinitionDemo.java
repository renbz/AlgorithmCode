package other;

/**
 * @author Ren
 */

public class GenericDefinitionDemo<T> {

    static <String,T,Xiaomi> String get(String string,Xiaomi xiaomi){
        return string;
    }
    static <A,B> A get2(A a,B b){
        return a;
    }
    public static void main(String[] args) {
        Integer first = 222;
        Long second = 333L;
        // 调用上方定义的get方法zl
        Integer result = get(first,second);
        System.out.println(result);
    }
}