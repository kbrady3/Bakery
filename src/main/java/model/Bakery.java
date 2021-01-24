package model;

public class Bakery {
    private String typeOfFood; //donut, cake, cookie
    private String batchSize; //small, medium, large
    private double price;

    public Bakery(){}

    public Bakery(String typeOfFood, String batchSize, double price) {
        this.typeOfFood = typeOfFood;
        this.batchSize = batchSize;
        this.price = price;
    }

    public String displayItem(){
        return typeOfFood + ", " + batchSize + ", " + price;
    }

    public String mix(){
        if(typeOfFood != null && batchSize != null){
            return "Ingredients mixed. Ready to bake.";
        }
        else{
            return null;
        }
    }

    public String bake() {
        if(typeOfFood != null){
            return "Cooked thoroughly.";
        }
        else {
            return null;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public String getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(String batchSize) {
        this.batchSize = batchSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
