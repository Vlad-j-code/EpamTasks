package epam.learn.main.сlasses.mainTask;

import java.util.Scanner;

public class CarStart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список асортимента автомобилей");
        for (int i = 0; i < car().length; i++) {
            System.out.println(car()[i]);
        }

        //Car[] carsList = carsList();          ///// ручное заполнение
        Car[] carsList = car();             ////// автозаполнение

        System.out.println("----------a)Вывести список автомобилей заданной марки.");
        System.out.print("Введите марку автомобиля: ");
        checkMark(carsList, scanner.next());

        System.out.println("----------b)Введите список автомобилей заданной модели, которые эксплуатируются больше n лет.");
        System.out.print("Введите модель автомобиля: ");
        String model = scanner.next();
        System.out.print("Введите количетво лет эксплуатации: ");
        checkModel(carsList,model,scanner.nextInt());

        System.out.println("----------c)Вывести список автомобилей заданного года выпуска, цена которых больше указанной.");
        System.out.print("Введите год выпуска: ");
        int year = scanner.nextInt();
        System.out.print("Введите цену: ");
        checkYear(carsList,year,scanner.nextInt());
    }
    static Car[] carsList(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество автомобилей: ");
        Car[] cars = new Car[scanner1.nextInt()];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            System.out.println();
            System.out.print("Введите id: ");
            cars[i].setId(scanner1.nextInt());
            System.out.print("Введите марку: ");
            cars[i].setMark(scanner1.next());
            System.out.print("Введите модель: ");
            cars[i].setModel(scanner1.next());
            System.out.print("Введите год выпуска: ");
            cars[i].setYearOfIssue(scanner1.nextInt());
            System.out.print("Введите цвет: ");
            cars[i].setColor(scanner1.next());
            System.out.print("Введите цену: ");
            cars[i].setPrice(scanner1.nextInt());
            System.out.print("Введите регистрационный номер: ");
            cars[i].setRegistrationNumber(scanner1.next());
        }

        return cars;
    }

    static Car[] car(){
        Car[] cars = new Car[7];
        cars[0]= new Car(1,"Ford","Fiesta",2015,"White",8600,"AA_9265_AK");
        cars[1]= new Car(2,"Lexus","GS_350",2008,"Black",11900,"AE_4525_OM");
        cars[2]= new Car(3,"Nissan","Rogue",2016,"Red",13600,"AT_3263_OH");
        cars[3]= new Car(4,"Lamborghini","Gallardo",2006,"Orange",88500,"AM_6191_CT");
        cars[4]= new Car(5,"Porsche","Cayenne",2013,"Black",55500,"AH_7922_XC");
        cars[5]= new Car(5,"Bentley","S1",1957,"Green",35000,"AP_7922_BT");
        cars[6]= new Car(5,"Audi","S1",2013,"Black",20500,"AH_5312_XC");


        return cars;
    }

    static void checkMark(Car[] cars, String mark){
        for (Car car : cars) {
            if(car.getMark().equals(mark))
                System.out.println(car.toString());
        }
        System.out.println();
    }

    static void checkModel(Car[] cars, String model, int n){
        for (Car car : cars) {
            if(car.getModel().equals(model) && (2021-car.getYearOfIssue())>n){
                System.out.println(car.toString());
            }
        }
        System.out.println();
    }

    static void checkYear(Car[] cars, int year, int price){
        for (Car car : cars) {
            if(car.getYearOfIssue()==year && car.getPrice()>price)
                System.out.println(car.toString());
        }
    }
}
