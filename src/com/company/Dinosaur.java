package com.company;

import java.util.Scanner;

    public class Dinosaur extends Pet {
        public Dinosaur(String ownerName, String petName, String homeAddress, int age, char gender, boolean likesMeat, boolean canFly, String raceType, Scanner input) {
            super(ownerName, petName, homeAddress, age, gender);
            this.likesMeat = likesMeat;
            this.canFly = canFly;
            this.raceType = raceType;
            this.input = input;
        }



        private boolean likesMeat;
        private boolean canFly;
        private String raceType;
        private Scanner input = new Scanner(System.in);

        public boolean isLikesMeat() {
            return likesMeat;
        }

        public void setLikesMeat(boolean likesMeat) {
            this.likesMeat = likesMeat;
        }

        public boolean isCanFly() {
            return canFly;
        }

        public void setCanFly(boolean canFly) {
            this.canFly = canFly;
        }

        public String getRaceType() {
            return raceType;
        }

        public void setRaceType(String raceType) {
            this.raceType = raceType;
        }
    }
