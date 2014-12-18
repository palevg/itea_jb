package itea.lsn5.Cats;

public class Cat {
    private String nickname;
    private String color = "чёрный";
    private String breed = "европеец";
    private int age = 4;
    private boolean sleeping;
    private boolean fed;
    private int countWash;
    private int countFed;
    private int countSleep;
    private static final String VOICE1 = "Мяу!";
    private static final String VOICE2 = "Муррр";

    public Cat(String nick) {
        this.nickname = nick;
        countSleep = 0;
    }
    public Cat(String nick, String clr, String brd, int a) {
        this.nickname = nick;
        this.color = clr;
        this.breed = brd;
        this.age = a;
        countSleep = 0;
    }
    public String getName() {
        return nickname;
    }
    public void setColor(String clr) {
        this.color = clr;
    }
    public String getColor() {
        return color;
    }
    public void setBreed(String br) {
        this.breed = br;
    }
    public String getBreed() {
        return breed;
    }
    public void setAge(int value) {
        this.age = value;
    }
    public int getAge() {
        return age;
    }
    private boolean isSleep() {
        return sleeping;
    }
    private void wakeUp() {
        System.out.println("Кошка " + this.nickname + " проснулась. " + VOICE1);
        sleeping = false;
        countWash++;
        setHungry();
    }
    private void toSleep() {
        countSleep++;
        countWash++;
        sleeping = true;
        System.out.println("Кошка " + this.nickname + " уснула.");
    }
    private void setFed() {
        countFed++;
        fed = true;
        System.out.println(this.nickname + ": " + VOICE2 + " (типа, спасибо - наелась )))");
        countWash++;
    }
    public int getCountFed() {
        return countFed;
    }
    public int getCountWash() {
        return countWash;
    }
    private void setHungry() {
        fed = false;
        System.out.println(this.nickname + ": " + VOICE1 + " (хочу кушать!!)");
    }
    private void toGames() {
        System.out.println("Кошка " + this.nickname + " поигралась.");
        setHungry();
    }
    public void catsDay(int cntSlp) { //количество дневных снов
        sleeping = true;
        while (countSleep <= cntSlp) {
            if (isSleep())
                wakeUp();
            if (!fed)
                setFed();
            toGames();
            setFed();
            toSleep();
        }
    }
}