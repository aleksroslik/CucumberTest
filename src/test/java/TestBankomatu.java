import org.junit.Assert;
import org.junit.Test;

public class TestBankomatu {

    @Test
    public void testWplaty()
    {
        Bankomat atm = new Bankomat();
        atm.wplataPieniedzy(200);
        Assert.assertEquals(200, atm.pokazSaldo());
    }

    @Test
    public void testWyplaty()
    {
        Bankomat atm = new Bankomat();
        atm.wyplataPieniedzy(100);
        Assert.assertEquals(0, atm.pokazSaldo());
    }
}
