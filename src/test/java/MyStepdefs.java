
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @Given("Konto z saldem 200 zł")
    public void konto_z_saldem_zł() {
        System.out.println("Metoda given");
    }

    @When("Użytkownik próbuje wypłacić 300 zł")
    public void użytkownik_próbuje_wypłacić_zł() {
        System.out.println("Metoda when");
    }

    @Then("Stan konta nie zmienia się")
    public void stan_konta_nie_zmienia_się() {
        System.out.println("Metoday then");
    }
}
