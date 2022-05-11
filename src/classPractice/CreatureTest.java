package classPractice;

class Creature{
    int breath;
}
class Animal extends Creature{
    int move;
}
class Mammals extends Animal{
    int milk;
}
class Human extends Mammals{
    int smile;
}
public class CreatureTest {
    public static void main(String[] args) {
        Creature ct=new Creature();
        Human h=new Human();

        ct.breath=1;
        h.breath=1;
    }
}
