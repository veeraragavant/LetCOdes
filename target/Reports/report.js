$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefile.feature");
formatter.feature({
  "line": 3,
  "name": "Practicing in Let Code",
  "description": "",
  "id": "practicing-in-let-code",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "User is Launching the Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User is Opening the URL",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_is_Launching_the_Browser()"
});
formatter.result({
  "duration": 23445744400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_is_Opening_the_URL()"
});
formatter.result({
  "duration": 47381236900,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Handling Multiple Windows",
  "description": "",
  "id": "practicing-in-let-code;handling-multiple-windows",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 46,
      "name": "@TC-104"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "User is Opening Another Window and Performing Actions there",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_is_Opening_Another_Window_and_Performing_Actions_there()"
});
formatter.result({
  "duration": 12348080600,
  "status": "passed"
});
formatter.after({
  "duration": 515379800,
  "status": "passed"
});
});