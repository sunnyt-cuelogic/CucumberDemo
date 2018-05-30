$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn_Test.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Gmail",
  "description": "I want to test the login to Gmail",
  "id": "login-to-gmail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Gmail Login",
  "description": "",
  "id": "login-to-gmail;gmail-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I go to gmail page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to login url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I enter username and password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should not be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "loginTest.i_go_to_Home_Page()"
});
formatter.result({
  "duration": 5101666552,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.login_url()"
});
formatter.result({
  "duration": 3698824861,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.enter_user_password()"
});
formatter.result({
  "duration": 1635327160,
  "status": "passed"
});
formatter.match({
  "location": "loginTest.invalid_login()"
});
formatter.result({
  "duration": 424950582,
  "status": "passed"
});
});