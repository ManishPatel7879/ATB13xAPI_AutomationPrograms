🚀 ATB13x API Automation Framework
Author: Manish

Welcome to the ATB13x REST API Automation Framework!
This project is designed for learning, practicing, and mastering API automation testing using modern tools like Rest Assured, TestNG, Allure Reporting, and Apache POI.

This framework follows modular design principles and is built for scalability, reusability, and real-world API automation standards.

🎯 Key Features
✔ Complete REST API Testing (GET, POST, PUT, PATCH, DELETE)
✔ Data-Driven Testing using Excel (Apache POI)
✔ Test Execution using TestNG
✔ Beautiful test reports using Allure
✔ Request/Response logging
✔ Modular and clean folder structure
✔ Supports environment handling (QA, Stage, Prod)
✔ Builder pattern & POJO usage
✔ Easily extendable for any API project

📚 What You Will Learn
This framework teaches practical API automation concepts:

🔹 Rest Assured Fundamentals
     - BaseURI, BasePath setup
     - Request Specification  
     - Response handling
     - JSON/XML parsing
     - Headers, Params, Cookies

🔹 HTTP Methods Covered
     - GET – Fetching Resources
     - POST – Creating Data
     - PUT – Updating Data
     - PATCH – Partial Updates
     - DELETE – Removing Data

🔹 Advanced Topics
     - Assertions using TestNG
     - Common reusable methods
     - Logs for debugging
     - Externalized test data using Excel files
     - DTO/POJO classes
     - Builder pattern based tests 
     - Reporting with Allure

🛠️ Tech Stack
Technology	           Purpose
Java	               Coding language
Rest Assured	       API Testing library
TestNG	               Test runner
Maven	               Build & dependency management
Allure Reports	       Reporting tool
Apache POI	           Reading Excel test data
IntelliJ IDEA	       IDE
Git / GitHub	       Version control

📁 Project Structure
ATB13x-API-Automation/
│
├── src/test/java/
│   ├── base/
│   │   └── BaseTest.java        # Common setup utilities
│   │
│   ├── crud/
│   │   ├── GetTests.java
│   │   ├── PostTests.java
│   │   ├── PutTests.java
│   │   └── DeleteTests.java
│   │
│   ├── utils/
│   │   ├── ExcelUtils.java      # Apache POI helpers
│   │   ├── ConfigReader.java    # Property reader
│   │   └── PayloadManager.java  # JSON Body builders
│   │
│   └── tests/
│       └── AllTestCases.java
│
├── testng.xml                   # TestNG Suite
├── pom.xml                      # Maven Dependencies
└── README.md                    # Documentation

🚦 How to Run the Tests
1️⃣ Run using Maven
mvn clean test

2️⃣ Run using TestNG XML
Right-click → testng.xml → Run

3️⃣ Run Individual Test Files

Inside IntelliJ → click the green ▶ button next to the class/method.

📊 Generate Allure Report
Step 1: Create report
allure generate allure-results --clean

Step 2: Open report
allure open

One-command shortcut
allure serve allure-results

📘 Sample API Tests Included
✔ GET - Fetch User
✔ POST - Create User
✔ PUT - Update User
✔ PATCH - Partial Update
✔ DELETE - Remove User
Each test includes:
   - Logging
   - Assertions
   - Modular payloads
   - Test data from Excel (optional)

🧪 Data Driven Testing (Apache POI)
1. Store your test data in:
          src/test/resources/testdata/TestData.xlsx

2. Use ExcelUtils to read:
          ExcelUtils.getCellData("Sheet1", 1, 2);

📢 Dependencies (pom.xml)
Includes:
 - Rest Assured
 - TestNG
 - Allure TestNG
 - JSON libraries
 - Apache POI
 - Maven Surefire
(If needed, I can generate a complete pom.xml for you.)

🧩 Why This Framework?
✔ Beginner-friendly
✔ Follows industry standards
✔ Simple + Scalable
✔ Great for learning and interviews
✔ Can be used for real projects

🤝 Contributing
Pull requests are welcome!
Feel free to improve tests, utilities, or reporting.

📬 Author
Manish
API & Automation Enthusiast 🚀