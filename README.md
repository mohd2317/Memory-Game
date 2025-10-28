# 🧠 Memory Game (Java Console Project)

A simple **console-based Memory Game** built in Java that tests your concentration and memory.  
Players flip two cards at a time and try to find matching pairs. The game continues until all pairs are found.

---

## 🎮 How the Game Works

- The game has **8 cards total (4 pairs)** — for example: A, A, B, B, C, C, D, D.
- The cards are **randomly shuffled** and placed face down, numbered from **0 to 7**.
- On each turn:
    1. The player selects **two different card indices**.
    2. If the cards **match**, they stay face up.
    3. If they **don’t match**, they are flipped back down.
- The game ends when **all pairs are found**.

---

## 🧩 Example Gameplay

Welcome to the Memory Game!
| | | | | | | | |
Enter index of first card to flip: 2
| | | B | | | | | |
Enter index of second card to flip: 5
| | | B | | | A | | |
Sorry, those cards don't match.
| | | | | | | | |
...
You found a pair!
Congratulations, you win!



---

## ⚙️ Key Concepts Used

- **ArrayList** – To store and shuffle card values
- **String Array (`String[]`)** – To represent the game board
- **Boolean Array (`boolean[]`)** – To track flipped cards
- **Loops & Conditionals** – To manage turns and game logic
- **User Input Validation** – To ensure proper moves

---

## 🧠 What You’ll Learn

This project helps you practice:
- Working with arrays and lists
- Using loops, conditions, and randomization
- Handling user input in Java
- Managing game logic and state
- Structuring a console-based interactive program

---

## 🛠️ Technologies Used

- **Language:** Java
- **IDE (Optional):** IntelliJ IDEA / Eclipse / VS Code
- **Java Version:** 8 or above

---
