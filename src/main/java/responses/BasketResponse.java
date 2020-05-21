package responses;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BasketResponse {
  private String status;
  private Integer id;
  private String coupon;
  private String createdAt;
  private String updateAt;
  private Integer userId;
  private ArrayList<ProductInfo> productInfos = new ArrayList();

  public BasketResponse() {
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ArrayList<ProductInfo> getProductInfos() {
    return productInfos;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCoupon() {
    return this.coupon;
  }

  public void setCoupon(String coupon) {
    this.coupon = coupon;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdateAt() {
    return this.updateAt;
  }

  public void setUpdateAt(String updateAt) {
    this.updateAt = updateAt;
  }

  public Integer getUserId() {
    return this.userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }
  public void setProductInfos(ArrayList<ProductInfo> productInfos) {
    this.productInfos = productInfos;
  }

  // Methods
  @JsonProperty("data")
  private void unpackData(Map<String, Object> data) {
    id = (Integer) data.get("id");
    coupon = (String) data.get("coupon");
    createdAt = (String) data.get("createdAt");
    updateAt = (String) data.get("updateAt");
    userId = (Integer) data.get("UserId");

    for (Map<String,Object> map : (List<Map<String, Object>>) data.get("Products")) {
      productInfos.add(new ProductInfo(map));
    }
  }
}
