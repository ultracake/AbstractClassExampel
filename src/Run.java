public class Run
{
    public static void main(String[] args)
    {
        Animal doggo = new Dog();
        Animal cat = new Cat();

        System.out.println("dog:");
        doggo.sound();
        ((Dog) doggo).dance();
        doggo.move();

        System.out.println("cat: ");
        cat.sound();
        cat.move();
        ((Cat) cat).sleep();


    }
}
