$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Login.feature");
formatter.feature({
  "name": "To Validate facebook application login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Facebook"
    }
  ]
});
formatter.scenario({
  "name": "To Validate login functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User have to enter facebook using chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_using_chrome()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to receive the message as invalid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_receive_the_message_as_invalid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User have to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
formatter.scenario({
  "name": "To validate forget password functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Facebook"
    },
    {
      "name": "@Forget"
    }
  ]
});
formatter.step({
  "name": "User have to enter facebook using chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_using_chrome()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enter forget password page",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User enter invalid username",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User gets an invalid username displayed",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User have to close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});