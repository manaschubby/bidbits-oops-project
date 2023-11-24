package com.waleed.oopsproject.Products;

import com.waleed.oopsproject.Bids.BidModel;

import com.waleed.oopsproject.Users.UserModel;
import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class ProductModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", insertable = false, updatable = false)
    private Long id;
    @Column(name = "product_name")
    private String productName;

    @Column(name= "image")
    private String image;

    @Column(name= "details")
    private String details;

    @Column(name= "category")
    private String category;

    @ManyToOne(targetEntity = UserModel.class)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserModel user;

    @Column(name="starting_bid")
    private int startingBid;

    public void setStartingBid(int startingBid) {
        this.startingBid = startingBid;
    }

    public int getStartingBid() {
        return startingBid;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public UserModel getUser() {
        return user;
    }

    public Long getUserId() {
        return user.getUserId();
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getDetails() {
        return details;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public Long getProductId() {
        return id;
    }


}