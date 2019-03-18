$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/MyFirstFeatureFile.feature");
formatter.feature({
  "name": "Create account of Facebook",
  "description": "  As a user u need to open faceBook home page and do the validations",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.scenario({
  "name": "Validate First Name field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User need to be on the Facebook Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBook.user_need_to_be_on_the_Facebook_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters user first name",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.user_enters_user_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks user first name is present",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBook.user_checks_user_first_name_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate create user miltiple fields",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@facebook"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User need to be on FaceBOOK Logi Page",
  "keyword": "Given "
});
formatter.match({
  "location": "FaceBook.user_need_to_be_on_FaceBOOK_Logi_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters user first name",
  "keyword": "When "
});
formatter.match({
  "location": "FaceBook.user_enters_user_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username",
  "keyword": "And "
});
formatter.match({
  "location": "FaceBook.user_enters_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User checks user first anme is present",
  "keyword": "Then "
});
formatter.match({
  "location": "FaceBook.user_checks_user_first_anme_is_present()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Mobile field should be blank",
  "keyword": "But "
});
formatter.match({
  "location": "FaceBook.user_Mobile_field_should_be_blank()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});