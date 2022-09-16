public class Main {
    public static void main(String[] args) {

        //Задание 5
        int value = 33;
        changeValue(value);

        //если распечатать переменную в методе main, то значение не поменяется,
        // т.е. будет 33, а не 22, т.к. здесь используется примитив - int.

        //Задание 6
        Integer value1 = 33;
        changeValue1(value1);
        //если распечатать переменную в методе main, то значение не поменяется,
        // т.е. будет 33, а не 22, т.к. работаем с др. локальными переменными, которые в методе main,
        // и это не влияет на изначальную переменную.

        //Задание 7-8
        Integer[] value2 = new Integer[2];
        value2[0] = 3;
        value2[1] = 4;
        changeValue2(value2);
        //если распечатать переменную в методе main, то значение не поменяется,
        //т.к. массив - ссылочный тип как и Integer, соответственно работаем с ним в main.


        //Задание 9
        //при создании нового класса, нового объекта останется такой же как в методе main - Lyapis Trubetskoy.

        //Задание 10
        //здесь меняются поля метода main и будет вместо Lyapis Trubetskoy - Ilya Lagutenko.

    }


    //Для задания 5
    public static void changeValue(int value) {
        value = 22;
    }

    //Для задания 6
    public static void changeValue1(Integer value1) {
        value1 = 22;
    }

    //Для задания 7
    public static void changeValue2(Integer value2) {
        Integer[] value2 = new Integer[2];
        value2[0] = 1;
        value2[1] = 2;
    }

    //Для задания 8
    public static void changeValue2(Integer value2) {
        Integer[] value2 = new Integer[2];
        value2[0] = 99;
    }
}
