$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("E:/JBKWEBSiteTesting/AdmiLteBDDFramework/src/main/java/feature/adminLte.feature");
formatter.feature({
  "line": 1,
  "name": "AdmitLTE login Feature",
  "description": "",
  "id": "admitlte-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7411895930,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "AdmitLTE login Scenario",
  "description": "",
  "id": "admitlte-login-feature;admitlte-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens the browser and enters the AdminLtE url in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page opens",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enter username and password and clicks on login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user login should successful and user enter on dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verify dashboard user name",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify Dashborad User Status",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminStepDefinition.user_opens_the_browser_and_enters_the_AdminLtE_url_in_browser()"
});
formatter.result({
  "duration": 6737689724,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.login_page_opens()"
});
formatter.result({
  "duration": 173113122,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.user_enter_username_and_password_and_clicks_on_login_button()"
});
formatter.result({
  "duration": 1902961384,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.user_login_should_successful_and_user_enter_on_dashboard_page()"
});
formatter.result({
  "duration": 17459058,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.verify_dashboard_user_name()"
});
formatter.result({
  "duration": 179059907,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepDefinition.verify_Dashborad_User_Status()"
});
formatter.result({
  "duration": 143532128,
  "status": "passed"
});
formatter.after({
  "duration": 787777068,
  "status": "passed"
});
});