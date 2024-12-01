package easy;

import java.util.ArrayList;

public class Solution19 {
	public ArrayList<TreeNode> generateTrees(int a) {
		ArrayList<TreeNode> result = new ArrayList<>();
		
		if(a == 0) return result;
		return buildTrees(1, a);
	}
	
	private ArrayList<TreeNode> buildTrees(int start, int end) {
		ArrayList<TreeNode> result = new ArrayList<>();
		
		if(start > end) {
			result.add(null);
			return result;
		}
		
		for(int i=start; i<=end; i++) {
			ArrayList<TreeNode> leftTrees = buildTrees(start, i-1);
			ArrayList<TreeNode> rightTrees = buildTrees(i+1, end);
			
			for(TreeNode left : leftTrees) {
				for(TreeNode right : rightTrees) {
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					result.add(root);
				}
			}
		}
		
		return result;
	}
	
	public static void printNode(TreeNode node) {
		System.out.println(node.val);
		if(node.right != null) {
			System.out.println("\\");
			printNode(node.right);
		}
		if(node.left != null) {
			System.out.println("/");
			printNode(node.left);
		}
	}
	
	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		ArrayList<TreeNode> answer = sol.generateTrees(15);
		for(TreeNode node : answer) {
			System.out.print("root");
			printNode(node);
		}
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
