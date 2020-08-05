$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/fb.feature");
formatter.feature({
  "line": 1,
  "name": "verify fb login",
  "description": "",
  "id": "verify-fb-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "login to fb page2",
  "description": "",
  "id": "verify-fb-login;login-to-fb-page2",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "launch fb url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "enter \"\u003csurname\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click login",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "verify-fb-login;login-to-fb-page2;",
  "rows": [
    {
      "cells": [
        "surname",
        "password"
      ],
      "line": 13,
      "id": "verify-fb-login;login-to-fb-page2;;1"
    },
    {
      "cells": [
        "jagan",
        "hari"
      ],
      "line": 14,
      "id": "verify-fb-login;login-to-fb-page2;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "login to fb page2",
  "description": "",
  "id": "verify-fb-login;login-to-fb-page2;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@positive"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "launch fb url",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "enter \"jagan\" and \"hari\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click login",
  "keyword": "Then "
});
formatter.match({
  "location": "OpenFb.launch_fb_url()"
});
formatter.result({
  "duration": 36963653000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jagan",
      "offset": 7
    },
    {
      "val": "hari",
      "offset": 19
    }
  ],
  "location": "OpenFb.enter_and(String,String)"
});
formatter.result({
  "duration": 1520709800,
  "status": "passed"
});
formatter.match({
  "location": "OpenFb.click_login()"
});
formatter.result({
  "duration": 1151761400,
  "status": "passed"
});
});