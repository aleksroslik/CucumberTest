Feature: Wyplata pieniedzy z konta

  Scenario: Próba wypłacenia większej ilości niż saldo konta
    Given Konto z saldem 200 zł
    When Użytkownik próbuje wypłacić 300 zł
    Then Stan konta nie zmienia się
