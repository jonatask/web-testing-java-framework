$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/create_account/test_cases/CreateAccount.feature");
formatter.feature({
  "name": "Create account",
  "description": "  Register a new account",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@Client"
    },
    {
      "name": "@CreateAccount"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Valid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I accessed the registration page",
  "keyword": "Given "
});
formatter.step({
  "name": "register myself as \"\u003cfirst_name\u003e\" lastname \"\u003clastname\u003e\" email \"\u003cemail\u003e\" phone number \"\u003cphone\u003e\" password \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "system should save the registration",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first_name",
        "lastname",
        "email",
        "phone",
        "password"
      ]
    },
    {
      "cells": [
        "Jonatas",
        "Kirsch",
        "test{random}@mailcatch.com",
        "1185859696",
        "159753"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid account",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@Client"
    },
    {
      "name": "@CreateAccount"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I accessed the registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountSteps.registrationPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "register myself as \"Jonatas\" lastname \"Kirsch\" email \"test{random}@mailcatch.com\" phone number \"1185859696\" password \"159753\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateAccountSteps.registerAccount(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system should save the registration",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountSteps.systemShouldSaveRegistration()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/java/login/test_cases/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  Login of user in the system",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I accessed the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "I type the email \"\u003cemail\u003e\" password \"\u003cpassword\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "system should open the My Account page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "test.registration@mailcatch.com",
        "123456"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Valid login",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Automation"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I accessed the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.oUsuarioAcessouAPaginaDeLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type the email \"test.registration@mailcatch.com\" password \"123456\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "Login.digitarOEmailEASenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "system should open the My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.systemShouldOpenMyAccount()"
});
formatter.result({
  "status": "passed"
});
});