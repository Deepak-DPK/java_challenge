# DAY 1: Console Calculator

## 🎯 Learning Objectives
- Master user input handling with Scanner class
- Practice control flow with if/else conditionals
- Understand type handling and casting in arithmetic operations
- Implement input validation and error handling
- Build iterative improvements across file versions

---

## 📚 Core Concepts

### **User Input with Scanner**
The Scanner class reads user input from System.in, parsing different data types (int, double, char) for interactive console programs.

### **Control Flow with Conditionals**
Using if/else statements to dispatch operations based on user-selected operators, with validation to handle invalid inputs.

### **Type Handling in Arithmetic**
Understanding when to use int vs double to prevent integer truncation, especially for division operations that need decimal precision.

### **Key Language Features**

| Feature | Purpose | Example Use |
|---------|---------|-------------|
| Scanner | Input handling | `sc.nextInt()`, `sc.nextDouble()`, `sc.next().charAt(0)` |
| if/else | Control flow | Operator selection and validation |
| Type casting | Prevent truncation | `(double)a/b` for precise division |
| Guard clauses | Error prevention | Check for divide-by-zero before operation |

---

## ⚙️ Prerequisites
- **JDK Version**: 17+ (tested with OpenJDK 25)
- **OS**: Unix/Linux/macOS (Windows with minor command adjustments)

---

## 📂 Practice Files

**Progressive Version History:**

- **[calculator.java](calculator.java)** - V1: Basic calculator with int inputs, simple operator branching
- **[CalculatorV2.java](CalculatorV2.java)** - V2: Upgraded to double inputs, added operator validation, formatted equation output
- **[CalculatorV3.java](CalculatorV3.java)** - V3: Added divide-by-zero guard clause for safer division
- **[CalculatorV4.java](CalculatorV4.java)** - V4: Latest iteration with further refinements

**Key Progression:**
- V1 → V2: Integer to double precision, validation layer added
- V2 → V3: Error handling for edge cases (division by zero)
- V3 → V4: Additional improvements and refinements

---

## 🚀 How to Run

**Compile and Run Each Version:**

```bash
# Version 1
javac calculator.java && java calculator

# Version 2
javac CalculatorV2.java && java CalculatorV2

# Version 3
javac CalculatorV3.java && java CalculatorV3

# Version 4
javac CalculatorV4.java && java CalculatorV4
```

**Note:** All programs use interactive STDIN input. User provides two numbers and an operator when prompted.

---

## 💡 Usage Examples

**Sample Run (V1 - Basic):**
```
Enter your First number: 15
Enter your Second number: 3
Enter operation(+,-,*,/): *
RESULT: 45
```

**Sample Run (V2 - Formatted):**
```
Enter First Number: 10.5
Enter Second Number: 2.5
Enter OPERATIONS (+,-,*,/): +
10.5+2.5=13.0
```

**Sample Run (V3 - Error Handling):**
```
Enter First Number: 10
Enter Second Number: 0
Enter OPERATIONS (+,-,*,/): /
Second Number 0 cannot be divided
```

---

## 🔑 Important Logic to Remember

| Pattern | Implementation Detail |
|---------|----------------------|
| Char input parsing | `sc.next().charAt(0)` extracts first character for operator |
| Type precision | V1 uses int with cast: `(double)a/b`; V2/V3 use double throughout |
| Operator validation | V2+ checks if operator is in `(+, -, *, /)` before processing |
| Division guard | V3+ checks `b == 0` before division to prevent runtime errors |
| Nested conditionals | Outer validation, inner operation dispatch pattern |

---

## 💡 Why This Matters

| Concept | Real-World Application |
|---------|------------------------|
| Input validation | Prevents crashes in production systems; improves user experience |
| Error handling | Graceful degradation in user-facing applications |
| Type awareness | Critical for financial calculations, scientific computing, precision math |
| Guard clauses | Defensive programming prevents undefined behavior |
| Progressive refinement | Real development involves iterative improvements and bug fixes |

---

## 🔧 Quick Reference

**Standard Scanner Input Pattern:**
```java
Scanner sc = new Scanner(System.in);
int intValue = sc.nextInt();
double doubleValue = sc.nextDouble();
char operator = sc.next().charAt(0);
```

**Validation Pattern:**
```java
if ((op == '+') || (op == '-') || (op == '*') || (op == '/')) {
    // Process valid operation
} else {
    System.out.println("Invalid Operator");
}
```

---

## 🎯 Suggestions for Improvement
- Add `sc.close()` or use try-with-resources for proper Scanner cleanup
- Implement a loop to allow multiple calculations without restarting
- Add modulus operator (%) for remainder calculations
- Support more operations: power, square root, absolute value
- Add unit tests with JUnit for each operation and edge case
- Implement command-line arguments for non-interactive batch mode
- Add input validation for non-numeric entries (handle InputMismatchException)
- Create a menu-driven interface with operation selection

---

## 🧪 Testing Ideas
- Test each operation with positive, negative, and zero values
- Verify division-by-zero handling across all versions
- Test invalid operator inputs
- Check decimal precision in division operations
- Test boundary values (very large/small numbers)

---

**Day 1 Complete** ✅ 
