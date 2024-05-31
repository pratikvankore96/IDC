The test project tendableWeb is designed to automate the testing of the Tendable website. It verifies the functionality of the "Request A Demo" form submission process and checks if the error message is displayed correctly when the message field is left empty.
Strategy Employed:
Setup: The test project initializes the WebDriver with ChromeDriver and maximizes the browser window.

Navigation: It navigates to different sections of the Tendable website, such as "Our Story," "Our Solutions," "Why Tendable?," and "Contact Us."

Form Submission: It fills out the "Request A Demo" form with sample data and submits it.

Error Handling: After submission, it verifies if the error message is displayed correctly when the message field is left empty.

TestNG Annotations: The test methods are annotated with TestNG annotations like @Test for defining test cases, @BeforeMethod and @AfterMethod for setup and teardown actions, and @DataProvider for providing test data.

Assertions: It utilizes TestNG assertions to validate the expected behavior of the application under test.

Test Suite: The test project includes multiple test methods (errormessage1, errormessage2, errormessage3) to cover different scenarios related to form submission and error handling.

By automating these scenarios, the test project ensures the reliability and accuracy of the Tendable website's functionality, providing confidence in its performance.
![Screenshot 2024-06-01 014830](https://github.com/pratikvankore96/IDC/assets/153707563/5ac812db-78ad-44b4-bf62-4604cca31959)
![Screenshot 2024-06-01 031645](https://github.com/pratikvankore96/IDC/assets/153707563/28ce869f-d2d9-4450-a056-6159991707d6)
