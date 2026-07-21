//package Day 2;

class Animal{
    String voice;

    public void makeSound(){
        System.out.println(voice);
    }

}

class Dog extends Animal{
    public Dog(){
        voice ="Bark Bark";
    }
    public void makeSound(){
        System.out.println(this.voice);
    }
}

class Bird extends Animal{
    public Bird(){
        voice ="Chirp Chirp";
    }
    public void makeSound(){
        System.out.println(this.voice);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        //System.out.println("Dog : "+dog.voice);
        dog.makeSound();

        Bird bird = new Bird();

        System.out.println("Bird : "+bird.voice);

        Animal a= new Bird();
        a.makeSound();
    }
}
