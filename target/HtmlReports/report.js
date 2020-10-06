$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginPOM.feature");
formatter.feature({
  "name": "Test the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate that the user successfully logs in with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.LoginPOM.the_browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.LoginPOM.the_user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"kavitabansal_01@yahoo.co.in\" and \"Learncrm\" and clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginPOM.the_user_enters_email_and_password_and_clicks_on_login_button(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.LoginPOM.the_user_is_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});