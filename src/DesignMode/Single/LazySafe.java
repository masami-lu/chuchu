package DesignMode.Single;

public class LazySafe {
    public static void main(String[] args) {
        Single wen= Single.getWen();
        System.out.println(wen.hashCode());
    }

    static class Single{
        private static Single wen;

        private Single(){
        }

        public static synchronized Single getWen(){
            if (wen==null){
                wen=new Single();
            }
            return wen;
        }
    }
}
