import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LeapYearShould {
    @Test
    public void not_be_divisible_by_4(){
        assertThat(Leapyear.isLeap(1997), is(false));
    }

    @Test
    void divisible_by_400() {
        assertThat(Leapyear.isLeap(1600), is(true));
    }

    @Test
    void divisible_by_4() {
        assertThat(Leapyear.isLeap(1996), is(true));
    }

    @Test
    void not_divisible_by_100_but_by_400() {
        assertThat(Leapyear.isLeap(1800), is(false));
    }
}
