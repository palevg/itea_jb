package itea.lsn5.Cats;

public class CatMain {

    public static void main(String[] args) {
        Cat murka = new Cat("Мурка");
        murka.setAge(3);
        murka.setBreed("сиамская");
        murka.setColor("дымчастый");
        newCatsDay(murka, 2);

        Cat arnold = new Cat("Арнольд", "графитовый", "британец", 2);
        newCatsDay(arnold, 4);

        Cat vas = new Cat("Вася");
        newCatsDay(vas, 3);
    }
    static void newCatsDay(Cat newCat, int daySleep) {
        newCat.catsDay(daySleep);
        System.out.println("Кошка " + newCat.getName() + ", " + newCat.getAge() + " года, порода " + newCat.getBreed()
                + ", цвет " + newCat.getColor());
        System.out.println("За день (" + daySleep + " дневных сна) покушала " + newCat.getCountFed()
                + " раза и умылась " + newCat.getCountWash() + " раз");
        System.out.println();
    }
}