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
Imagine your program is a waiter—it needs to ask the customer what they want. Java's `Scanner` tool does exactly that. It listens to what the user types and lets your program use that information.

**Real-world example:** When you use a ATM, it asks you for your PIN. That's input handling!

### **Idea 2: Making Choices (if/else)**
Your program isn't just a robot that does one thing. It needs to make decisions: "If the user presses +, add the numbers. If they press -, subtract them."

**Real-world example:** A vending machine checks: "If money is enough, dispense snack. If not, show error."

### **Idea 3: Whole Numbers vs Decimal Numbers**
This is important! If you divide 10 by 3:
- Using whole numbers: You get 3 (the answer cuts off)
- Using decimals: You get 3.333... (the real answer)

We'll learn why this matters and how to fix it.

### **Idea 4: Protecting Your Program**
Dividing by zero breaks your program. It's like asking "What's 10 cookies shared among 0 friends?"—it doesn't make sense! We'll add a safety check to prevent this crash.

---

## 🛠️ Do You Have Everything You Need?

Before you start, make sure:
- **Java is installed** — You need JDK version 17 or newer (We tested with OpenJDK 25)
- **Terminal/Command line access** — A way to run commands (Terminal on Mac/Linux, Command Prompt on Windows)
- **A text editor** — Any editor works (VS Code, Notepad++, etc.)

**Not sure what you have?** Open your terminal and type:
```bash
java -version
```

If you see a version number, you're good to go! If not, download Java from [oracle.com](https://www.oracle.com/java/technologies/downloads/).

---

## 📂 The Files You'll Work With

We give you **4 versions** of the calculator. Each one gets a little better:

### **Version 1: The Basics** — [calculator.java](calculator.java)
- Asks for two whole numbers (like 10, 25, 100)
- Asks which operation you want (+, -, *, /)
- Shows the answer
- **Goal:** Learn how to get input and do math

### **Version 2: Getting Prettier** — [CalculatorV2.java](CalculatorV2.java)
- Works with decimal numbers (like 10.5, 3.14)
- Checks if the operation you typed is valid
- Shows the math in a nice format: `10.5 + 2.5 = 13.0`
- **Goal:** Learn input validation (checking if the user typed something we can use)

### **Version 3: Crash Prevention** — [CalculatorV3.java](CalculatorV3.java)
- Does everything Version 2 does...
- **Plus:** Stops you from dividing by zero (it gives a friendly error message instead)
- **Goal:** Learn how to prevent common mistakes

### **Version 4: The Latest** — [CalculatorV4.java](CalculatorV4.java)
- Even more improvements and polish
- **Goal:** See how real code keeps getting better over time

**Pro tip:** Start with Version 1, then look at Version 2 to see what changed. Then Version 3, then 4. This is how real programmers learn!

---

## 🚀 How to Run Your Program

Each version is its own standalone program. Here's how to run them:

**Step 1: Compile** (Turn Java code into something the computer can run)
```bash
javac calculator.java
```

**Step 2: Run** (Actually run the program)
```bash
java calculator
```

Do the same for other versions—just replace the filename:
```bash
javac CalculatorV2.java && java CalculatorV2
javac CalculatorV3.java && java CalculatorV3
javac CalculatorV4.java && java CalculatorV4
```

**What `&&` does:** It says "compile first, and if that works, then run it." Convenient shortcut!

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

## 🔤 New Words You Might See

Don't let these words confuse you! Here's what they mean in simple terms:

- **Compile** — Turn Java code (that humans write) into computer language (that computers understand). `javac` does this.
- **Scanner** — A tool that listens to what the user types and lets your program use it.
- **Variable** — A box that stores information. Example: `int age = 25;` (you're storing the number 25 in a box called "age")
- **Operator** — A symbol used for math: `+` (add), `-` (subtract), `*` (multiply), `/` (divide)
- **Edge case** — A tricky situation your code needs to handle. Example: dividing by zero
- **Validation** — Checking if the user typed something your program can actually use
- **Exception** — An error that happens while your program is running
- **Input** — Information the user gives to your program (typing a number)
- **Output** — Information your program shows to the user (printing the answer)

---

## 🌍 Why This Matters in the Real World

| What You're Learning | Where You'll Use It |
|-----|-----|
| **Getting user input** | Bank apps, email, games, forms—they all ask for information |
| **Making decisions (if/else)** | Every app ever made—it responds differently to different situations |
| **Using the right number type** | Money apps need decimals! Whole numbers won't work for cents |
| **Checking for mistakes** | Professional apps NEVER just crash—they say "Sorry, that didn't work" |

**Real example:** When you use Instagram and type "Hello", that's input. When the app decides to show that message vs an error, that's if/else. When Instagram shows your account balance, it uses decimals. When you send money and get an error, someone put in a mistake-check like we're doing!

---

## 🎯 Next Steps After Day 1

Once you feel comfortable with the 4 versions, try these improvements:

1. **Add a loop** — Let the user do multiple calculations without restarting
2. **Add modulus (%)** — For finding remainders (10 % 3 = 1)
3. **Add more operations** — Like power (^) or square root
4. **Close the Scanner** — Good coding practice (prevents resource leaks)
5. **Handle bad input** — What if someone types "abc" instead of a number?
6. **Use Command Line Arguments** — Make it non-interactive

---

## ✅ How to Practice

**Best way to learn:**
1. Read Version 1 code
2. Run Version 1 and try a few calculations
3. Look at Version 2 code and spot the differences
4. Run Version 2
5. Repeat for V3 and V4

**Then try:**
- Modify a program (change what prompts say, add a new operation)
- Test edge cases (what happens if you enter 0, negative numbers, super big numbers?)
- Write your own version from scratch once you feel ready

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

You've successfully completed Day 1 when you can do these things:

- [ ] Install Java and verify it works (`java -version` shows a number)
- [ ] Compile and run Version 1 successfully
- [ ] Enter numbers and an operator, see the correct answer
- [ ] Understand WHY Version 2 uses decimal numbers instead of whole numbers
- [ ] Run Version 3 and see what happens when you divide by zero
- [ ] Explain in your own words: "Why can't we divide by zero?"
- [ ] Look at the code in Version 2 and spot the differences from Version 1
- [ ] Run ALL 4 versions and see how they're the same but different

**If you checked all the boxes above, you're ready for Day 2!** 🎉

---

**Ready? Open `calculator.java` and start reading!** 🚀 
