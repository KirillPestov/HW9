import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.radio.Radio;

public class RadioTest {
    @Test
    public void selectRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(12);
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextCurrentStation();
        int expected = 0;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevCurrentStation();
        int expected = 9;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testIncreaseCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseCurrentVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testReduceCurrentVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.reduceCurrentVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void RadioStation() {
        Radio station = new Radio(20);
        station.setCurrentStation(19);
        int expected = 19;
        int actual = station.getCurrentStation();

        System.out.println(actual);
        Assertions.assertEquals(expected, actual);
    }
}
