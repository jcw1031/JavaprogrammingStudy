package classPractice;

class Sports{
    String getName(){
        return "아직 결정되지 않음";
    }
    int getPlayers(){
        return 0;
    }
}

class Football extends Sports{
    String getName(){
        return "추구";
    }
    int getPlayers(){
        return 11;
    }
}

class TableTennis extends Sports{
    String getName(){
        return "탁구";
    }
    int getPlayers(){
        return 2;
    }
}
public class SportsTest {
    public static void main(String[] args) {
        Football f = new Football();
        TableTennis t = new TableTennis();

        System.out.println("경기이름 : "+f.getName());
        System.out.println("경기자 수 : "+f.getPlayers());
        System.out.println("경기이름 : "+t.getName());
        System.out.println("경기자 수 : "+t.getPlayers());
    }
}
