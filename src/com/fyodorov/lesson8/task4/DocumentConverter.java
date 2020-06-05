package com.fyodorov.lesson8.task4;
/**
 * Класс {@code DocumentConverter} Реализовать два класса: договор и акт. В каждом сделать поля: номер, дата, список товаров (массив строк).
 * Написать класс со статическим методом конвертации договора в акт (на вход передавать договор, на выходе получаем акт).
 * @author Alexandr Fyodorov
 */
public class DocumentConverter {
    public static Act convertContract(Contract contract, String employer) {
        Act act = new Act();
        act.setContractNumber(contract.getContractNumber());
        act.setContractDate(contract.getContractDate());
        act.setProducts(contract.getProducts());
        act.setEmployer(employer);
        return act;
    }

    public static void main(String[] args) {
        String[] products = {"Чай","Кофе","Гречка","Рис","Курица","Сок"};
        Contract contract = new Contract(11,"05.06.2020",products);
        Act act1 = convertContract(contract,"Иванов");
        System.out.println(act1.toString());
        products = new String[]{"Компьютер", "Монитор", "Ноутбук", "Планшет"};
        contract = new Contract(12,"05.06.2020",products);
        Act act2 = convertContract(contract,"Петров");
        System.out.println(act2.toString());
    }
}
