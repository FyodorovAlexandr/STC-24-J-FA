package com.fyodorov.lesson8.task1;

class Task3 {

    public static void main(String[] args) {
        A Object = new A();
        System.out.println("Создано объектов: " + A.count);

        A Object2 = new A();
        System.out.println("Создано объектов: " + A.count);
    }

}

class A {

    static int count;

    A() {
        count++;
    }
}
