package ru.netology.radio;
public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        currentStation = newCurrentStation;
    }
    public void nextCurrentStation() {
        int station = currentStation + 1;
        setCurrentStation(station);
    }
    public void prevCurrentStation() {
        int station = currentStation - 1;
        setCurrentStation(station);
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
    public void increaseCurrentVolume() {
        int volume = currentVolume + 1;
        setCurrentVolume(volume);
    }
    public void reduceCurrentVolume() {
        int volume = currentVolume - 1;
        setCurrentVolume(volume);
    }
}
