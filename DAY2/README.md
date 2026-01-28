# DAY 2: Building a Student Report Card System

**Welcome to Day 2!** 👋 Today you'll learn how to organize code by splitting it into helpful pieces so it stays clean and easy to understand.

⏱️ **Time to Complete:** 45 minutes (reading + trying all examples)

---

## 🎯 What You'll Learn Today

- How to create a **Student class** to store information
- How to calculate **totals and averages** automatically
- How to reuse code by splitting responsibilities
- When to create **separate classes** for different jobs

---

## 📚 The Big Ideas

### **Idea 1: Classes Store Related Information**
A **class** is a container that holds data (like a student's name and marks) and the actions you can do with that data (like calculating totals). Think of it like a folder that keeps everything about one student together.

### **Idea 2: Methods Do One Job Well**
Instead of writing the same calculation 10 times, write it **once** in a method. Then use it whenever you need it. Like a calculator button—press it, get your answer.

### **Idea 3: Separate Jobs = Separate Classes**
One class should do ONE main thing. `Student` calculates grades. `ReportPrinter` prints reports. Don't mix them. This makes code easier to find and fix.

---

## 🛠️ Setup (What You Need)

- **Java** — Version 11 or newer
- **Text Editor** — Any editor (VS Code, Notepad++, etc.)
- **Terminal** — To compile and run code

**Check:** Run this command:
```bash
javac -version
```

Should show `javac 11` or higher. You're ready!

---

## 📂 The 4 Versions

| Version | File | What's New | Goal |
|---------|------|-----------|------|
| 1 | [Student_Report_card.java](Student_Report_card.java) | One student, basic methods | Learn classes |
| 2 | [Student_Report_card_v2.java](Student_Report_card_v2.java) | Two students, same class | Handle multiple students |
| 3 | [Student_Report_card_v3.java](Student_Report_card_v3.java) | Add ReportPrinter class | Separate printing job |
| 4 | [Student_Report_card_v4.java](Student_Report_card_v4.java) | Add pass/fail & comparison | Add logic & features |

**Pro tip:** Compare versions to see code evolution. Each one fixes or improves the last!

---

## 🚀 Run It

**Compile (turn Java into something runnable):**
```bash
javac DAY2/Student_Report_card.java
```

**Run (execute the program):**
```bash
java -cp . DAY2.Student_Report_card
```

**One-liner (compile + run together):**
```bash
javac DAY2/Student_Report_card.java && java -cp . DAY2.Student_Report_card
```

**For other versions:** Replace `Student_Report_card` with `Student_Report_card_v2`, `v3`, or `v4`.

---

## ⚠️ Oops! Common Mistakes & Fixes

| Error | What It Means | How to Fix |
|-------|---------------|-----------|
| `javac: command not found` | Java isn't installed | Install Java from oracle.com |
| `package DAY2 does not exist` | Wrong folder structure | Make sure file is in DAY2 folder |
| `Exception in thread "main"` | Program crashed while running | Check your variable values (marks should be 0-100) |
| `cannot find symbol: class Student` | Missing class definition | Make sure `class Student` is in the same file |
| `symbol: method calculateTotal() not found` | Typo in method name | Check spelling: it's `calculateTotal`, not `calculatetotal` |

---

## 💡 Let's See It In Action

### Version 1: One Student

```
Output:
Name: DEEPAK
total : 169
Average: 56.333333333333336
```

This shows one student. Simple!

### Version 2: Two Students

```
Output:
Name: DEEPAK
total : 169
Average: 56.333333333333336
Name: SRINATH
total : 219
Average: 73.0
```

Now two students run, one after another.

### Version 3: Using ReportPrinter

```
Output:
Name: DEEPAK
total : 169
Average: 56.333333333333336
--------------------
Name: SRINATH
total : 219
Average: 73.0
--------------------
```

Same result, but cleaner code (ReportPrinter handles printing).

### Version 4: Compare & Pass/Fail

```
Output:
Name: DEEPAK
total : 169
Average: 56.333333333333336
--------------------
Name: SRINATH
total : 219
Average: 73.0
--------------------
Name: DEEPAK
total : 169
Average: 56.333333333333336
--------------------
SRINATH Has Higher Total
Passed
```

Now we compare students and check if they passed!

---

## 🧠 Key Things to Remember as You Code

### **Variables: Containers for Data**
Variables hold information. Think of them like boxes with labels.
```java
String name = "DEEPAK";  // Text box
int marks1 = 45;          // Number box
double average = 56.33;   // Decimal box
```
**Why it matters:** Variables let you store and reuse information without typing it over and over.

### **Methods: Recipes That Produce Results**
A method is like a recipe. Follow steps, get a result. Call it anytime you need that result.
```java
int calculateTotal() {
    int total = marks1 + marks2 + marks3;
    return total;  // Give back the answer
}
```
**Why it matters:** Don't repeat the same math 10 times. Write it once, use it everywhere.

### **Classes: Organization Containers**
A class groups related data and methods. One class = one responsibility.
```java
class Student {
    // Data: name, marks
    // Methods: calculateTotal(), calculateAverage()
}
```
**Why it matters:** Keeps your code organized so it's easy to find and fix things.

### **Objects: Actual Instances**
A class is a blueprint. An object is the real thing you create from that blueprint.
```java
Student s1 = new Student();  // s1 is a real student object
s1.name = "DEEPAK";           // Fill in the data
```
**Why it matters:** You can create many student objects from one Student class.

---

## 🔤 Key Terms

- **Class** — A blueprint for creating objects. Like a cookie cutter.
- **Object** — A specific thing created from a class. Like a cookie made with a cutter.
- **Variable** — A container that holds a value (name, age, marks).
- **Method** — A reusable action (calculateTotal, print, compare).
- **Return** — Give back an answer from a method.
- **Package** — A folder that groups related code (DAY2 is our package).
- **Instance** — A single object created from a class.
- **Average** — Add up numbers and divide by how many numbers. (45+56+68)/3 = 56.33.

---

## 🌍 Real-World Uses

| Concept | Where You See It |
|---------|------------------|
| Classes & Objects | Banks (Customer class, Account objects) |
| Methods (calculateTotal) | Calculators, spreadsheets, apps |
| Storing Student Data | School systems, online learning platforms |
| Comparing Scores | Games (who has higher score?), leaderboards |
| Pass/Fail Logic | Report cards, course enrollment, streaming apps |

---

## 🎯 Challenge Yourself

- Modify V1: Add a 4th subject mark and recalculate average
- Modify V2: Add a `getGrade()` method (A, B, C, D based on average)
- Modify V3: Add a method to print only passing students
- Modify V4: Create a method to find the student with highest total

---

## 📖 How to Learn

1. **Read the Version 1 code slowly** — Understand Student class and methods
2. **Run Version 1** — See output, understand how it works
3. **Compare Version 2** — See how two students use the same class
4. **Read Version 3** — Learn why ReportPrinter class exists
5. **Run all 4 versions** — Feel the progression
6. **Try the challenges** — Make your own changes
7. **Break things, fix them** — That's how you learn!

---

## 💬 Still Confused?

**Your Student Report Card does 4 things:**

1. **Stores data** — Student name and three marks (45, 56, 68)
2. **Calculates totals** — Adds marks: 45+56+68 = 169
3. **Calculates averages** — Divides total by 3: 169/3 = 56.33
4. **Prints reports** — Shows "Name: DEEPAK, Total: 169, Average: 56.33"

**How versions improve:**
- V1: Does all 4 things for ONE student
- V2: Does all 4 things for TWO students
- V3: Separates printing into a different class (cleaner)
- V4: Adds new features (pass/fail, comparison)

That's it. Simple.

---

## ✅ You're Done When...

- [ ] You understand what a **class** is
- [ ] You can explain why **methods** are useful
- [ ] You ran all 4 versions successfully
- [ ] You can **trace through** Version 2 and predict output
- [ ] You know the difference between **class** and **object**
- [ ] You can create a new Student and fill in the data
- [ ] You understand why ReportPrinter is separate (Version 3)

**Checked all boxes? You've mastered the basics of organizing code!** 🎉

---

**Ready? Open [Student_Report_card.java](Student_Report_card.java) and start reading!** 🚀
