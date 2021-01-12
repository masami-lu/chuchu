package SilliconValley.BinaryTree;

public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree=new BinaryTree();
        HeroNode root=new HeroNode(1,"宋江");
        HeroNode node1=new HeroNode(2,"吴用");
        HeroNode node2=new HeroNode(3,"卢俊义");
        HeroNode node3=new HeroNode(4,"关胜");
        HeroNode node4=new HeroNode(5,"林冲");

        binaryTree.setRoot(root);
        root.setLeftTree(node1);
        root.setRightTree(node2);
        node2.setLeftTree(node3);
        node2.setRightTree(node4);
//        System.out.println("前");
//        binaryTree.preOrder();
//        System.out.println("中");
//        binaryTree.infixOrder();
//        System.out.println("后");
//        binaryTree.postOrder();
//
//        System.out.println("==========");
//        HeroNode resNode=binaryTree.infixOrderSearch(5);
//        System.out.println(resNode);
        System.out.println("删除前前序");
        binaryTree.preOrder();
        System.out.println("删除后前序");
        binaryTree.delNode(5);
        binaryTree.preOrder();
    }
}

class BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
    }

    public void delNode(int no){
        if (root!=null){
            if (root.getNo()==no){
                root=null;
            }else {
                root.delNode(no);
            }
        }else {
            System.out.println("empty!");
        }
    }

    public void preOrder(){
        if (root!=null){
            this.root.preOrder();
        }else {
            System.out.println("NO");
        }
    }
    public void infixOrder(){
        if (root!=null){
            this.root.infixOrder();
        }else {
            System.out.println("NO");
        }
    }
    public void postOrder(){
        if (root!=null){
            this.root.postOrder();
        }else {
            System.out.println("NO");
        }
    }

    public HeroNode preOrderSearch(int no){
        if (root!=null){
            return root.preOrderSearch(no);
        }else {
            return null;
        }
    }

    public HeroNode infixOrderSearch(int no){
        if (root!=null){
            return root.infixOrderSearch(no);
        }else {
            return null;
        }
    }

    public HeroNode postOrderSearch(int no){
        if (root!=null){
            return root.postOrderSearch(no);
        }else {
            return null;
        }
    }
}

class HeroNode{
    private int no;
    private String name;
    private HeroNode leftTree;
    private HeroNode rightTree;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeftTree() {
        return leftTree;
    }

    public void setLeftTree(HeroNode leftTree) {
        this.leftTree = leftTree;
    }

    public HeroNode getRightTree() {
        return rightTree;
    }

    public void setRightTree(HeroNode rightTree) {
        this.rightTree = rightTree;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //删除节点
    public void delNode(int no){
        if (this.leftTree!=null&&this.leftTree.no==no){
            this.leftTree=null;
            return;
        }
        if (this.rightTree!=null&&this.rightTree.no==no){
            this.rightTree=null;
            return;
        }
        if (this.leftTree!=null){
            this.leftTree.delNode(no);
        }
        if (this.rightTree!=null){
            this.rightTree.delNode(no);
        }
    }

    public void preOrder(){
        System.out.println(this);
        if (this.leftTree!=null){
            this.leftTree.preOrder();
        }
        if (this.rightTree!=null){
            this.rightTree.preOrder();
        }
    }

    public void infixOrder(){

        if (this.leftTree!=null){
            this.leftTree.infixOrder();
        }
        System.out.println(this);
        if (this.rightTree!=null){
            this.rightTree.infixOrder();
        }
    }

    public void postOrder(){

        if (this.leftTree!=null){
            this.leftTree.postOrder();
        }
        if (this.rightTree!=null){
            this.rightTree.postOrder();
        }
        System.out.println(this);
    }

    //查找
    public HeroNode preOrderSearch(int no){
        if (this.no==no){
            return this;
        }
        HeroNode resNode=null;
        if (this.leftTree!=null){
            resNode = this.leftTree.preOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.rightTree!=null){
            resNode=rightTree.preOrderSearch(no);
        }
        return resNode;
    }

    public HeroNode infixOrderSearch(int no){

        HeroNode resNode=null;
        if (this.leftTree!=null){
            resNode = this.leftTree.preOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.no==no){
            return this;
        }
        if (this.rightTree!=null){
            resNode=rightTree.preOrderSearch(no);
        }
        return resNode;
    }

    public HeroNode postOrderSearch(int no){

        HeroNode resNode=null;
        if (this.leftTree!=null){
            resNode = this.leftTree.preOrderSearch(no);
        }
        if (resNode!=null){
            return resNode;
        }
        if (this.rightTree!=null){
            resNode=rightTree.preOrderSearch(no);
        }
        if (this.no==no){
            return this;
        }
        return resNode;
    }

}
