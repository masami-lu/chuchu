package DesignMode;

public class Rely {
    public static void main(String[] args) {
        Sony sony =new Sony();
        /*OpenClose openClose=new OpenClose();
        openClose.open(sony);*/

        /*OpenClose openClose=new OpenClose(sony);
        openClose.open();*/

        OpenClose openClose=new OpenClose();
        openClose.setTV(sony);
        openClose.open();
    }


    //接口传递
    /*interface IOpenAndClose{
        public void open(ITV itv);
    }
    interface ITV{
        public void play();
    }
    static class Sony implements ITV{

        @Override
        public void play() {
            System.out.println("sony is open");
        }
    }
    static class OpenClose implements IOpenAndClose{

        @Override
        public void open(ITV itv) {
            itv.play();
        }
    }*/

    //构造方法传递
    /*interface IOpenAndClose{
        public void open();
    }
    interface ITV{
        public void play();
    }
    static class Sony implements ITV{

        @Override
        public void play() {
            System.out.println("sony is open");
        }
    }
    static class OpenClose implements IOpenAndClose{
        public ITV itv;
        public OpenClose(ITV itv){
            this.itv=itv;
        }

        @Override
        public void open() {
            this.itv.play();
        }
    }*/

    //setter传递
    interface IOpenAndClose{
        public void open();
        public void setTV(ITV itv);
    }
    interface ITV{
        public void play();
    }
    static class Sony implements ITV{

        @Override
        public void play() {
            System.out.println("sony is open");
        }
    }
    static class OpenClose implements IOpenAndClose{
        public ITV itv;
        @Override
        public void open() {
            this.itv.play();
        }

        @Override
        public void setTV(ITV itv) {
            this.itv=itv;
        }
    }
}
