package com.dash.a1511n.model.bean;

/**
 * Created by WMR on 2018/1/31.
 */
public class CountPriceBean {
    private String priceString;
    private int count;

    public CountPriceBean(String priceString, int count) {
        this.priceString = priceString;
        this.count = count;
    }

    public String getPriceString() {
        return priceString;
    }

    public void setPriceString(String priceString) {
        this.priceString = priceString;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
