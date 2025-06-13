# 🎮 Tic Tac Toe Game (Java)

A clean and extensible **Tic Tac Toe** game built in Java using object-oriented principles! Play a classic 3x3 game of Xs and Os with win/draw detection and a console-based UI. 🧠

---

## 🚀 Features

- 🔁 Two-player game (X vs O)
- 🧩 3x3 grid-based gameplay
- ✅ Win and draw detection
- 🚫 Input validation (no double moves!)
- 🎛️ Console UI to play and display the board
- 📦 Fully object-oriented, extensible design

---

## 🛠️ Class Design

### 1️⃣ `Game` 🎲  
Manages the game flow and player turns.

**Fields:**
- `Board board`
- `Player[] players`
- `int currentPlayerIndex`
- `GameStatus status`

**Methods:**
- `play()`
- `makeMove(int row, int col)`
- `checkWin()`
- `checkDraw()`
- `switchPlayer()`
- `getCurrentPlayer()`

---

### 2️⃣ `Board` 🧩  
Represents the game grid and handles symbol placements and win conditions.

**Fields:**
- `Cell[][] grid`
- `int size`

**Methods:**
- `isCellEmpty(int row, int col)`
- `setCell(int row, int col, Symbol symbol)`
- `printBoard()`
- `isFull()`
- `checkWin(Symbol symbol)`

---

### 3️⃣ `Cell` 📦  
Models a single square on the board.

**Fields:**
- `int row`
- `int col`
- `Symbol symbol`

**Methods:**
- `getSymbol()`
- `setSymbol(Symbol symbol)`

---

### 4️⃣ `Player` 👤  
Represents a player.

**Fields:**
- `String name`
- `Symbol symbol`

---

### 5️⃣ `Symbol` 🔣 *(Enum)*  
Defines the symbols used by players.

**Members:**
- `X`
- `O`

---

### 6️⃣ `GameStatus` 📊 *(Enum)*  
Represents the current status of the game.

**Members:**
- `IN_PROGRESS` – Game is ongoing  
- `WIN` – A player has won  
- `DRAW` – Game is a draw with no winner

---
