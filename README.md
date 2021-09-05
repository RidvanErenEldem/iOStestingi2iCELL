# Katalon Studio Samples: iOS Mobile Tests
Katalon Studio is a free and easy-to-use automated functional and regression testing platform. It provides users the ability to implement full automated testing solutions for their application projects with minimal engineering and programming skill requirements.
______
The **ios-mobile-tests** perform UI functional automation test on an iOS application using Katalon Studio. 

## Companion products

### Katalon TestOps

[Katalon TestOps](https://analytics.katalon.com) is a web-based application that provides dynamic perspectives and an insightful look at your automation testing data. You can leverage your automation testing data by transforming and visualizing your data; analyzing test results; seamlessly integrating with such tools as Katalon Studio and Jira; maximizing the testing capacity with remote execution.

* Read our [documentation](https://docs.katalon.com/katalon-analytics/docs/overview.html).
* Ask a question on [Forum](https://forum.katalon.com/categories/katalon-analytics).
* Request a new feature on [GitHub](CONTRIBUTING.md).
* Vote for [Popular Feature Requests](https://github.com/katalon-analytics/katalon-analytics/issues?q=is%3Aopen+is%3Aissue+label%3Afeature-request+sort%3Areactions-%2B1-desc).
* File a bug in [GitHub Issues](https://github.com/katalon-analytics/katalon-analytics/issues).

### Katalon Studio
[Katalon Studio](https://www.katalon.com) is a free and complete automation testing solution for Web, Mobile, and API testing with modern methodologies (Data-Driven Testing, TDD/BDD, Page Object Model, etc.) as well as advanced integration (JIRA, qTest, Slack, CI, Katalon TestOps, etc.). Learn more about [Katalon Studio features](https://www.katalon.com/features/).

## Getting Started
These instructions will get you a copy of the project up and running on your local machine.
### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- [Xcode](https://developer.apple.com/xcode/)
- [Setup environment](https://docs.katalon.com/display/KD/Mobile+on+macOS)
- Build iOS app at **App/Your-First-iOS-App** to have .ipa file as following steps:
  + Open **App/Your-First-iOS-App/Coffee Timer/Coffee Timer.xcodeproj** file by Xcode tool
  + Select a device to launch the apps
  + Set deployment iOS version and device type
  ![Build ipa apps](https://github.com/katalon-studio-samples/ios-mobile-tests/blob/master/Tutorials/Figures/build%20.ipa%20file.png?raw=true)
  + Build the apps by clicking Product -> Build. Wait for some time until the build progress is finished
  + Export the apps by clicking Product -> Archive then follow the instruction to have "Coffee Time.ipa" file
  + Put "Coffee Time.ipa" file into **App** folder. KS will use this file to start Coffee Time application.
### Setting Up
- [Check out](https://git-scm.com/book/en/v2/Git-Basics-Getting-a-Git-Repository) the code from this repository
- [Open the project](https://docs.katalon.com//display/KD/Manage+Test+Project) from Katalon Studio
### Executing a Test Case
![Execute a simple test case](https://github.com/katalon-studio-samples/ios-mobile-tests/blob/master/Tutorials/Figures/Execute%20a%20test%20case.png?raw=true)
1. Expand the Test Cases structure, where all the test cases are stored.
2. Select the test case you want to execute
3. Choose the browser for executing the test case
At the end of this README, you will find additional ways to execute automation test cases. 

## See Also
Update configurations for integration: [Jira](https://docs.katalon.com/x/7oEw), [Katalon Analytics](https://docs.katalon.com/x/KRhO)

Katalon Documentation: http://docs.katalon.com/, especially some [Tips and Tricks](https://docs.katalon.com/x/PgXR) to run a successful automation test. 

Katalon Forum: https://forum.katalon.com/

Katalon Business Support: https://www.katalon.com/support-service-options/
