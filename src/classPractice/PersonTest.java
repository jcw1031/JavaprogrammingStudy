package classPractice;
class Person{
    String name;
    private String mobile;
    private String office;
    private String email;

    public Person(String n, String m, String o, String e){
        name=n; mobile=m; office=o; email=e;
    }
    public String toString(){
        return "Person [name = "+name+", mobile = "+mobile+", office = "+office+", email = "+email+"]";
    }
    public void setName(String n){
        name=n;
    }
    public void setMobile(String m){
        mobile =m;
    }
    public void setOffice(String o){
        office =o;
    }
    public void setEmail(String e){
        email=e;
    }
    public String getName(){
        return name;
    }
    public String getMobile(){
        return mobile;
    }
    public String getOffice(){
        return office;
    }
    public String getEmail(){
        return email;
    }
}
public class PersonTest {
    public static void main(String[] args) {
        Person obj=new Person("kim", "01012345678","0317654321", "jcsdf@asdf.com");
        System.out.println(obj);

        obj.setName("Park");
        obj.setMobile("01095171530");
        obj.setOffice("0413347457");
        obj.setEmail("cba@example.com");
        System.out.println(obj);

        Person obj2=obj;
        System.out.println(obj2);
    }
}
