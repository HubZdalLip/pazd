package weekend2;

import java.util.Objects;

public class Computer {
    private String ip;
    private String brand;
    private double price;
    private boolean isRunning;

    public Computer() {
    }

    public Computer(String ip, String brand, double price) {
        this.ip = ip;
        this.brand = brand;
        this.price = price;
    }

    public void run() {
        setRunning(true);
    }

    public void stop() {
        setRunning(false);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (ip != null && ip.length() >= 7 && ip.length() <= 15)
            this.ip = ip;
        else {
            this.ip = "";
            System.out.println("Nie podano poprawnego ip");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && brand.length() > 1 && brand.length() < 15)
            this.brand = brand;
        else {
            this.brand = "";
            System.out.println("Nie podano marki!");
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Nie ustawiono ceny!");
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void showDetails() {
        System.out.println("Ip to: " + ip);
        System.out.println("Marka to: " + brand);
        System.out.println("Cena to: " + price);
    }

    @Override
    public String toString() {
        return "Computer{" +
//                "ip='" + ip + '\'' + // mozna dowolnie modyfikowac toString, ktore jest wywolane w momencie wyswietlenia obiektu
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", isRunning=" + isRunning +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.price, price) == 0 &&
                isRunning == computer.isRunning &&
                ip.equals(computer.ip) &&
                brand.equals(computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, brand, price, isRunning);
    }
}
