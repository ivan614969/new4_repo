$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/new_account.feature");
formatter.feature({
  "line": 1,
  "name": "PestRoutes Web Application: New Subscription Feature",
  "description": "As a new customer I want to make a new Subscription for Recurring service and Schedule follow-up.",
  "id": "pestroutes-web-application:-new-subscription-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "New customers should get Recurring Service and Schedule follow-up on time.",
  "id": "pestroutes-web-application:-new-subscription-feature;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "a customer logged in using \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer clicks New Customer button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user submits \"\u003cfirst_Name\u003e\" and \"\u003clast_Name\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user navigates to Subscription -\u003e New Subscription",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "customer choose Recurring Service Alternate Monthly",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "upcoming service should be Two months from now at \"\u003cRecurring_Date\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "customer choose Initial follow-up to be One month",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "upcoming service should be One month from now at \"\u003cFollowup_Date\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "pestroutes-web-application:-new-subscription-feature;;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "first_Name",
        "last_Name",
        "Recurring_Date",
        "Followup_Date"
      ],
      "line": 16,
      "id": "pestroutes-web-application:-new-subscription-feature;;;1"
    },
    {
      "cells": [
        "qatest",
        "Qatest1234",
        "Iva",
        "Chy",
        "4/27/20",
        "3/27/20"
      ],
      "line": 17,
      "id": "pestroutes-web-application:-new-subscription-feature;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 10801042500,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "New customers should get Recurring Service and Schedule follow-up on time.",
  "id": "pestroutes-web-application:-new-subscription-feature;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "a customer logged in using \"qatest\" and \"Qatest1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "customer clicks New Customer button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user submits \"Iva\" and \"Chy\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user navigates to Subscription -\u003e New Subscription",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "customer choose Recurring Service Alternate Monthly",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "upcoming service should be Two months from now at \"4/27/20\"",
  "matchedColumns": [
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "customer choose Initial follow-up to be One month",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "upcoming service should be One month from now at \"3/27/20\"",
  "matchedColumns": [
    5
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "qatest",
      "offset": 28
    },
    {
      "val": "Qatest1234",
      "offset": 41
    }
  ],
  "location": "NewAccountSteps.a_customer_logged_in_using_and(String,String)"
});
formatter.result({
  "duration": 2983380300,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.customer_clicks_New_Customer_button()"
});
formatter.result({
  "duration": 133473300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iva",
      "offset": 14
    },
    {
      "val": "Chy",
      "offset": 24
    }
  ],
  "location": "NewAccountSteps.user_submits_and(String,String)"
});
formatter.result({
  "duration": 2509044800,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.user_navigates_to_Subscription_New_Subscription()"
});
formatter.result({
  "duration": 4629198200,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.customer_choose_Recurring_Service_Alternate_Monthly()"
});
formatter.result({
  "duration": 3135240100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4/27/20",
      "offset": 51
    }
  ],
  "location": "NewAccountSteps.upcoming_service_should_be_Two_months_from_now_at(String)"
});
formatter.result({
  "duration": 2040640400,
  "status": "passed"
});
formatter.match({
  "location": "NewAccountSteps.customer_choose_Initial_follow_up_to_be_One_month()"
});
formatter.result({
  "duration": 149701800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3/27/20",
      "offset": 50
    }
  ],
  "location": "NewAccountSteps.upcoming_service_should_be_One_month_from_now_at(String)"
});
formatter.result({
  "duration": 606455500,
  "status": "passed"
});
formatter.after({
  "duration": 5127143900,
  "status": "passed"
});
});