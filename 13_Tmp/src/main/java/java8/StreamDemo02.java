package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ren
 */

public class StreamDemo02 {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1L,"yykk1","123456"));
        userList.add(new User(2L,"yykk2","123456"));
        userList.add(new User(3L,"yykk3","123456"));

        List<User> collect = userList.stream().map(user -> {
            user.setPassword("");
            return user;
        }).collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
