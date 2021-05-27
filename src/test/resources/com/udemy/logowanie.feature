Feature: Logowanie do aplikacji
  W tym pliku będziemy testować logowanie użytkownika do aplikacji.
  Sekcja ta jest traktowana jako opis i nie wpływa na wykonanie
  testów.

  Background:
    Given Użytkownik jest na stronie logowania

  Scenario Outline: Użytkownik podaje poprawne dane

    And Uzytkownik o nazwie "<login>login1" i hasle "<haslo>haslo" istnieje w bazie danych
    When Użytkownik wprowadza nazwe uzytkownika "<login>login1" i haslo "<haslo>haslo"
    And Uzytkownik klika przycisk zaloguj
    Then Uzytkownik zostaje zalogowany i przeniesiony do strony domowej
    And Informacja o udanym logowaniu zostaje wyswietlona

    Examples:
    |login|haslo|
    |login1|haslo1|
    |login2|haslo2|

  Scenario: Użytkownik podaje niepoprawne hasło

    And Uzytkownik o nazwie "<login>login2" i hasle "<haslo>haslo" istnieje w bazie danych
    When Użytkownik wprowadza nazwe uzytkownika "<login>login2" i haslo "<haslo>zlehaslo"
    And Uzytkownik klika przycisk zaloguj
    But Dane logowania sa niepoprawne
    Then Uzytkownik nie zostaje przekierowany na strone domowa aplikcaji
    And Informacja o nieudanej probie zalogowania

