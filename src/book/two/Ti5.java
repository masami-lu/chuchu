package book.two;

public class Ti5 {
    public String replaceSpace(String s) {
        StringBuilder res=new StringBuilder();
        for (Character c:s.toCharArray()){
            if (c==' '){
                res.append("%20");
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
