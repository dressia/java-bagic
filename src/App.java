import java.util.ArrayList;
import java.util.List;

class App {
    public static void main(String[] args) {
        App ani = new App();
        ani.Test(new Fish());
        ani.Test(new Tiger());
        ani.Test(new Bird());
        ani.Test(new Human());
        Animal hoi = new Fish();
        Animal hou = new Tiger();
        Animal hau = new Bird();
        Animal hai = new Human();


        List numbers = new ArrayList();

        numbers.set(1, 11);
        numbers.set(2, 22);
        numbers.set(3, 33);
        numbers.set(4, 44);

        for (; ; ) {

        }


    }

    public void Test(Animal animal) {
        animal.move();
    }
}

class Animal {
    void move() {
        System.out.println("동물이 움직여요.");
    }
}

class Fish extends Animal {
    void move() {
        System.out.println("물고기가 물속에서 헤엄을 친다요.");
    }
}

class Tiger extends Animal {
    void move() {
        System.out.println("호랑이가 네발로 걸어다닌다요.");
    }
}

class Bird extends Animal {
    void move() {
        System.out.println("새가 하늘을 날라다닌다요.");
    }
}

class Human extends Animal {
    void move() {
        System.out.println("닝겐은 직립보행을 한다용.");
    }
}







