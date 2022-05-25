package classPractice;
class Date{
    private int year, month, date;
    public Date(int y, int m, int d){
        year=y;
        month=m;
        date=d;
    }
    @Override
    public String toString(){
        return "Date [year = "+this.year+", month = "+this.month+", date = "+this.date+"]";
    }
}
class Employee{
    private String name;
    private Date birthday;
    public Employee(String name, Date birthday){
        this.name=name;
        this.birthday=birthday;
    }
    @Override
    public String toString(){
        return "Employee [name = "+this.name+", birthday = "+birthday+"]";
    }
}
public class Birthday {
    public static void main(String[] args) {
        Date birth = new Date(1945, 8, 15);
        Employee emp = new Employee("홍길동", birth);
        System.out.println(emp);
    }
}