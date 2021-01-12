package SilliconValley.BinaryTree.Threaded;

public class ThreadedBinaryTreeDemo {
    public static void main(String[] args) {
        HeroNode root=new HeroNode(1,"tom");
        HeroNode n2=new HeroNode(3,"jack");
        HeroNode n3=new HeroNode(6,"sam");
        HeroNode n4=new HeroNode(8,"mary");
        HeroNode n5=new HeroNode(10,"park");
        HeroNode n6=new HeroNode(14,"tony");

        root.setLeftTree(n2);
        root.setRightTree(n3);
        n2.setLeftTree(n4);
        n2.setRightTree(n5);
        n3.setLeftTree(n6);




    }

}

class HeroNode{
    private int no;
    private String name;
    private HeroNode leftTree;
    private HeroNode rightTree;
    private int leftType;
    private int rightType;

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

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
