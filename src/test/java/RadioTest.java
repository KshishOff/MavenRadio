import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.Radio;

public class RadioTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSwitchingStationUp.csv")
    public void testSwitchingStationUp(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.next();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSwitchingStationDown.csv")
    public void testSwitchingStationDown(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.prev();

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSwitchStation.csv")
    public void testSwitchStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSwitchingVolumeUp.csv")
    public void testSwitchingVolumeUp(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.louder();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testSwitchingVolumeDown.csv")
    public void testSwitchingVolumeDown(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.quieter();

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testVolume.csv")
    public void testVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
