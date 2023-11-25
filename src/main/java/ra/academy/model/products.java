package ra.academy.model;

public class products {
    private int id;

    private String name;
    private String detail;
    private double price;
    private String proImg;
    private boolean status;

    public products(boolean status) {
        this.status = status;
    }

    public products() {
    }

    public products(int id, String name, String detail, double price, String proImg) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.proImg = proImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProImg() {
        return proImg;
    }

    public void setProImg(String proImg) {
        this.proImg = proImg;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
