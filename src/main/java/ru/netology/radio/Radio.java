package ru.netology.radio;

public class Radio {
    private int currentStation; //номер текущей станции
    private int currentVolume; //номер текущей громкости

    public Radio() {
    }

    //получаем номер станции
    public int getCurrentStation() {
        return currentStation;
    }

    //получаем номер громкости
    public int getCurrentVolume() {
        return currentVolume;
    }

    //задаем номер станции
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    //задаем номер громкости
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 10) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    //следующий номер станции
    public void nextCurrentStation() {
        if (currentStation >= 9) {
            currentStation = 0;
            return;
        }
        currentStation++;
    }

    //предыдущий номер станции
    public void prevCurrentStation() {
        if (currentStation <= 0) {
            currentStation = 9;
            return;
        }
        currentStation--;
    }

    //увеличиваем  громкость
    public void nextCurrentVolume() {
        if (currentVolume >= 10) {
            return;
        }
        currentVolume++;
    }

    //уменьшаем громкость
    public void prevCurrentVolume() {
        if (currentVolume <= 0) {
            return;
        }
        currentVolume--;
    }


}
