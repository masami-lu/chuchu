package SilliconValley.Hashed;

public class HshTabDemo {
    public static void main(String[] args) {

    }
}

//hashedTab
class HashTab{
    private EmpLinkedList[] empLinkedListArray;
    private int size;

    public HashTab(int size) {
        this.size = size;
        empLinkedListArray = new EmpLinkedList[size];
        for (int i=0;i<size;i++){
            empLinkedListArray[i]=new EmpLinkedList();
        }
    }
    public void add(Emp emp){
        int empLinkedListNo=hashFun(emp.id);
        empLinkedListArray[empLinkedListNo].add(emp);

    }
    public int hashFun(int id){
        return id%size;
    }
}

//employee
class Emp{
    public int id;
    public String name;
    public Emp next;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }

}

//employee list
class  EmpLinkedList{
    private Emp head;
    public void add(Emp emp){
        if (head==null){
            head.next=emp;
        }
        Emp curTemp=head;
        while (true){
            if (curTemp.next==null){
                break;
            }
            curTemp=curTemp.next;
        }
    }
    public void list(int no){
        if (head==null){
            System.out.println("empty");
        }
        Emp curTemp=head;
        while (true){
            System.out.println(curTemp.id+","+curTemp.name);
            if (curTemp.next==null){
                break;
            }
            curTemp=curTemp.next;
        }
    }
}


