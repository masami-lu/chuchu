package book.three;


public class Ti26 {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){val=x;}
    }
    boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean result=false;
        if (A!=null&&B!=null){
            if (A.val==B.val)
                result=recur(A,B);
            if (!result)
                result=isSubStructure(A.left,B);
            if (!result)
                result=isSubStructure(A.right,B);
        }
        return result;
    }
    boolean recur(TreeNode A, TreeNode B){
        if (B==null)
            return true;
        if (A==null)
            return false;
        if (A.val!=B.val){
            return false;
        }
        return recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
