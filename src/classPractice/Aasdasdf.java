package classPractice;

class Super{
    public String SS="super";
    public String sout(){
        return "SuperStatic";
    }
    public String nout(){
        return "SuperNormal";
    }
}

public class Aasdasdf extends Super{
    public static final String SS="sub";
    public String sout(){
        return "SubStatic";
    }
    public String nout(){
        return "SubNormal";
    }
    public static void main(String[] args) {
        Super s=new Aasdasdf();
        System.out.println(s.SS);
        System.out.println(s.sout());
        System.out.println(s.nout());

        System.out.println(((Aasdasdf)s).SS);
        System.out.println(((Aasdasdf)s).sout());
        System.out.println(((Aasdasdf)s).nout());
    }
}
