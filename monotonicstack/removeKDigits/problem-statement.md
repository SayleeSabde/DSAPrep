# Remove K Digits

## 🧩 Problem Statement

Given a string `num` representing a **non-negative integer**, and an integer `k`, remove **exactly k digits** from `num` so that the resulting number is the **smallest possible**.

You must return the result as a **string**, and it must **not contain leading zeros** unless the result is `"0"`.

### 📥 Input
- `num`: a string of digits, length between `1` and `10⁵`
- `k`: an integer such that `1 ≤ k ≤ num.length`

### 📤 Output
- A string representing the **smallest possible number** after removing `k` digits.

---

## 🧪 Examples

### Example 1
```plaintext
Input: num = "1432219", k = 3
Output: "1219"
```

# Intuition: Remove K Digits to Get the Smallest Number

## 🧠 Core Goal

Given a string `num` representing a non-negative integer and an integer `k`, the goal is to remove exactly `k` digits to produce the **smallest possible number**.

---

## 🔍 Key Observations

- Smaller digits should appear **earlier** to minimize the number.
- If a digit is **larger than the next digit**, it’s a good candidate for removal.
- We want to remove digits that **block smaller digits from moving forward**.

---

## 📚 Strategy: Greedy + Monotonic Stack

To achieve the smallest number:
1. **Scan left to right** through the string.
2. Use a **stack** to keep track of digits in the result.
3. For each digit:
   - While the stack is not empty, and the current digit is **smaller than the top of the stack**, and we still have digits to remove (`k > 0`), **pop** the stack.
   - Push the current digit to the stack.
4. After scanning, if `k > 0`, remove digits from the **end** of the stack.
5. Build the result from the stack and **remove leading zeros**.

---

## 🧠 Mental Model

Think of it like building a number digit by digit:
- You’re always asking:  
  **“Can I remove a bigger digit to let a smaller one come forward?”**
- This simulates constructing the smallest number possible, one smart decision at a time.

---

## 🧪 Example Walkthrough

```plaintext
Input: num = "1432219", k = 3