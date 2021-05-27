package com.udemy;

import com.udemy.Logowanie;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class LogowanieSteps {

    private Logowanie logowanie;
    private String username;
    private String password;

    @Given("^Użytkownik jest na stronie logowania$")
    public void uzytkownikJestNaStronieLogowania() {
    logowanie = new Logowanie(); //utworzony obiekt klasy
    }

    @And("^Uzytkownik klika przycisk zaloguj$")
    public void uzytkownikKlikaPrzyciskZaloguj() {
        System.out.println("Klikamy na przycisk logowania");
    }

    @Then("^Uzytkownik zostaje zalogowany i przeniesiony do strony domowej$")
    public void uzytkownikZostajeZalogowanyIPrzeniesionyDoStronyDomowej() {
    Assert.assertTrue(logowanie.isLoggedin());
    }

    @And("^Informacja o udanym logowaniu zostaje wyswietlona$")
    public void informacjaOUdanymLogowaniuZostajeWyswietlona() {
        Assert.assertEquals("Udało Ci się zalogować", logowanie.getMsg());
    }

    @But("^Dane logowania sa niepoprawne$")
    public void daneLogowaniaSaNiepoprawne() {
        String databaseUsername = logowanie.getCurrentUsername();
        String databasePassword = logowanie.getCurrentPassword();
        Assert.assertFalse(username.equals(databaseUsername) && password.equals(databasePassword));
    }

    @Then("^Uzytkownik nie zostaje przekierowany na strone domowa aplikcaji$")
    public void uzytkownikNieZostajePrzekierowanyNaStroneDomowaAplikcaji() {
        Assert.assertFalse(logowanie.isLoggedin());

    }

    @And("^Informacja o nieudanej probie zalogowania$")
    public void informacjaONieudanejProbieZalogowania() {
        Assert.assertEquals("Nie udało ci się zalogować", logowanie.getMsg());
    }

    @When("^Użytkownik wprowadza nazwe uzytkownika \"([^\"]*)\" i haslo \"([^\"]*)\"$")
    public void uzytkownikWprowadzaNazweUzytkownikaIHaslo(String login, String haslo) {
        System.out.println("Uzytkownik podaje login i haslo " + login + " " + haslo);
        this.username = login;
        this.password = haslo;
        logowanie.logIn(login,haslo);
    }

    @And("^Uzytkownik o nazwie \"([^\"]*)\" i hasle \"([^\"]*)\" istnieje w bazie danych$")
    public void uzytkownikONazwieIHasleIstniejeWBazieDanych(String login, String haslo) {
        logowanie.setUserInDatabase(login,haslo);
    }
}
