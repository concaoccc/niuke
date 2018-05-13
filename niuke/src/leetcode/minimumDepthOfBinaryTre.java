package leetcode;

public class minimumDepthOfBinaryTre {
	public int num  =0;
	public int run(TreeNode root) {
		num++;
		if (root == null)
		{
			return 0;
		}
		int left = 0;
		int right = 0;
		if (root.left!=null)
		{
			left = run(root.left);
		}
		else {
			return 1;
		}
		if (root.right != null)
		{
			right = run(root.right);
		}
		else {
			return 1;
		}
		return Math.max(left, right)+1;
    }
	public static void main(String[] args) {
		minimumDepthOfBinaryTre test = new minimumDepthOfBinaryTre();
		TreeNode tmp1 = new TreeNode(1);
		TreeNode tmp2 = new TreeNode(1);
		TreeNode tmp3 = new TreeNode(1);
		tmp1.left = tmp2;
		tmp1.right = tmp3;
		TreeNode tmp4 = new TreeNode(1);
		TreeNode tmp5 = new TreeNode(1);
		tmp2.left = tmp4;
		tmp2.right = tmp5;
		TreeNode tmp6 = new TreeNode(1);
		TreeNode tmp7 = new TreeNode(1);
		tmp3.left = tmp6;
		tmp3.right = tmp7;
		System.out.println(test.run(tmp1));
		System.out.println(test.num);
	}
	
}
