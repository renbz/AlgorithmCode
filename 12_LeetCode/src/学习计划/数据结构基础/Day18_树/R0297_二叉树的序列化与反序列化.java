package 学习计划.数据结构基础.Day18_树;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ren
 */

public class R0297_二叉树的序列化与反序列化 {

    String str = new String();
    public String serialize(TreeNode root) {
        //先序遍历  根左右
        if (root == null) str += "None,";
        else {
            str += String.valueOf(root.val) + ",";
            str = serialize(root.left);
            str = serialize(root.right);
        }
        return str;
    }

    public TreeNode deserialize(String data) {
        String[] dataArray = data.split(",");
        List<String> dataList = new LinkedList<String>(Arrays.asList(dataArray));
        return rdeserialize(dataList);
    }

    public TreeNode rdeserialize(List<String> dataList) {
        if (dataList.get(0).equals("None")) {
            dataList.remove(0);
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(dataList.get(0)));
        dataList.remove(0);
        root.left = rdeserialize(dataList);
        root.right = rdeserialize(dataList);
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
