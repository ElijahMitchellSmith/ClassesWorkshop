package com.company;

import java.util.*;
import java.util.ArrayList;

public class DBZCharacter {
    private Scanner input = new Scanner(System.in);
    private String charaName;
    private int powerLevel;
    private String raceName;
    private int finalPowerLevel;
    Set myset = new HashSet();
    List mylist = new ArrayList();


    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getCharaName() {
        return charaName;
    }

    public void setCharaName(String charaName) {
        this.charaName = charaName;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public String getRaceName() {
        return raceName;
    }

    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }

    public int getFinalPowerLevel() {
        return finalPowerLevel;
    }

    public void setFinalPowerLevel(int finalPowerLevel) {
        this.finalPowerLevel = finalPowerLevel;
    }

    public DBZCharacter() {
        System.out.println("What is your character's name?");
        setCharaName(input.nextLine());
        System.out.println("What Race is " + getCharaName() + "?");

        ArrayList list = new ArrayList();
        list.add("Human");
        list.add("Saiyan");
        list.add("Namekian");
        list.add("Frieza Race");
        list.add("Majin");
        System.out.println(list);
        setRaceName(input.nextLine());
        System.out.println("What is " + getCharaName() + "'s power level?");
        setPowerLevel(input.nextInt());
        if (powerLevel >= 10001) {
            System.out.println("That's to high for a Low-Class Warrior!");
            setPowerLevel(input.nextInt());
        }
            setFinalPowerLevel(getPowerLevel() * 1000);
           System.out.println("Welcome to the Story of " + getCharaName() + " The " +  getRaceName() + ". Their initial power level is " + getPowerLevel()  + " However, When they reach their strongest form their power pushes " + getFinalPowerLevel() + "!");





        }


    }









