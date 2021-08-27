package graphsAndTree_4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import graphsAndTree_4.models.TreeNode;

public class Traversal{
    
    public static void levelOrder(TreeNode<Integer> root){
        Map<Integer, List<Integer>> levels = new HashMap<Integer,List<Integer>>();
        lTraverse(root, 0, levels);
        System.out.println(levels);
    }

    private static void lTraverse(TreeNode<Integer> node, int h, Map<Integer, List<Integer>> levels){
        if(node != null){
            if(levels.get(h) == null){
                List<Integer> v = new ArrayList<>();
                v.add(node.getValue());
                levels.put(h, v);
            }else{
                levels.get(h).add(node.getValue()) ;
            }
        }else{
            return;
        }
        lTraverse(node.getLeft(), h+1, levels);
        lTraverse(node.getRight(), h+1, levels);
    }
}
