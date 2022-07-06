package Testings;

public class Adress {
    private String adress;

    public Adress(String adress) {
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "adress='" + adress + '\'' +
                '}';
    }
}
