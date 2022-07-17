package ru.netology;

public class Radio {
    private int minRadioStationNumber;
    private int radioCount = 10;
    private int maxRadioStationNumber = radioCount - 1;

    private int currentRadioStationNumber;
    private int currentVolume;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    public Radio() {
    }

    public Radio(int radioCount) {
        if (radioCount <= minRadioStationNumber) {
            System.out.println("Нет возможности установить количество радиостанций меньше 1, количество останется без изменений, равным: " + getRadioCount());
            return;
        }
        this.radioCount = radioCount;
        this.maxRadioStationNumber = radioCount - 1;
    }

    public int getRadioCount() {
        return radioCount;
    }

    public int getMaxRadioStationNumber() {
        return maxRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return this.currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber < maxRadioStationNumber) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = minRadioStationNumber;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber > minRadioStationNumber) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = maxRadioStationNumber;
        }

    }

    public void setRadioStationNumber(int radioStationNumber) {
        if (radioStationNumber >= minRadioStationNumber && radioStationNumber <= maxRadioStationNumber) {
            this.currentRadioStationNumber = radioStationNumber;
        }
    }

    int getCurrentVolume() {

        return this.currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= minVolume && currentVolume <= maxVolume) {
            this.currentVolume = currentVolume;
        }
    }
}
