package com.sunyard.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

/**
 * Created by Weiyuan on 2016/1/21.
 */
@Entity
@Table(name = "StockMarket_storages")
public class Storage {
    @Id
    int id;

    @Column
    String playername;

    @Column
    String itemName;

    @Column
    int itemNumber;

    @Column
    String paidFrom;

    @Column
    String shopType;

    @Column
    Calendar buyDate;

    @Column
    Calendar sellDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getPaidFrom() {
        return paidFrom;
    }

    public void setPaidFrom(String paidFrom) {
        this.paidFrom = paidFrom;
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public Calendar getBuyDate() {
        return buyDate;
    }

    public void setBuyDate(Calendar buyDate) {
        this.buyDate = buyDate;
    }

    public Calendar getSellDate() {
        return sellDate;
    }

    public void setSellDate(Calendar sellDate) {
        this.sellDate = sellDate;
    }
}
