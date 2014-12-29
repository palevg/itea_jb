package itea.lsn11;

import java.io.*;

/**
 *
 */
public class DZ113_10men {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            RandomAccessFile r = new RandomAccessFile("D:\\Temp\\10men.out", "r");
            r.close();
        }
        catch (Exception ex) {
            if (ex.equals(0)) {
                // файл есть, выводим инфо
                FileInputStream fis = new FileInputStream("D:\\Temp\\humans.out");
                ObjectInputStream oin = new ObjectInputStream(fis);
                try {
                    for (int i = 0; i < 10; i++)
                        System.out.println((Human) oin.readObject());
                } finally {
                    oin.close();
                }
            }
            else {
                // файла нет, создаем его и вводим инфо
            }
        }
    }
}

class Human implements Serializable {
    private String name;
    private int age, sex, temperament;

    public Human(String name, int age, int sex, int temperament) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.temperament = temperament;
    }

    enum Sex {MALE, FEMALE}

    enum Temperament {CHOLERIC, SANGUINE, PHLEGMATIC, MELANCHOLIC}

    @Override
    public String toString() { return name + ", возраст " + age + ", пол " + Sex.values()[sex] + ", темперамент "
            + Temperament.values()[temperament]; }
}
