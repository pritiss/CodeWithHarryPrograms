
class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int v){
        this.a=v;
    }
    public int return1(){
        return 1;
    }
}
public class pps_47_This_Super_Keyword {
    public static void main(String[] args) {
        EkClass  e = new EkClass(65);
        System.out.println(e.getA());
    }
}
