package oop.exam_studies.ex_01;

public class Coupon {
    private int id;
    private String code;
    private double discountValue;
    private boolean isActive;

    public Coupon(int id, String code, double discountValue){
        this.id = id;
        this.code = code;
        this.discountValue = discountValue;
        this.isActive = true;
    }

    public int getId(){
        return this.id;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public double getDiscountValue(){
        return this.discountValue;
    }

    public void setDiscountValue(double discountValue){
        this.discountValue = discountValue;
    }

    public boolean getIsActive(){
        return this.isActive;
    }

    public void setIsActive(boolean isActive){
        this.isActive = isActive;
    }

    public double calculateDiscount(double orderTotal){
        double finalValue = orderTotal;

        if (this.isActive){
            finalValue = orderTotal - this.discountValue;
        }

        return finalValue;
    }
}
