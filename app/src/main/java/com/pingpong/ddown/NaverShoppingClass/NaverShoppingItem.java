package com.pingpong.ddown.NaverShoppingClass;

public class NaverShoppingItem {
    private String title;
    private String link;
    private String image;
    private int lprice;
    private int hprice;
    private String mallName;
    private String productId;

    public NaverShoppingItem(String title, String link, String image, int lprice, int hprice, String mallName, String productId) {
        this.title = title;
        this.link = link;
        this.image = image;
        this.lprice = lprice;
        this.hprice = hprice;
        this.mallName = mallName;
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getImage() {
        return image;
    }

    public int getLprice() {
        return lprice;
    }

    public int getHprice() {
        return hprice;
    }

    public String getMallName() {
        return mallName;
    }

    public String getProductId() {
        return productId;
    }
}
