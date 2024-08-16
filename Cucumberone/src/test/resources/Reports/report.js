$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/cucumber.feature");
formatter.feature({
  "name": "Validation of login page in  facebook web application.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "TC01_Validating login page using invalid login credentials.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch the facebook web application.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_facebook_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid username and password.",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_invalid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether error message is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_whether_error_message_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether error message with password wrong is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_whether_error_message_with_password_wrong_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "TC02_Validating login page using invalid login credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch the facebook web application.",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter invalid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\".",
  "keyword": "When "
});
formatter.step({
  "name": "user click the login button.",
  "keyword": "And "
});
formatter.step({
  "name": "verify whether error message is displayed.",
  "keyword": "Then "
});
formatter.step({
  "name": "verify whether error message with password wrong is displayed.",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "jeffe@213",
        "hello22"
      ]
    },
    {
      "cells": [
        "sher@123",
        "heooi"
      ]
    }
  ]
});
formatter.scenario({
  "name": "TC02_Validating login page using invalid login credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch the facebook web application.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_facebook_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid \"jeffe@213\" and \"hello22\".",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether error message is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_whether_error_message_is_displayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//h2[text()\u003d\u0027Use your Google account\u0027])[2]\"}\n  (Session info: chrome\u003d126.0.6478.127)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.13.0\u0027, revision: \u0027ba948ece5b*\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.10\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [849c13e066e4ee01da6bbbffb5291560, findElement {using\u003dxpath, value\u003d(//h2[text()\u003d\u0027Use your Google account\u0027])[2]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 126.0.6478.127, chrome: {chromedriverVersion: 126.0.6478.126 (d36ace6122e..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:61650}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:61650/devtoo..., se:cdpVersion: 126.0.6478.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 849c13e066e4ee01da6bbbffb5291560\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat org.stepdef.StepDefinition.verify_whether_error_message_is_displayed(StepDefinition.java:38)\r\n\tat ✽.verify whether error message is displayed.(file:src/test/resources/Features/cucumber.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify whether error message with password wrong is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_whether_error_message_with_password_wrong_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "TC02_Validating login page using invalid login credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user launch the facebook web application.",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_launch_the_facebook_web_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter invalid \"sher@123\" and \"heooi\".",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_invalid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the login button.",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify whether error message is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_whether_error_message_is_displayed()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"(//h2[text()\u003d\u0027Use your Google account\u0027])[2]\"}\n  (Session info: chrome\u003d126.0.6478.127)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.13.0\u0027, revision: \u0027ba948ece5b*\u0027\nSystem info: os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.10\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [2a0a75dd46529f49648638dbfc7b9d05, findElement {using\u003dxpath, value\u003d(//h2[text()\u003d\u0027Use your Google account\u0027])[2]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 126.0.6478.127, chrome: {chromedriverVersion: 126.0.6478.126 (d36ace6122e..., userDataDir: C:\\Users\\dell\\AppData\\Local...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:61672}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:61672/devtoo..., se:cdpVersion: 126.0.6478.127, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2a0a75dd46529f49648638dbfc7b9d05\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:196)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:171)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:602)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:359)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:353)\r\n\tat org.stepdef.StepDefinition.verify_whether_error_message_is_displayed(StepDefinition.java:38)\r\n\tat ✽.verify whether error message is displayed.(file:src/test/resources/Features/cucumber.feature:14)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify whether error message with password wrong is displayed.",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.verify_whether_error_message_with_password_wrong_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
});