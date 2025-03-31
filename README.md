# 🎮 Java Fundamentals – GamerVerse Platform Tracker

Welcome to **GamerVerse**, a simulated gaming platform!  
In this beginner Java assignment, you'll build a mini backend that tracks **gamers** and **games** — using Java classes and concepts you’ve just learned.

Each task targets a specific topic from today's lesson and reflects a simple, real-life software feature.

---

## 🧱 What You’ll Build

- A `Gamer` class for user profiles  
- A `Game` class for registered games  
- A way to view and track stats using overloaded methods  
- Static counters to monitor platform-wide totals  
- Memory cleanup via the `finalize()` method

---

## 📚 Concepts Practiced

✅ Classes & Objects  
✅ Access Modifiers (`public`, `private`, `protected`)  
✅ Constructors & Overloading  
✅ Method Overloading  
✅ Static Variables & Methods  
✅ `this` Keyword  
✅ finalize() Method  
✅ Object Creation with `new`  

---

## 📂 Project Structure

```
projectroot/
├── src/
│   └── com/
│       └── gamerverse/
│           ├── model/
│           │   ├── Gamer.java
│           │   └── Game.java
│           ├── logic/
│           │   └── AccessTest.java
│           └── app/
│               └── Main.java
```

---

## 🧩 Assignment Tasks

---

### 🔹 **Task 1: Class and Object Creation**

**Goal:** Practice class definitions and object instantiation using the `new` keyword.

✅ Create two `Gamer` objects  
✅ Create two `Game` objects  

📍 Test this in `Main.java`

---

### 🔹 **Task 2: Use of Access Modifiers**

**Goal:** Practice `public`, `private`, `protected`, and understand visibility rules.

✅ Mark `username` as `public`  
✅ Mark `age` as `private`  
✅ Mark `email` as `protected`  

📍 Test access in `AccessTest.java`  
❌ Direct access to `private` and `protected` will not work  
✅ Use a **getter** to access private data

---

### 🔹 **Task 3: Constructor & Constructor Overloading**

**Goal:** Learn how to initialize objects in multiple ways.

✅ Create a **default constructor**  
✅ Create a **parameterized constructor**  
✅ Use `this` to avoid shadowing in constructor  

📍 Found in both `Gamer.java` and `Game.java`  

---

### 🔹 **Task 4: Method Overloading**

**Goal:** Practice having multiple versions of a method.

✅ Create two `printProfile()` methods in `Gamer`  
✅ One version includes email based on `boolean` parameter  
✅ In `Game`, use a single `printInfo()` method for simplicity

---

### 🔹 **Task 5: Getter Method**

**Goal:** Access private fields via getters.

✅ Add `getAge()` to `Gamer` class  
✅ Use it in `AccessTest.java`

---

### 🔹 **Task 6: Static Variables and Methods**

**Goal:** Use static members to track platform-level data.

✅ Track total number of `Gamer` and `Game` objects  
✅ Add static methods to print totals

📍 Call them in `Main.java`

---

### 🔹 **Task 7: Using `finalize()`**

**Goal:** See how objects can be cleaned up from memory.

✅ Override `finalize()` in both `Gamer` and `Game`  
✅ Set some objects to `null`  
✅ Call `System.gc()` and observe the output

⚠️ Note: Garbage collection is **not guaranteed to run immediately**. Run your code a few times to see the `finalize()` messages.

---

## ✅ Bonus (Optional)

- Add more fields to `Game` like `price`, `releaseYear`  
- Create a `printInfo(boolean showRating)` overloaded method  
- Try formatting output more nicely (optional styling)

---

## 💡 Submission Guidelines (GitHub Classroom)

1. Clone the repo from the GitHub Classroom link.
2. Implement each task one by one.
3. Commit your changes clearly:
   - `git commit -m "Task 3: Added parameterized constructor to Gamer"`
4. Push your code:
   ```bash
   git push origin main
   ```
5. Make sure your `README.md` reflects your progress.

---

## 🏁 Final Checklist

| Task                           | Done |
|--------------------------------|------|
| Created `Gamer` & `Game` classes | ✅ / ❌ |
| Used access modifiers            | ✅ / ❌ |
| Used overloaded constructors     | ✅ / ❌ |
| Implemented method overloading   | ✅ / ❌ |
| Used static variables/methods    | ✅ / ❌ |
| Tested `finalize()` method       | ✅ / ❌ |

---

🚀 **Well done! You’ve just simulated a mini Java backend for a gaming platform using foundational Java concepts. Keep going, dev!**

Want to add a new feature? Try creating a `Leaderboard` class next 💡

