package Animals;
//interface

public class AnimalSchool {
    public static void main(String[] args) {
         Hare hare = new Hare();
         hare.run();
         Duck duck = new Duck();
         duck.swim();
         duck.run();

         Bear bear = new Bear();
         bear.type = TypeBears.Panda;
    }
}

interface Runnable{
    void run();
}

interface Swimable{
    void swim();
}

interface Climable{
    void climb();
}

abstract class Animal{

}

abstract class  Insect extends Animal{

}

enum TypeBears{Brown, White, Koala, Panda};

class Bear extends  Animal{
    public TypeBears type;
}

class Hare extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("hare: I can run");
    }
}

class Duck extends Animal implements Runnable, Swimable{

    @Override
    public void run() {
        System.out.println("Duck: I can run");
    }

    @Override
    public void swim() {
        System.out.println("Duck: I can swim");
    }
}

