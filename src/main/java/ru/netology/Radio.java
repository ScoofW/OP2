package ru.netology;

public class Radio {
    private int numberStation;
    private int volume;

    public int getNumberStation() {
        return numberStation;
    }

    public void setNumberStation(int numberStation) {
        if (numberStation > 9) {
            numberStation = 9;
        }
        if (numberStation < 0) {
            numberStation = 0;
        }
        this.numberStation = numberStation;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > 10) {
            volume = 10;
        }
        if (volume < 0) {
            volume = 0;
        }
        this.volume = volume;
    }

    public void upNumberStation() {
        if (numberStation == 9) {
            numberStation = 0;
            return;
        }
        numberStation = numberStation + 1;
    }

    public void downNumberStation() {
        if (numberStation == 0) {
            numberStation = 9;
            return;
        }
        numberStation = numberStation - 1;
    }

    public void upVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void downVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}
