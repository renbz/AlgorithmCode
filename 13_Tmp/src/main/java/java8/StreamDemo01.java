package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author Ren
 */

public class StreamDemo01 {

    public static void main(String[] args) {
        // 1. 创建一个List集合
        List<Category> categoryList = new ArrayList<>();
        // List<Category> categoryList2 = Collections.emptyList();

        categoryList.add(new Category(1L,"Java","Java",0L,1,1.2f));
        categoryList.add(new Category(2L,"PHP","PHP",0L,2,2.2f));
        categoryList.add(new Category(3L,"JavaScript","JavaScript",0L,3,2.2f));
        categoryList.add(new Category(4L,"Python","Python",0L,10,2.2f));
        categoryList.add(new Category(5L,"Go","Go",0L,8,2.2f));
        categoryList.add(new Category(6L,"Ruby","Ruby",0L,4,2.2f));
    }

    public void StreamSort(List<Category> categoryList){
        //  stream 完成排序
        categoryList.stream().sorted(new Comparator<Category>() {
            @Override
            public int compare(Category o1, Category o2) {
                return o1.getSort()-o2.getSort();
            }
        }).collect(Collectors.toList());

        //System.out.println(categoryList);
        categoryList.forEach(System.out::println);
    }

    /**
     * 过滤 是指 将满足过滤条件的信息，选出来
     * @param categoryList
     */
    public void StreamFile(List<Category> categoryList){
        List<Category> categories = categoryList.stream()
                .filter(cate -> cate.getId().equals(2L)).collect(Collectors.toList());

        categoryList.forEach(System.out::println);
    }


    public void StreamMap(List<Category> categoryList){
        //map改变集合中每个元素的信息
        categoryList.stream().map(cate->{
            cate.setSubtitle(cate.getSubtitle()+"_yykk");
            return cate;
        }).collect(Collectors.toList());
        categoryList.forEach(System.out::println);
    }

    /**
     * 统计集合中元素的数量
     * @param categoryList
     */
    public void StreamCount(List<Category> categoryList){
        long count = categoryList.stream().count();
        System.out.println(count);
    }

    /**
     * 遍历集合
     * @param categoryList
     */
    public void StreamForEach(List<Category> categoryList){
        categoryList.stream().forEach(category -> System.out.println(category));
    }

    /**
     * distinct可以去重元素，如果集合是对象，要distinct，需要对象返回相同的hashcode和 equals
     * @param categoryList
     */
    public void StreamDistinct(List<Category> categoryList){
        categoryList.stream().distinct().collect(Collectors.toList());
        categoryList.forEach(System.out::println);
    }

    /**
     * 求出最大sort的信息
     * @param categoryList
     */
    public void StreamMax(List<Category> categoryList){
        Optional<Category> optionalCategory = categoryList.stream().max((o1,o2)-> o1.getSort()-o2.getSort());
        System.out.println(optionalCategory);
    }

    /**
     * 求集合中某一对象元素属性的和
     * @param categoryList
     */
    public void StreamReduce(List<Category> categoryList){
        // 对集合中的元素的价格求总和
        Float reduce = categoryList.stream().map(res -> {
            return res.getPrice();
        }).reduce(0f, (c1, c2) -> c1 + c2);
        System.out.println(reduce);
    }
}
