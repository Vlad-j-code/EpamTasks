package epam.learn.main.сlasses.mainTask;

public class Car {

    private int id;
    private String mark;
    private String model;
    private int yearOfIssue;
    private String color;
    private long price;
    private String registrationNumber;

    Car() {
        this.id = 0;
        this.mark = "";
        this.model = "";
        this.yearOfIssue = 0;
        this.color = "";
        this.price = 0;
        this.registrationNumber = "";
    }

    Car(int id, String mark, String model, int yearOfIssue, String color, long price, String registrationNumber) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "MainTaskCar{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
