package DesignMode.Single;

//静态代码块
public class SingleHungry2 {
    public static void main(String[] args) {
        Single wen= Single.getWen();
        System.out.println(wen.hashCode());
    }
    static class Single{
        private Single(){
            wen=new Single();
        }

        private static Single wen;

        public static Single getWen(){
            return wen;
        }
    }
}
