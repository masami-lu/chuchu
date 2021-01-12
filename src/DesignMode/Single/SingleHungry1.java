package DesignMode.Single;

//静态常量
public class SingleHungry1 {
    public static void main(String[] args) {
        Single wen=Single.getWen();
        System.out.println(wen.hashCode());
    }
    static class Single{
        private Single(){

        }

        private final static Single wen=new Single();

        public static Single getWen(){
            return wen;
        }
    }
}
