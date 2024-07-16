package org.example;

public class Woman extends Person{
    private String maidenName;

    public Woman(String firstName, String lastName, int age, String partner) {
        super(firstName, lastName, age, partner);
    }

    public void registerPartnership(String partnerLastName){
        this.maidenName = super.getLastName();
        super.setLastName(partnerLastName);
    }
    public void deregisterPartnership(boolean isSelected){
        if(isSelected){
            super.setLastName(this.maidenName);
        }
    }
    public String getMaidenName(){
        return this.maidenName;
    }
}
