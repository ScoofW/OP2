package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Radio;


class RadioTest {Radio radio = new Radio();

    @Test

    public void changeRadioStationCount() {
        Radio radio = new Radio(20);
        radio.nextRadioStationNumber();

        int excepted = 20;
        int actual = radio.getRadioCount();

        Assertions.assertEquals(excepted, actual);

    }

    @Test
    public void changeRadioStationNumberLessZero() {
        Radio radio = new Radio(-1);

        int excepted = 10;
        int actual = radio.getRadioCount();
    }

    @Test
    public void changeRadioStationNumberEqualZero() {
        Radio radio = new Radio(0);

        int excepted = 10;
        int actual = radio.getRadioCount();
    }


    @Test
    public void getCurrentRadioStationNumber() {

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }


    @Test

    public void nextRadioStationNumber() {

        radio.nextRadioStationNumber();

        int excepted = 1;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    @Test

    public void nextRadioStationNumberBetweenBorders() {

        radio.setRadioStationNumber(5);
        radio.nextRadioStationNumber();

        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void nextRadioStationNumberAboveUpperLimit() {

        radio.setRadioStationNumber(9);
        radio.nextRadioStationNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setRadioStationNumberAboveUpperLimit() {

        radio.setRadioStationNumber(5);
        radio.setRadioStationNumber(10);

        int excepted = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }


    @Test
    public void prevRadioStationStart() {

        radio.prevRadioStationNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBetween() {

        radio.setRadioStationNumber(6);
        radio.prevRadioStationNumber();

        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentRadioStation() {

        radio.setRadioStationNumber(9);

        int excepted = 9;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void getMaxRadioStationNumber() {

        radio.getMaxRadioStationNumber();

        int excepted = 9;
        int actual = radio.getMaxRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void setCurrentRadioStationNumberLessLowerLimit() {

        radio.setRadioStationNumber(-1);

        int excepted = 0;
        int actual = radio.getCurrentRadioStationNumber();

        Assertions.assertEquals(excepted, actual);
    }


    @Test
    public void increaseVolume() {

        radio.increaseVolume();

        int excepted = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void decreaseVolume() {

        radio.decreaseVolume();

        int excepted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void increaseVolumeAboveUpperLimit() {

        radio.setVolume(100);
        radio.increaseVolume();

        int excepted = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void increaseVolumeLessLowerLimit() {

        radio.decreaseVolume();

        int excepted = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void decreaseVolumeBetweenBorders() {

        radio.setVolume(50);
        radio.decreaseVolume();

        int excepted = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(excepted, actual);
    }

    @Test
    public void setVolumeLessLowerBorder() {

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMoreUpperLimit() {

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}