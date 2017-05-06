package foodsqlitedemo.quocnguyen.com.foodsqlitedemo;

/**
 * Created by Quoc Nguyen on 13-Dec-16.
 */

public class Food {
    private int id;
    private String name;
    private String Date;
    private byte[] image;

    public Food(String name, String Date, byte[] image, int id) {
        this.name = name;
        this.Date = Date;
        this.image = image;
        this.id = id;
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

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}
