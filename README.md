# Java Lambdas – Level 1

## 📄 Description – Exercise Statement

This project contains eight Java exercises focused on the use of **Lambda expressions**, **Streams**, and **Functional Interfaces**.

Each exercise is organized in its own package and demonstrates a specific aspect of Java functional programming.

### Exercise 1: Filter Strings Containing 'o'
Implements a method that filters a list of strings, returning those that contain the letter `'o'` (case-insensitive).

### Exercise 2: Filter Strings Containing 'o' and Longer Than 5 Characters
Same list as Exercise 1, but filters only strings that contain `'o'` and have more than 5 characters.

### Exercise 3: Print Month Names Using Lambda
Prints the names of the months using a lambda expression with `forEach`.

### Exercise 4: Print Month Names Using Method Reference
Same as Exercise 3, but uses a method reference (`System.out::println`).

### Exercise 5: Functional Interface Returning Pi Value
Defines a `@FunctionalInterface` with a method `getPiValue()` and implements it with a lambda that returns `3.1415`.

### Exercise 6: Sort Filtered Strings by Length (Shortest to Longest)
Creates a `List<Object>` with mixed elements (numbers and strings). Filters only strings and sorts them by length in ascending order.

### Exercise 7: Sort Filtered Strings by Length (Longest to Shortest)
Same list and logic as Exercise 6, but the filtered strings are sorted from longest to shortest.

### Exercise 8: Functional Interface That Reverses a String
Defines a functional interface with a method `reverse(String)` and implements it using a lambda that returns the reversed input.

---

## 💻 Technologies Used

- Java 21
- Maven
- Stream API
- Lambda Expressions
- Functional Interfaces
- IntelliJ IDEA (recommended IDE)

---

## 📋 Requirements

- Java 21+
- Maven 3.8+
- Git (for version control)

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/alaw810/1.8-JavaLanguage-Lambdas-Level1.git
   ```

2. Import the project into IntelliJ IDEA (or another IDE that supports Maven).

3. Let Maven download all dependencies automatically.

---

## ▶️ Execution

To run a specific exercise, use the following Maven command:

```bash
mvn exec:java -Dexec.mainClass="com.alaw810.ex1.MainEx1"
```

Replace `ex1.MainEx1` with the appropriate exercise class (e.g., `ex5.MainEx5`).

---

## 🌐 Deployment

This project is intended for educational purposes and does not include deployment features. However, it is fully Maven-compatible and ready to be integrated into larger systems.

---

## 🤝 Contributions

This is a learning exercise intended for individual academic practice.
However, pull requests with enhancements or improvements are welcome!

1. Fork the repo
2. Create a new branch (`git checkout -b feature/your-feature`)
3. Commit and push your changes
4. Open a Pull Request

