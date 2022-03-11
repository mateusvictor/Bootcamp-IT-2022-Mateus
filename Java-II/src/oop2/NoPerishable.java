package oop2;

public class NoPerishable extends Product {
    private String type;

    public NoPerishable(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "NoPerishable{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
