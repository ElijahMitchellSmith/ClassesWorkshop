package com.company;

import java.util.Scanner;

public class Dog {
    private boolean likesWalkes;
    private boolean canFetch;
    private String coatType;
    private Scanner input = new Scanner(System.in);

    public Dog() {
        System.out.println("What is your dog's name?");
        setPetName(input.nextLine());
        System.out.println("Does " +  getPetName() +  " like to take walks? True or False?");
        setLikesWalkes(input.nextBoolean());
    }

    public boolean isLikesWalkes() {
        return likesWalkes;
    }

    public void setLikesWalkes(boolean likesWalkes) {
        this.likesWalkes = likesWalkes;
    }

    public boolean isCanFetch() {
        return canFetch;
    }

    public void setCanFetch(boolean canFetch) {
        this.canFetch = canFetch;
    }

    public String getCoatType() {
        return coatType;
    }

    public void setCoatType(String coatType) {
        this.coatType = coatType;
    }
}

}
