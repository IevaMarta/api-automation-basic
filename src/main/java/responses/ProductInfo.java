package responses;

import java.util.Map;

public class ProductInfo {
  // Variables
  private Integer id;
  private String name;
  private String description;
  private Double price;
  private Double deluxePrice;
  private String image;
  private String createdAt;
  private String updatedAt;
  private String deletedAt;
  private Integer bonus;
  private Integer quantity;
  private Double total;
  private BasketItem basketItem;

  // Constructor
  public ProductInfo(Map<String, Object> map) {
    this.id = (Integer) map.get("id");
    this.name = (String) map.get("name");
    this.description = (String) map.get("description");
    this.price = (Double) map.get("price");
    this.deluxePrice = (Double) map.get("deluxePrice");
    this.image = (String) map.get("image");
    this.createdAt = (String) map.get("createdAt");
    this.updatedAt = (String) map.get("updatedAt");
    this.deletedAt = (String) map.get("deletedAt");
    this.bonus = (map.get("bonus") == null) ? null : (Integer) map.get("bonus");
    this.quantity = (map.get("quantity") == null) ? null : (Integer) map.get("quantity");
    this.total = (map.get("total") == null) ? null : (Double) map.get("total");

    if(map.get("BasketItem") != null){
      Map<String, Object> basketMap = (Map<String, Object>) map.get("BasketItem");
      basketItem = new BasketItem();
      basketItem.setId((Integer) basketMap.get("id"));
      basketItem.setQuantity((Integer) basketMap.get("quantity"));
      basketItem.setProductId((Integer) basketMap.get("ProductId"));
    }
  }

  // Getters & Setters
  public BasketItem getBasketItem(){
    return basketItem;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Double getPrice() {
    return price;
  }
  public void setPrice(Double price) {
    this.price = price;
  }
  public Double getDeluxePrice() {
    return deluxePrice;
  }
  public void setDeluxePrice(Double deluxePrice) {
    this.deluxePrice = deluxePrice;
  }
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }
  public String getDeletedAt() {
    return deletedAt;
  }
  public void setDeletedAt(String deletedAt) {
    this.deletedAt = deletedAt;
  }
  public Integer getBonus() {
    return bonus;
  }
  public void setBonus(Integer bonus) {
    this.bonus = bonus;
  }
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }
  public Double getTotal() {
    return total;
  }
  public void setTotal(Double total) {
    this.total = total;
  }
}
