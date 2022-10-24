import java.lang.constant.Constable;

public class Product {
      //attributes / field = özellik
     private int Id;
     private int stockAmount;
     private String name;
     private String desctription;
     private double price;

    //getter
    public  int getId(){
        return Id;
    }

    public void setId(int i){
        this.Id = Id;

    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesctription() {
        return desctription;
    }

    public void setDesctriptio(String desctription) {
         this.desctription = desctription; 
    } 

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Constable setDesctription(String lenovo_laptop) {
        return desctription;
    }
}
