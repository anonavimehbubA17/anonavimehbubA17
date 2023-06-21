import java.util.Scanner;

public class Cloth {
    private String clothName;
    private String clothType;
    private int clothQuantity;
    private String clothPrice;
    private String clothOrder;

    public Cloth(String clothName, String clothType, int clothQuantity, String clothPrice, String clothOrder) {
        this.clothName = clothName;
        this.clothType = clothType;
        this.clothQuantity = clothQuantity;
        this.clothPrice = clothPrice;
        this.clothOrder = clothOrder;
    }

    public String getClothName() {
        return clothName;
    }

    public String getClothType() {
        return clothType;
    }

    public int getClothQuantity() {
        return clothQuantity;
    }

    public String getClothPrice() {
        return clothPrice;
    }

    public String getClothOrder() {
        return clothOrder;
    }
}