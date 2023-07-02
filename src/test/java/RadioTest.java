import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testNextRadioStation() {
        Radio station = new Radio();

        station.nextCurrentStation(9);
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadioStation() {
        Radio station = new Radio();

        station.prevCurrentStation(0);
        int expected = 9;
        int actual = station.currentStation;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectLessRadioStation(){
        Radio station = new Radio();

        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.currentStation;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectHigherRadioStation(){
        Radio station = new Radio();

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.currentStation;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectHigherVolume(){
        Radio station = new Radio();

        station.setCurrentVolume(101);
        int expected = 0;
        int actual = station.currentVolume;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectLessVolume(){
        Radio station = new Radio();

        station.setCurrentVolume(-1);
        int expected = 0;
        int actual = station.currentVolume;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume(){
        Radio station = new Radio();

        station.increaseCurrentVolume(100);
        int expected = 100;
        int actual = station.currentVolume;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume(){
        Radio station = new Radio();

        station.reduceCurrentVolume(0);
        int expected = 0;
        int actual = station.currentVolume;

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}
