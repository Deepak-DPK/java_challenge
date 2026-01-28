# Master Prompt: Beginner-Friendly README Generation Template
---

**Universal README Generator for Code Learning Projects — Optimized for New Programmers**

Use this prompt to create clear, structured README files that any fresh viewer can understand, from complete beginners to experienced developers.

---

**PROMPT:**

```
You are writing a README for a code learning project aimed at BEGINNERS. 
Before writing, read every source file in the target folder specified (e.g., `{{SOURCE_DIR}}`).

REMEMBER: Your reader might be opening this README as their FIRST experience with programming.
Make it friendly, simple, and avoid technical jargon without explanation.

Then produce a README following these guidelines:

1. STRUCTURE (Beginner-Friendly Order):
   ✅ Start with a FRIENDLY GREETING (not just "Learning Objectives")
   ✅ Add TIME ESTIMATE (how long will this take?)
   ✅ "What You'll Learn Today" — Use simple words, not jargon
   ✅ "The Big Ideas" — Explain core concepts with metaphors/real-world examples
   ✅ "Do You Have Everything You Need?" — Simple prerequisites check
   ✅ File descriptions with CLEAR PROGRESSION (V1 → V2 → V3 with what changed)
   ✅ How to Run (copy-paste ready commands)
   ✅ Common Mistakes & Fixes section (error table + solutions)
   ✅ Examples with Sample Input/Output
   ✅ Key Concepts Explained Plainly
   ✅ Glossary of new words (demystify jargon)
   ✅ Real-World Applications Table
   ✅ Next Steps & Practice Guide
   ✅ Completion Checklist (how do I know I'm done?)
   ❌ AVOID: Technical jargon at the start, dense concept explanations, confusing tables

2. LANGUAGE FOR BEGINNERS:
   ✅ Use short sentences (10-15 words max per sentence)
   ✅ Explain WHY before explaining HOW
   ✅ Use analogies (Scanner is like "a listener", if/else is like "a waiter taking orders")
   ✅ Say "decimal numbers" instead of "floating-point arithmetic"
   ✅ Say "asking the user for information" instead of "input handling"
   ✅ Say "stops bugs before they happen" instead of "error handling"
   ✅ Break concepts into bite-sized chunks
   ✅ Use plain English, never assume prior knowledge

3. CORE CONCEPT SECTIONS:
   Format: **Idea [Number]: [Simple Title]**
   - ONE sentence saying what it is (keep it crisp)
   - Brief explanation (1-2 sentences max, no fluff)
   - REAL-WORLD EXAMPLE a beginner recognizes
   ✅ DO: "Your program listens to user input. Scanner does this. Example: ATM asks for PIN."
   ❌ DON'T: "Imagine your program is a waiter..." (too much setup)
   ❌ DON'T: Technical diagrams, complex explanations, code blocks

4. FILE PROGRESSION EXPLANATION:
   ✅ Use TABLE format for version comparison (cleaner than subsections)
   ✅ Show WHAT CHANGED between versions in concise language
   ✅ Format: Version | File | What's New | Goal
   ✅ Keep descriptions to 1 line each (no long explanations)
   ✅ Include progression note: "Compare V1→V2→V3→V4 to see evolution"
   ❌ DON'T: Use subsections with bullet points for each version

5. HOW TO RUN SECTION:
   ✅ Keep it SHORT and scannable (not Step 1, Step 2, Step 3)
   ✅ Show: Compile → Run → One-liner option
   ✅ Use copy-paste ready code blocks (no explanations in code blocks)
   ✅ Single line note after: "Do same for V2, V3, V4—change filename"
   ✅ Avoid: Lengthy explanations about what `&&` does (save for glossary)

6. USAGE EXAMPLES:
   ✅ Show FULL interaction (what user types, what program responds)
   ✅ Use actual text, not placeholders
   ✅ Label what's input vs. output (mark user input in quotes or with "→")
   ✅ Show version differences through examples, not just text
   ✅ Include 3-4 example runs showing different scenarios

7. KEY CONCEPTS SECTION:
   ✅ Title: "🧠 Key Things to Remember as You Code"
   ✅ Use SHORT subsections with ### headings
   ✅ Format each: [Simple explanation] + [2-4 line code] + **Why it matters:** [One sentence]
   ✅ Follow with: "🔤 Key Terms" section
   ✅ Glossary format: **Term** — One-sentence explanation (ultra-concise)
   ❌ DON'T: Dump entire code files, long paragraphs, or multi-line explanations

8. ERROR HANDLING & TROUBLESHOOTING:
   ✅ Add section: "⚠️ Oops! Common Mistakes & Fixes"
   ✅ Table format with 3 columns: Error Message | What It Means | How to Fix
   ✅ Include 5+ common beginner errors with simple solutions
   ✅ Examples: javac not found, InputMismatchException, file naming issues, etc.
   ✅ Use encouraging language ("Don't worry—everyone makes these!")
   ✅ Provide actionable, copy-paste ready solutions
   ❌ DON'T: Use technical jargon in explanations

9. REAL-WORLD APPLICATIONS TABLE:
   ✅ Use TABLE format: Concept | Where You See It
   ✅ Keep each row to 1-2 short lines max
   ✅ Use familiar apps (Banks, email, games, Instagram)
   ✅ Make it scannable, NOT explanatory
   ❌ DON'T: Write paragraphs explaining each row

10. COMPLETION CHECKLIST:
    ✅ Add section: "✅ You're Done When..."
    ✅ Provide a checkbox list of concrete achievements
    ✅ Include things they should be able to DO, not just understand
    ✅ Examples: "Run Version 1 successfully", "Explain why we use decimal numbers"
    ✅ End with celebratory language ("You're ready for Day 2! 🎉")
    ✅ Make it specific and measurable (not vague like "understand the material")

11. PRACTICE & NEXT STEPS:
   ✅ For Next Steps: Use SHORT bullet list (no explanations)
   ✅ For How to Learn: Use numbered list (7-8 steps max)
   ✅ Keep each item to one phrase: "Add a loop for multiple calculations"
   ❌ DON'T: Add "Try this:", "stretch goals", or lengthy instructions

12. BEGINNER FAQ / CONFUSION BREAKER:
    ✅ Add section: "💬 Still Confused? Here's the Simplest Explanation"
    ✅ Strip down the entire project to 3-5 core bullet points
    ✅ Show what each version does in the most basic terms
    ✅ End with an encouraging statement

13. FORMATTING FOR READABILITY (Crispness & Clarity):
    ✅ **Use tables instead of long lists** — Compact, scannable, professional
    ✅ **Remove ALL filler words** — Every sentence must earn its place
    ✅ **One idea per line** — No compound sentences or explanations mixed in
    ✅ **Maximum 5 words per bullet** — Force yourself to be concise
    ✅ **Whitespace matters** — Section breaks help eyes rest
    ✅ **Use emojis strategically** — One per section header (not excessive)
    ✅ **Bold key terms on FIRST mention only** — No over-bolding
    ✅ **Short paragraphs** — Never more than 2 lines
    ✅ **Tables for comparisons** — Faster to scan than prose
    ❌ DON'T: Include explanations after code blocks or in examples
    ❌ DON'T: Write verbose paragraph-style explanations
    ❌ DON'T: Repeat information (concept in text + code + example)

14. WHAT TO AVOID COMPLETELY:
    ❌ "Master", "advanced", "complex" language
    ❌ Full class definitions or code files
    ❌ Architectural diagrams or UML notation
    ❌ Assumed knowledge (Java generics, lambda functions, etc.)
    ❌ Dry textbook-style explanations
    ❌ Dense tables without explanation
    ❌ Jargon without explanation (dispatch, truncation, parse, etc.)
    ❌ "Prerequisites" section that's scary (keep it simple: "Do you have Java?")

15. ENCOURAGEMENT & TONE:
    ✅ Friendly, not condescending
    ✅ Use phrases like "Don't worry if...", "You've got this!", "It's simpler than it sounds"
    ✅ Celebrate small wins ("Once you feel comfortable...")
    ✅ End with a call-to-action ("Ready? Open X file and start!")
    ✅ Remember: This is their FIRST TIME learning. Be kind.
```

---

## Example Structure Template for Java Beginners:

```markdown
# DAY X: [Topic Name]

**Welcome to Day X!** 👋 [One sentence about what you'll build/learn]

⏱️ **Time to Complete:** [X minutes] (reading + trying all examples)

---

## 🎯 What You'll Learn Today

- [Concise bullet point]
- [Concise bullet point]
- [Concise bullet point]

---

## 📚 The Big Ideas

### **Idea 1: [Simple Title]**
[One sentence explanation. Example: Real app or scenario]

### **Idea 2: [Simple Title]**
[One sentence explanation. Example: Real app or scenario]

---

## 🛠️ Setup (What You Need)

- **[Tool]** — [Quick requirement]
- **[Tool]** — [Quick requirement]

**Check:** [Copy-paste command]

---

## 📂 The [N] Versions

| Version | File | What's New | Goal |
|---------|------|-----------|------|
| 1 | [file.ext](file.ext) | [Brief description] | [One word outcome] |
| 2 | [file.ext](file.ext) | [Brief description] | [One word outcome] |

**Pro tip:** Compare versions to see evolution.

---

## 🚀 Run It

**Compile:**
\`\`\`bash
command
\`\`\`

**Run:**
\`\`\`bash
command
\`\`\`

**One-liner:**
\`\`\`bash
command && command
\`\`\`

---

## ⚠️ Oops! Common Mistakes & Fixes

| Error | What It Means | How to Fix |
|-------|---------------|-----------|
| [Error message] | [Brief explanation] | [Quick solution] |

---

## 💡 Let's See It In Action

\`\`\`
Input example
Output example
\`\`\`

---

## 🧠 Key Things to Remember as You Code

### **Concept Name**
[One sentence explanation]
\`\`\`java
// 2-4 line example
\`\`\`

---

## 🔤 Key Terms

- **Term** — One-sentence explanation
- **Term** — One-sentence explanation

---

## 🌍 Real-World Uses

| Concept | Where You See It |
|---------|------------------|
| [Concept] | [Brief example] |

---

## 🎯 Next: Challenge Yourself

- [Short challenge]
- [Short challenge]
- [Short challenge]

---

## 📖 How to Learn

1. [Step]
2. [Step]
3. [Step]

---

## 💬 Still Confused?

**Your [project] does [3-5] things:**
\`\`\`
1. [Action]
2. [Action]
3. [Action]
\`\`\`

---

## ✅ You're Done When...

- [ ] [Concrete achievement]
- [ ] [Concrete achievement]
- [ ] [Concrete achievement]

**Checked all boxes? You're ready for the next step!** 🎉

---

**Ready? Open [filename] and start reading!** 🚀
```

---

## KEY PRINCIPLES FOR SUCCESS:

1. **Lead with emotion/context, not facts.** Start with "What would you build?" not "What will you learn?"
2. **Break down EVERY concept.** Assume zero prior knowledge.
3. **Show, don't tell.** Real examples > abstract explanations.
4. **Celebrate progress.** Use encouraging language throughout.
5. **Keep sections SHORT.** Beginners get overwhelmed by walls of text.
6. **Order matters.** Put simpler concepts first, build up complexity.
7. **Real-world relevance.** Connect to apps they use every day.
8. **Make it scannable.** Headers, tables, bullets, whitespace.
9. **Provide copy-paste commands.** No "see documentation"—just: here's the command.
10. **End with action.** Always tell them exactly what to do next.
11. **Be crisp and clear.** Remove every filler word. One idea per line.
12. **Use tables over prose.** Comparisons and lists scan faster in table format.
13. **No redundancy.** Never repeat info (text + code + example all saying same thing).
14. **Optimize for scanning.** Most readers won't read top-to-bottom—they'll scan headers and bold text first.
```
```

---
