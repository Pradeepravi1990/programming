package graphsAndTree_4;

import graphsAndTree_4.models.TreeNode;

public class MinimalTree {

    private int[] sortedArray;
    private TreeNode<Integer> root;

    MinimalTree(int[] sortedArray){
        this.sortedArray = sortedArray;
        root = createTree(0,sortedArray.length-1);
    }

    public TreeNode<Integer> getTreeRoot(){
        return root;
    }

    private TreeNode<Integer> createTree(int start, int end){
        if(end < start){
            return null;
        }
        TreeNode<Integer> n = new TreeNode<>();
        int mid = (start + end) / 2;
        n.setValue(sortedArray[mid]);
        n.setLeft(createTree(start, mid-1));
        n.setRight(createTree(mid+1, end));
        return n;
    }
}
