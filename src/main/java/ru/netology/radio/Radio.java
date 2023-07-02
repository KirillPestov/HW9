package ru.netology.radio;
public class Radio {
    public int currentStation;
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= 0){
            newCurrentStation = newCurrentStation + 1;
        }else newCurrentStation = 9;
        if (newCurrentStation > 9){
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void prevCurrentStation(int newCurrentStation) {
        if (newCurrentStation <= 9){
            newCurrentStation = newCurrentStation - 1;
        }else newCurrentStation = 0;
        if (newCurrentStation < 0){
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume >= 0){
            newCurrentVolume = newCurrentVolume + 1;
        }else newCurrentVolume = 0;
        if (newCurrentVolume > 100){
            newCurrentVolume = 100;
        }
        currentVolume = newCurrentVolume;
    }

    public void reduceCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 100){
            newCurrentVolume = newCurrentVolume - 1;
        }else newCurrentVolume = 100;
        if (newCurrentVolume < 0){
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }
}
