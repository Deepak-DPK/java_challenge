# DAY 1: Console Calculator

**Welcome to Day 1!** 👋 You're going to build a working calculator program from scratch. Don't worry if you're new to Java—we'll start simple and build it up step by step.

⏱️ **Time to Complete:** 30-45 minutes (reading + trying all 4 versions)

---

## 🎯 What You'll Learn Today

By the end of Day 1, you'll be able to:
1. **Ask the user for information** (numbers and operations) while your program is running
2. **Make decisions** based on what the user types (add, subtract, multiply, or divide)
3. **Do math** with decimal numbers (not just whole numbers)
4. **Stop bugs before they happen** (like preventing division by zero)

---

## 📚 The Big Ideas

### **Idea 1: Getting Input from the User**
Your program needs to listen to what the user types. Java's `Scanner` does this.
**Example:** ATM asks for your PIN.

### **Idea 2: Making Choices (if/else)**
Make decisions: "If user pressed +, add. If -, subtract."
**Example:** Vending machine checks "If money is enough, dispense snack."

### **Idea 3: Whole Numbers vs Decimals**
`10 / 3` = `3` (whole) or `3.333...` (decimal). We need decimals for accurate math.

### **Idea 4: Protecting Your Program**
Dividing by zero crashes your program. Add a safety check to prevent it.

---

## 🛠️ Setup (What You Need)

- **JDK 17+** (tested with OpenJDK 25)
- **Terminal** — Mac/Linux Terminal or Windows Command Prompt
- **Text editor** — VS Code, Notepad++, etc.

**Check if Java is installed:**
```bash
java -version
```
No? Download from [oracle.com](https://www.oracle.com/java/technologies/downloads/)

---

## 📂 The 4 Versions

| Version | File | What's New | Goal |
|---------|------|-----------|------|
| 1 | [calculator.java](calculator.java) | Ask for 2 numbers + operation, show answer | Learn input & math |
| 2 | [CalculatorV2.java](CalculatorV2.java) | Decimal numbers + validate operator | Learn validation |
| 3 | [CalculatorV3.java](CalculatorV3.java) | Prevent division by zero | Handle errors |
| 4 | [CalculatorV4.java](CalculatorV4.java) | More improvements & polish | See progression |

**Pro tip:** Compare versions 1→2→3→4 to see how code evolves.

---

## 🚀 Run It

**Compile:**
```bash
javac calculator.java
```

**Run:**
```bash
java calculator
```

**One-liner (compile + run):**
```bash
javac calculator.java && java calculator
```

*Do the same for V2, V3, V4—just change the filename.*

---

## ⚠️ Oops! Common Mistakes & Fixes

Don't worry—everyone makes these mistakes! Here's how to fix them:

| Error Message | What It Means | How to Fix |
|---|---|---|
| `javac: command not found` | Java isn't installed on your computer | Download and install JDK from [oracle.com](https://www.oracle.com/java/technologies/downloads/) |
| `Exception in thread "main"` | Your program crashed while running | Check the error message above it—it tells you what went wrong. Read your code carefully |
| Program asks for input but nothing happens | It's waiting for YOU to type | Type a number and press Enter. The program is listening! |
| `error: class calculator is public, should be declared in a file` | File name doesn't match class name | Make sure your file is named `calculator.java` (not Calculator.java) |
| `InputMismatchException` | You typed something the program didn't expect | If asked for a number, type a number. If asked for an operator, type +, -, *, or / |

---

## 💡 Let's See It In Action

### **Version 1 Example** (You enter text in blue)
```
Enter your First number: 15
Enter your Second number: 3
Enter operation(+,-,*,/): *
RESULT: 45
```

### **Version 2 Example** (Nicer output)
```
Enter First Number: 10.5
Enter Second Number: 2.5
Enter OPERATIONS (+,-,*,/): +
10.5+2.5=13.0
```

### **Version 3 Example** (Protection against mistakes)
```
Enter First Number: 10
Enter Second Number: 0
Enter OPERATIONS (+,-,*,/): /
❌ Second Number 0 cannot be divided
```

---

## 🧠 Key Things to Remember as You Code

### **How to get input from the user:**
```java
Scanner sc = new Scanner(System.in);
double num = sc.nextDouble();        // Get a decimal number
char op = sc.next().charAt(0);       // Get one character (the operator)
```

**What's happening:** You create a `Scanner` (like a listener), then ask it to listen for different types of input.

### **How to make decisions (if/else):**
Checking if the operator is valid:
- If it's one of these: `+`, `-`, `*`, `/` → Do the math
- If it's something else → Say "Invalid!"

### **Why Version 2 uses decimals instead of whole numbers:**
- Whole numbers: `10 / 3 = 3` (lost the .333 part!)
- Decimal numbers: `10.0 / 3.0 = 3.333...` (the real answer)

### **Why Version 3 checks for division by zero:**
You can't divide by zero—it breaks your program. So before dividing, ask: "Is the second number zero? If yes, show an error instead of crashing."

---

## 🔤 Key Terms

- **Compile** — Turn code into computer language
- **Scanner** — Tool to get user input
- **Variable** — Box that stores data (e.g., `int age = 25`)
- **Operator** — Math symbol: `+` `-` `*` `/`
- **Validation** — Check if input is valid before using it
- **Exception** — Error while running
- **Input** — Data user gives to program
- **Output** — Data program shows to user

---

## 🌍 Real-World Uses

| Concept | Where You See It |
|---------|------------------|
| User input | Banks, email, games, forms |
| Decision-making (if/else) | Every app responds to different situations |
| Decimals | Money apps—can't use whole numbers for cents |
| Error checking | Apps crash gracefully, never break silently |

---

## 🎯 Next: Challenge Yourself

- Add a loop for multiple calculations
- Add modulus operator `%` for remainders
- Handle bad input gracefully
- Close the Scanner properly
- Add more operations (power, sqrt)

---

## 📖 How to Learn

1. Read Version 1 code
2. Run it, try different numbers
3. Read Version 2, spot the differences
4. Run it
5. Repeat for V3, V4
6. Modify the code (change prompts, add operations)
7. Test edge cases (0, negatives, huge numbers)

---

## 💬 Still Confused? Here's the Simplest Explanation

**Your calculator does 3 things:**

```
1. Ask user: "Give me two numbers"
2. Ask user: "What operation? +, -, *, or /"
3. Do the math and show the answer
```

**Each version just makes this a little fancier:**
- V1: Basic version ✅
- V2: Uses decimals + checks if operation is valid ✅
- V3: Prevents division by zero crash ✅
- V4: More polish ✅

**That's it!** The hardest part isn't the code—it's understanding that computers are very literal. They do EXACTLY what you tell them, nothing more.

---

## ✅ You're Done When...

- [ ] Java is installed and `java -version` works
- [ ] Compiled and ran Version 1
- [ ] Understand why V2 uses decimals
- [ ] Saw the error message in V3 (divide by zero)
- [ ] Can explain: "Why can't we divide by zero?"
- [ ] Spotted differences between V1, V2, V3 code
- [ ] Ran all 4 versions successfully

**Checked all boxes? You're ready for Day 2!** 🎉

---

**Ready? Open `calculator.java` and start reading!** 🚀 
