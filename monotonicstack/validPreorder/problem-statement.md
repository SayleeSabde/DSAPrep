# Verify Preorder Sequence in Binary Search Tree

## 🧩 Problem Statement

Given an array of **unique integers** called `preorder`, determine whether it represents a **valid preorder traversal** of a **binary search tree (BST)**.

### ✅ Preorder Traversal Rules
- Visit the **root** node first.
- Recursively visit the **left subtree**.
- Recursively visit the **right subtree**.

### ✅ BST Property
- For any node:
    - All values in its **left subtree** are **less than** the node’s value.
    - All values in its **right subtree** are **greater than** the node’s value.

---

## 📥 Input
- An integer array `preorder` of length `n` where `1 ≤ n ≤ 10⁴`
- All elements in `preorder` are **unique** and in the range `1 ≤ preorder[i] ≤ 10⁴`

## 📤 Output
- Return `true` if the array is a valid preorder traversal of a BST.
- Return `false` otherwise.

---

## 🧪 Examples

### Example 1
```plaintext
Input: preorder = [5, 2, 1, 3, 6]
Output: true