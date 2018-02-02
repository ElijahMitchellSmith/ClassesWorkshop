package com.company;

import java.util.Scanner;

public class Dog extends Pet {
    private boolean likesWalkes;
    private boolean canFetch;
    private String coatType;
    private String petName;
    private Scanner input = new Scanner(System.in);
    private int dogAge;
    private int humanAge;

    public Dog(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesWalkes, boolean canFetch, String coatType, String petName1, Scanner input) {
        super(ownerName, petName, homeAddress, age, gender);
        System.out.println("What is your dog's name?");
        setPetName(input.nextLine());
        System.out.println("Does " +  getPetName() +  " like to take walks? True or False?");
        setLikesWalkes(input.nextBoolean());
        System.out.println("How old is " + getPetName() + "?");
        humanAge = input.nextInt();
        dogAge = humanAge * 7;
        System.out.println(getPetName() + "is" + humanAge + "in human years and " + dogAge + "in dog years" );

//        this.likesWalkes = likesWalkes;
//        this.canFetch = canFetch;
//        this.coatType = coatType;
//        this.petName = petName1;
//        this.input = input;
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

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    @Override
    protected String makesSound() {
        return super.makesSound() +  " But ... Dogs go woof!";
    }
}

