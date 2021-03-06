package md2.model;

public class Product {
  private long id;
  private String name;
  private Double price;
  private Integer quantity;
  private String description;
  // hàm khởi tạo
   public Product(){

   };
    public Product(long id, String name, Double price, Integer quantity, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }
    //hàm get ,set

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //Hàm các trường tạo sản phẩm
    public static Product parseAdmin(String record) {

        String[] fileds = record.split(",");
        long id = Long.parseLong(fileds[0]);
        String name = fileds[1];
        double price = Double.parseDouble(fileds[2]);
        int quantity = Integer.parseInt(fileds[3]);
        String description = fileds[4];
        return new Product(id,name,price,quantity,description);


    }
    //phương thức toString


    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s",
                id,
                name,
                price,
                quantity,
                description);
    }
}
