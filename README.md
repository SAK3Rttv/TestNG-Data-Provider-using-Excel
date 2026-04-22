# Data-Driven Testing: Prime Number Checker

This project demonstrates **Data-Driven Testing (DDT)** using TestNG and Java. It reads test scenarios from an external CSV file to validate a `PrimeNumberChecker` class.

## 📊 Test Execution Reports
You can view the latest test results (including the intentional failure for Number 7) via these links:
*   **[Method 1: Emailable Report](./reports/emailable-report.html)** - A clean summary of the 10 test cases.
*   **[Method 2: Index Report](./reports/index.html)** - Detailed interactive report with execution timings.

---

## 🎯 Objectives
* Use TestNG `@DataProvider` with an `Iterator` to handle external data.
* Implement custom file-reading logic using Java `Scanner` and Regex.
* Cover at least 10 test scenarios, including edge cases (negative numbers, zero).
* Demonstrate a controlled test failure for reporting analysis.

## 📁 Project Structure
- **`src/ch4_3/PrimeNumberChecker.java`**: The core logic determining prime status.
- **`src/ch4_3/ReadCSV.java`**: Utility class that parses the CSV/Tab-delimited data.
- **`src/ch4_3/PrimeNumberCheckerTest.java`**: TestNG class that performs the assertions.
- **`src/data/PrimeNumberTest.csv`**: The data source file.
- **`reports/`**: Contains the exported HTML execution reports.

## 🚀 How to Run
1. **Clone the repository**:
   ```bash
   git clone https://github.com/SAK3Rttv/TestNG-Data-Provider-using-Excel.git
   ```
2. **Import into Eclipse**:
   - `File > Import > Maven > Existing Maven Projects`.
3. **Execute**:
   - Right-click `testng.xml` or the test class and select **Run As > TestNG Test**.

## 🛠 Technical Details
* **Robust Parsing**: The code uses `line.split(",|\\t")` to automatically handle both Comma-Separated and Tab-Separated values.
* **Relative Pathing**: Files are accessed via `src/data/...` for cross-platform compatibility.
