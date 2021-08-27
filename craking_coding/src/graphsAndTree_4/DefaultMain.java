package graphsAndTree_4;

public class DefaultMain {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,6, 6,7,8};
		MinimalTree tree = new MinimalTree(a);
		Traversal.levelOrder(tree.getTreeRoot());
	}

}
