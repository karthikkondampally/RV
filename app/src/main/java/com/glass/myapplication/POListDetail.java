package com.glass.myapplication;

public class POListDetail {
    private String Line_no,Receipt,Item_num,Quantity,SubInv,ScanItem;

    public POListDetail(String Line_no,String Receipt,String Item_num,String Quantity, String SubInv, String ScanItem) {

        this.Line_no=Line_no;
        this.Receipt=Receipt;
        this.Item_num=Item_num;
        this.Quantity=Quantity;
        this.SubInv=SubInv;
        this.ScanItem=ScanItem;
    }


    public String getLine_no() {
        return Line_no;
    }
    public void setLine_no(String Line_no) {
        this.Line_no = Line_no;
    }

    public String getReceipt() {
        return Receipt;
    }
    public void setReceipt(String Receipt) {
        this.Receipt = Receipt;
    }
    public String getItem_num() {
        return Item_num;
    }
    public void setItem_num(String Item_num) {
        this.Item_num = Item_num;
    }
    public String getQuantity() {
        return Quantity;
    }
    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }
    public String getSubInv() {
        return SubInv;
    }
    public void setSubInv(String SubInv) {
        this.SubInv = SubInv;
    }

    public String getScanItem() {
        return ScanItem;
    }

    public void setScanItem(String scanItem) {
        ScanItem = scanItem;
    }
}
