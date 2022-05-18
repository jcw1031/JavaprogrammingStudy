package classPractice;
import java.util.*;

class Contacts{
    String name, call, email;
    static int count=0;

    public Contacts(String name, String call, String email){
        this.name=name; this.call=call; this.email=email;
        count++;
    }

    //get set 쭉 만들어주고
}
public class ContactsTest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String name, call, email;
        String search;
        System.out.println("연락처 입력(종료 : -1");
        ArrayList<Contacts>list=new ArrayList<>();

        while(true){
            System.out.println("name, call, email : ");
                name=s.next();
                if(name.equals("-1")) break;
                call=s.next();
                email=s.next();
                list.add(new Contacts(name, call, email));
            }
        System.out.println("지인들의 수는 "+Contacts.count+"입니다.");
        System.out.print("검색할 이름 : ");
        search=s.next();

        for(Contacts c:list){
            if(c.name.equals(search))
                System.out.println(search+" call : "+c.call+" email : "+c.email);
        }
    }
}
