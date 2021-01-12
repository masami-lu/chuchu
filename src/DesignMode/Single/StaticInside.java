package DesignMode.Single;

public class StaticInside {
    public static void main(String[] args) {
        Single wen= Single.getWen();
        System.out.println(wen.hashCode());
    }

    static class Single{
        private static volatile Single wen;

        private Single(){
        }

        public static class SingleWen{
            private final static Single WEN=new Single();
        }

        public static  Single getWen(){
            return SingleWen.WEN;
        }
    }
}
