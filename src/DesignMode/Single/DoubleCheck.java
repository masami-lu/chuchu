package DesignMode.Single;

public class DoubleCheck {
    public static void main(String[] args) {
        Single wen= Single.getWen();
        System.out.println(wen.hashCode());
    }

    static class Single{
        private static volatile Single wen;

        private Single(){
        }

        public static  Single getWen(){
            if (wen==null){
                synchronized(Single.class){
                    if (wen==null){
                        wen=new Single();
                    }
                }
            }
            return wen;
        }
    }
}
