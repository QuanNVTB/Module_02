public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");

        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a1 sound: " +a2.makeSound());
    }
}
