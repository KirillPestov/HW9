package ru.netology.radio;
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    public Radio() {
        maxStation = 9;
    }
    public Radio(int stationCount) {
        maxStation = stationCount -1;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = 0;
        }
        if (currentStation < 0) {
            currentStation = maxStation;
        }
        this.currentStation = currentStation;
    }
    public void nextCurrentStation() {
        int station = currentStation + 1;
        setCurrentStation(station);
    }
    public void prevCurrentStation() {
        int station = currentStation - 1;
        setCurrentStation(station);
    }
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
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
