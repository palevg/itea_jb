package itea.lsn5.Student;

import java.text.ParseException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyClass {

    public static class NameException extends Exception {
        public NameException(String message) {
            super(message);
        }

        @Override
        public String getMessage() {
            return "Exception: " + super.getMessage();
        }
    }

    public static void main(String[] args) throws IOException {
        StudentList sl = new StudentList();
        sl.add(new Student("Сева", "Евгиенко", new Date(1986-1900, 1, 1)));
        sl.add(new Student("Вася", "Пупкин", new Date(1970-1900, 3, 28)));
        sl.add(new Student("Гоша", "Куценко", new Date(1967-1900, 8, 15)));
        int task;
        do {
            System.out.println("Перечень задач: 1 - добавить запись о студенте; 2 - удалить запись о студенте;");
            System.out.println("3 - искать по имени; 4 - искать по фамилии; 5 искать по дате рождения; 0 - завершение работы.");
            System.out.print("Выберите задачу: ");
            Scanner sc = new Scanner(System.in);
            task = Integer.parseInt(sc.nextLine());
            switch (task) {
                case 1: //add
                    boolean flag = false;
                    String str1, str2;
                    do {
                        System.out.print("Введите имя студента: ");
                        str1 = sc.nextLine();
                        try {
                            if (!str1.equals(""))
                                flag = true;
                            else
                                throw new NameException("Поле имени пустое!");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!flag);
                    flag = false;
                    do {
                        System.out.print("Введите фамилию студента: ");
                        str2 = sc.nextLine();
                        try {
                            if (!str2.equals(""))
                                flag = true;
                            else
                                throw new NameException("Поле фамилии пустое!");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!flag);

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    flag = false;
                    do {
                        System.out.print("Введите дату рождения студента в формате Число/Месяц/Год: ");
                        try {
                            sl.add(new Student(str1, str2, sdf.parse(sc.nextLine())));
                            flag = true;
                        } catch (ParseException e) {
                            System.out.println("Некорректный ввод даты!");
                        }
                    } while (!flag);
                    break;
                case 2: //delete
                    System.out.print("Введите номер записи в таблице студентов, которую надо удалить: ");
                    int n = Integer.parseInt(sc.nextLine());
                    StudentList slNew = new StudentList();
                    for (int f = 0; f < sl.getListLength(); f++) {
                        if (f != n) {
                            slNew.add(sl.get(f));
                        }
                    }
                    sl = slNew;
                    break;
                case 3: //search of name
                    System.out.print("Введите имя студента: ");
                    n = sl.findName(sc.nextLine());
                    if (n >= 0 && n < sl.getListLength())
                        System.out.println(sl.get(n).getSurname() + ", " + sl.get(n).getBirth().toString());
                    else
                        System.out.println("Студента с таким именем в таблице нет.");
                    break;
                case 4: //search of surname
                    System.out.print("Введите фамилию студента: ");
                    n = sl.findSurname(sc.nextLine());
                    if (n >= 0 && n < sl.getListLength())
                        System.out.println(sl.get(n).getName() + ", " + sl.get(n).getBirth().toString());
                    else
                        System.out.println("Студента с такой фамилией в таблице нет.");
                    break;
                case 5: //search of birth
                    System.out.print("Введите дату рождения студента в формате Число/Месяц/Год: ");
                    sdf = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        n = sl.findBirth(sdf.parse(sc.nextLine()));
                        if (n >= 0 && n < sl.getListLength())
                            System.out.println(sl.get(n).getSurname() + " " + sl.get(n).getName());
                        else
                            System.out.println("Студента с такой датой рождения в таблице нет.");
                    } catch (ParseException e) {
                        System.out.println("Некорректный ввод даты!");
                    }
                    break;
                default:
                    System.out.println("До свидания.");
                    break;
            }
//            System.console().flush();
        } while (task != 0);
    }
}