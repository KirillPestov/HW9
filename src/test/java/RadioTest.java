import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {

    @Test
    public void testNextRadioStation() {
        Radio station = new Radio();

        station.nextCurrentStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNextRadioStation1() {
        Radio station = new Radio();

        station.nextCurrentStation(11);
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStation2() {
        Radio station = new Radio();

        station.nextCurrentStation(0);
        int expected = 1;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testPrevRadioStation() {
        Radio station = new Radio();

        station.prevCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStation1() {
        Radio station = new Radio();

        station.prevCurrentStation(0);
        int expected = 9;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStation2() {
        Radio station = new Radio();

        station.prevCurrentStation(-1);
        int expected = 9;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectLessRadioStation(){
        Radio station = new Radio();

        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectHigherRadioStation(){
        Radio station = new Radio();

        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);
        int expected = 5;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void selectHigherVolume () {
        Radio volume = new Radio();

        volume.setCurrentVolume(101);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectLessVolume () {
        Radio volume = new Radio();

        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void selectVolume () {
        Radio volume = new Radio();

        volume.setCurrentVolume(50);
        int expected = 50;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume () {
        Radio volume = new Radio();

        volume.increaseCurrentVolume(101);
        int expected = 100;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume1 () {
        Radio volume = new Radio();

        volume.increaseCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume2 () {
        Radio volume = new Radio();

        volume.increaseCurrentVolume(50);
        int expected = 51;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume () {
        Radio volume = new Radio();

        volume.reduceCurrentVolume(50);
        int expected = 49;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume1 () {
        Radio volume = new Radio();

        volume.reduceCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void reduceVolume2 () {
        Radio volume = new Radio();

        volume.reduceCurrentVolume(101);
        int expected = 100;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}
