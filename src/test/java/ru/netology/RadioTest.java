package ru.netology;

import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void  shouldUpVolume (){
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.upVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void  shouldUpVolumeAboveRange (){
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.upVolume();
        assertEquals(10, radio.getVolume());
    }

    @Test
    public void  shouldUpVolumeBelowRange (){
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.upVolume();
        assertEquals(1, radio.getVolume());
    }

    @Test
    public void  shouldDownVolumeAboveRange (){
        Radio radio = new Radio();
        radio.setVolume(11);
        radio.downVolume();
        assertEquals(9, radio.getVolume());

    }

    @Test
    public void  shouldDownVolumeBelowRange (){
        Radio radio = new Radio();
        radio.setVolume(-1);
        radio.downVolume();
        assertEquals(0, radio.getVolume());

    }

    @Test
    public void  shouldDownVolume (){
        Radio radio = new Radio();
        radio.setVolume(8);
        radio.downVolume();
        assertEquals(7, radio.getVolume());

    }

    @Test
    public void shouldSetNumberStation(){
        Radio radio = new Radio();
        radio.setNumberStation(3);
        assertEquals(3, radio.getNumberStation());

    }

    @Test
    public void shouldSetNumberStationAboveRange(){
        Radio radio = new Radio();
        radio.setNumberStation(10);
        assertEquals(9, radio.getNumberStation());

    }

    @Test
    public void shouldSetNumberStationBelowRange(){
        Radio radio = new Radio();
        radio.setNumberStation(-1);
        assertEquals(0, radio.getNumberStation());

    }

    @Test
    public void  shouldUpNumberStation (){
        Radio radio = new Radio();
        radio.setNumberStation(5);
        radio.upNumberStation();
        assertEquals(6, radio.getNumberStation());

    }

    @Test
    public void  shouldUpNumberStationIfMax (){
        Radio radio = new Radio();
        radio.setNumberStation(9);
        radio.upNumberStation();
        assertEquals(0, radio.getNumberStation());

    }

    @Test
    public void  shouldDownNumberStation (){
        Radio radio = new Radio();
        radio.setNumberStation(5);
        radio.downNumberStation();
        assertEquals(4, radio.getNumberStation());

    }

    @Test
    public void  shouldDownNumberStationIfMin(){
        Radio radio = new Radio();
        radio.setNumberStation(0);
        radio.downNumberStation();
        assertEquals(9, radio.getNumberStation());

    }



}