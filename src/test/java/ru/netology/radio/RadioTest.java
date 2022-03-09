package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    @Test
    void ShouldMaxStation() {
        Radio rad = new Radio();
        //проверяем, что при выборе станции больше максимальной, значение не меняется
        rad.setCurrentStation(23);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldMinStation() {
        Radio rad = new Radio();
        //проверяем, что при выборе станции меньше минимальной, значение не меняется
        rad.setCurrentStation(-3);
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldLimitStation() {
        Radio rad = new Radio();
        //проверяем, что при выборе станции в пределах допустимой, значение  меняется
        rad.setCurrentStation(9);
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldNextStation() {
        Radio rad = new Radio();
        //проверяем переключение на следующую станцию
        rad.setCurrentStation(8);
        rad.nextCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPrevStation() {
        Radio rad = new Radio();
        //проверяем переключение на предыдущую станцию
        rad.setCurrentStation(8);
        rad.prevCurrentStation();
        int expected = 7;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldNextStationMaxLimit() {
        Radio rad = new Radio();
        //проверяем переключение на следующую станцию после максимальной
        rad.setCurrentStation(9);
        rad.nextCurrentStation();
        int expected = 0;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);



    }

    @Test
    void ShouldPrevStationMinLimit() {
        Radio rad = new Radio();
        //проверяем переключение на предыдущую станцию после минимальной
        rad.setCurrentStation(0);
        rad.prevCurrentStation();
        int expected = 9;
        int actual = rad.getCurrentStation();
        assertEquals(expected, actual);
    }
    @Test
    void ShouldMaxVolume() {
        Radio rad = new Radio();
        //проверяем, что при выборе громкости больше максимальной, значение не меняется
        rad.setCurrentVolume(23);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldMinVolume() {
        Radio rad = new Radio();
        //проверяем, что при выборе громкости меньше минимальной, значение не меняется
        rad.setCurrentVolume(-3);
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldLimitVolume() {
        Radio rad = new Radio();
        //проверяем, что при выборе громкости в пределах допустимой, значение  меняется
        rad.setCurrentVolume(9);
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldNextVolume() {
        Radio rad = new Radio();
        //проверяем переключение на следующую громкость
        rad.setCurrentVolume(8);
        rad.nextCurrentVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPrevVolume() {
        Radio rad = new Radio();
        //проверяем переключение на предыдущую громкость
        rad.setCurrentVolume(8);
        rad.prevCurrentVolume();
        int expected = 7;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldNextVolumeMaxLimit() {
        Radio rad = new Radio();
        //проверяем переключение на следующую громкость после максимальной
        rad.setCurrentVolume(10);
        rad.nextCurrentVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void ShouldPrevVolumeMinLimit() {
        Radio rad = new Radio();
        //проверяем переключение на предыдущую станцию после минимальной
        rad.setCurrentVolume(0);
        rad.prevCurrentVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
