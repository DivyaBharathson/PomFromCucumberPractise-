$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FacebookLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Facebook application automation script",
  "description": "",
  "id": "facebook-application-automation-script",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@fb"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Verify the user username",
  "description": "",
  "id": "facebook-application-automation-script;verify-the-user-username",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User enter the \"\u003cUserName\u003e\" in the username feild",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"\u003cPassword\u003e\" in the password feild",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "facebook-application-automation-script;verify-the-user-username;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 11,
      "id": "facebook-application-automation-script;verify-the-user-username;;1"
    },
    {
      "cells": [
        "Divya",
        "1234"
      ],
      "line": 12,
      "id": "facebook-application-automation-script;verify-the-user-username;;2"
    },
    {
      "cells": [
        "Sneha",
        "234567890"
      ],
      "line": 13,
      "id": "facebook-application-automation-script;verify-the-user-username;;3"
    },
    {
      "cells": [
        "Deepika",
        "234567"
      ],
      "line": 14,
      "id": "facebook-application-automation-script;verify-the-user-username;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 345200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_facebook_application()"
});
formatter.result({
  "duration": 7472827500,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify the user username",
  "description": "",
  "id": "facebook-application-automation-script;verify-the-user-username;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@fb"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter the \"Divya\" in the username feild",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"1234\" in the password feild",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Divya",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_username_feild(String)"
});
formatter.result({
  "duration": 529479500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_password_feild(String)"
});
formatter.result({
  "duration": 235462300,
  "status": "passed"
});
formatter.after({
  "duration": 117300,
  "status": "passed"
});
formatter.before({
  "duration": 155800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_facebook_application()"
});
formatter.result({
  "duration": 4807720200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Verify the user username",
  "description": "",
  "id": "facebook-application-automation-script;verify-the-user-username;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@fb"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter the \"Sneha\" in the username feild",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"234567890\" in the password feild",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Sneha",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_username_feild(String)"
});
formatter.result({
  "duration": 235359800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234567890",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_password_feild(String)"
});
formatter.result({
  "duration": 226709800,
  "status": "passed"
});
formatter.after({
  "duration": 125100,
  "status": "passed"
});
formatter.before({
  "duration": 138800,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User launch the application",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User launch the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_launch_the_facebook_application()"
});
formatter.result({
  "duration": 2623851500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify the user username",
  "description": "",
  "id": "facebook-application-automation-script;verify-the-user-username;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@fb"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User enter the \"Deepika\" in the username feild",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enter the \"234567\" in the password feild",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Deepika",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_username_feild(String)"
});
formatter.result({
  "duration": 423160300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "234567",
      "offset": 16
    }
  ],
  "location": "Stepdefinition.user_enter_the_in_the_password_feild(String)"
});
formatter.result({
  "duration": 234939100,
  "status": "passed"
});
formatter.after({
  "duration": 104500,
  "status": "passed"
});
});