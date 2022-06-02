package lesson_3;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*1)
    Есть таблица employees нужно написать запрос чтобы
    получить все записи из таблицы в колонке last_name,
    значения которых начинаются с A

    select last_name where last_name like 'A%';

    2)  Напишите 1 запрос для обновления сразу двух
        колонок в таблице employees (столбцы name, surname)

    update employees set name = 'Alex', surname = 'Ivanov';

    3) Получить данные по студенту сразу из двух таблиц (score, salary)
        1 таблица: поля id name score   table1
        2 таблица: поля id name salary   table2

    select table1.score, table2.salary from table1 left join table2 on table1.name = table2.name;

    4) Посчитать сколько студентов учатся на факультетах
        (1 студент может учиться сразу на нескольких факультетах)

    select count(students) from vuz group by faculty;
    */

    public static void main(String[] args) throws IOException {
        //абсолютный и относительный пути

        //  C:\Program Files\Java\src - абсолютный
        //  \src - относительный путь

        File file = new File("directory/dir/dir_inner");

        /*String[] array = file.list();

        for (String n :
                array) {
            System.out.println(n);
        }*/

        /*String[] array = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.startsWith("3");
            }
        });

        for (String n :
                array) {
            System.out.println(n);
        }*/

        /*File file1 = new File("directory/dir/dir_inner/text.txt");
        //System.out.println(file1.createNewFile());
        //file1.renameTo(new File("directory/dir/dir_inner/text1.txt"));

        System.out.println(file1.getAbsolutePath());*/
        /*long t = System.currentTimeMillis();

        try (FileInputStream in = new FileInputStream("directory/dir/dir_inner/text1.txt")){
            int x;
            while((x = in.read()) != -1){
                System.out.print((char) x);
            }
        }
        System.out.println(System.currentTimeMillis() - t);*/

        /*long t = System.currentTimeMillis();
        try (FileInputStream in = new FileInputStream("directory/dir/dir_inner/text1.txt")){
            byte[] arr = new byte[500];
            int x;
            while((x = in.read(arr)) != -1){
                System.out.println(new String(arr, 0, x, "UTF-8"));
            }
        }
        System.out.println(System.currentTimeMillis() - t);*/
        /*long t = System.currentTimeMillis();
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("directory/dir/dir_inner/text1.txt"),
                "UTF-8");
        int x;

        while ((x = inputStreamReader.read()) != -1){
            System.out.print((char) x);
        }
        inputStreamReader.close();
        System.out.println(System.currentTimeMillis() - t);*/

        /*PipedInputStream in = new PipedInputStream();
        PipedOutputStream out = new PipedOutputStream();
        out.connect(in);*/

        /*ArrayList<InputStream> arrayList = new ArrayList<>();
        arrayList.add(new FileInputStream("directory/dir/dir_inner/123.txt"));
        arrayList.add(new FileInputStream("directory/dir/dir_inner/234.txt"));

        SequenceInputStream in = new SequenceInputStream(Collections.enumeration(arrayList));
        int x;

        while ((x = in.read()) != -1){
            System.out.print((char)x);
        }
        in.close();*/

        /*RandomAccessFile randomAccessFile = new RandomAccessFile("directory/dir/dir_inner/123.txt", "rw");
        randomAccessFile.seek(2);
        System.out.println((char) randomAccessFile.read());
        randomAccessFile.close();*/

    }
}
