package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Cat extends Pet {
    private boolean likesCatnip;
    private boolean usesLitterbox;
    private String furType;
    private Scanner input = new Scanner(System.in);

    public Cat(String ownerName, String petName, String homeAddress, int age, char gender) {
        super(ownerName, petName, homeAddress, age, gender);
        this.likesCatnip = likesCatnip;
        this.usesLitterbox = usesLitterbox;
        this.furType = furType;

        System.out.println("What is your cat's name?");
        setPetName(input.nextLine());
        System.out.println("Does " +  getPetName() +  " like catnip? True or False?");
        setLikesCatnip(input.nextBoolean());
        System.out.println("How old is " + getPetName() + "?");
        setAge(input.nextInt());

    }

    public boolean isLikesCatnip() {
        return likesCatnip;
    }

    public void setLikesCatnip(boolean likesCatnip) {
        this.likesCatnip = likesCatnip;
    }

    public boolean isUsesLitterbox() {
        return usesLitterbox;
    }

    public void setUsesLitterbox(boolean usesLitterbox) {
        this.usesLitterbox = usesLitterbox;
    }

    public String getFurType() {
        return furType;
    }

    public void setFurType(String furType) {
        this.furType = furType;
    }

    @Override
    protected String makesSound() {
        return "MEEEEEEEEOOOOOOOOWWWWWW!";
    }
    protected String catYears() {
        int catyears;

        switch (super.getAge()) {
            case 0:
                catyears = 0;
                break;
            case 1:
                catyears = 19;
                break;
            case 2:
                catyears = 24;
                break;
                default:
                    catyears = (super.getAge() - 2) * 4 +24;
                    break;
        }
        return super.getPetName() + " is " + super.getAge() +  " in human years and "  + catyears + " in cat years.";
    }

    }

