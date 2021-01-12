package DesignMode.Single;

public class LazySynchronized {
    public static void main(String[] args) {
        Single wen= Single.getWen();
        System.out.println(wen.hashCode());
    }

    static class Single{
        private static Single wen;

        private Single(){
        }

        public static  Single getWen(){
            if (wen==null){
                synchronized(Single.class){
                    wen=new Single();
                }
            }
            return wen;
        }
    }
}
