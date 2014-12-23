package itea.lsn10.Wrk_Human;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human[] list = {new Human("Вася", 40), new Human("Петя", 20), new Human("Олег", 3), new Human("Юра", 7)};
        Human h1 = (Human) list[2].clone();
        System.out.println(h1.equals(list[2]) + " - сравнение " + h1 + " и " + list[2]);
        System.out.println((h1.hashCode() == list[2].hashCode()) + " - сравнение хэш " + h1 + " и " + list[2]);
        System.out.println(h1.equals(list[1]) + " - сравнение " + h1 + " и " + list[1]);
        System.out.println((h1.hashCode() == list[1].hashCode()) + " - сравнение хэш " + h1 + " и " + list[1]);
        Arrays.sort(list);
        for (Human h : list)
            System.out.println(h);
    }
}

class Human implements Comparable, Cloneable {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Human h = (Human) super.clone();
        //h.date = (Date) date.clone(); // создаем копию отдельно
        return h;
    }

    @Override
    public String toString() { return name + ", возраст " + age; }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Human other = (Human) obj;
        return (this.name == other.name) && (this.age == other.age);
    }

    @Override
    public int compareTo(Object another) { //чтоб сортировка была по убыванию - поменять местами знаки "<" и ">"
        Human h = (Human) another;
        if (age < h.age)
            return -1;
        else if (age == h.age)
            return 0;
        else if (age > h.age)
            return 1;
        else
            return 0; // make compiler happy
    }
}