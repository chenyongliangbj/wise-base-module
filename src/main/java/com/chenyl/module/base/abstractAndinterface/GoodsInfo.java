package com.chenyl.module.base.abstractAndinterface;

public class GoodsInfo {


    private String sku;

    private Long price;

    public static void staticTest(){
        System.out.println("this is a staticTest");
    }


    GoodsInfo(String sku ,Long price){
        this.sku = sku;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }


    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
