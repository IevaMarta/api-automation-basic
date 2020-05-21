package responses;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BasketItem {
    private Integer id;
    private Integer quantity;
    private String createdAt;
    private String updatedAt;
    @JsonProperty("BasketId")
    private Integer basketId;
    @JsonProperty("ProductId")
    private Integer ProductId;

  public BasketItem() {
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getQuantity() {
    return this.quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedAt() {
    return this.updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Integer getBasketId() {
    return this.basketId;
  }

  public void setBasketId(Integer basketId) {
    this.basketId = basketId;
  }

  public Integer getProductId() {
    return this.ProductId;
  }

  public void setProductId(Integer ProductId) {
    this.ProductId = ProductId;
  }
}