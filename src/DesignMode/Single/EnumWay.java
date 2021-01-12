package DesignMode.Single;

public class EnumWay {
    public static void main(String[] args) {
        Single wen=Single.WEN;
        wen.sayOK();
        System.out.println(wen.hashCode());
    }

    enum Single{
        WEN;
        public void sayOK(){
            System.out.println("wen");
        }
    }
}
