# 30-Day Java Challenge - Learning Journey

**A daily commitment to code, learn, and build consistency.**

⏱️ **Duration:** 30 consecutive days | **Started:** 27 January 2026 | **Status:** In Progress

---

## 📂 Project Structure

```
src/main/java/
├── DAY1/
│   ├── v1/ → CalculatorV1.java
│   ├── v2/ → CalculatorV2.java
│   ├── v3/ → CalculatorV3.java
│   └── v4/ → CalculatorV4.java
└── DAY2/
    ├── v1/ → Student_Report_card.java
    ├── v2/ → Student_Report_card_v2.java
    └── v3/ → Student_Report_card_v3.java
```

## 🔨 Build & Compile

**Compile all files:**
```bash
mvn clean compile
```

**Compiled output:** `target/classes/`

## ▶️ Run Programs

### DAY 1 - Calculator Programs

```bash
java -cp target/classes DAY1.v1.CalculatorV1
java -cp target/classes DAY1.v2.CalculatorV2
java -cp target/classes DAY1.v3.CalculatorV3
java -cp target/classes DAY1.v4.CalculatorV4
```

### DAY 2 - Student Report Card Programs

```bash
java -cp target/classes DAY2.v1.Student_Report_card
java -cp target/classes DAY2.v2.Student_Report_card_v2
java -cp target/classes DAY2.v3.Student_Report_card_v3
```

## 📋 Maven Commands

| Command | Purpose |
|---------|---------|
| `mvn clean` | Remove compiled files |
| `mvn compile` | Compile source code |
| `mvn clean compile` | Clean and recompile |
| `mvn package` | Create JAR file |

## 🔒 Version Control

All compiled files and build artifacts are ignored (.gitignore):
- `*.class`
- `target/`
- `.idea/`, `*.iml`
- `.settings/`, `.project`

---

## ⚙️ Setup

**Requirements:**
- Java JDK 17+
- Terminal access
- Text editor

**Compile & Run:**
```bash
javac Program.java && java Program
```

---

## 🚀 Get Started

```bash
cd "DAY 1"
cat README.md
javac calculator.java
java calculator
```

---

**Ready?** [👉 Start with Day 1](DAY%201/README.md)  

