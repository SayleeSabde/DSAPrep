# Recursion pattern for subsequences

The recursion pattern for subsequences involves exploring all possible combinations by either including or excluding each element of the input sequence. At each step, the algorithm makes a choice: to either pick the current element to include in the subsequence, or not pick it and move to the next element. This generates all possible subsequences.

### How this pattern typically works

#### Base Case:

If the input sequence is empty, process the current subsequence (e.g., print it, store it, etc.) and return.

#### Recursive Step:

##### Pick: 
Create a new subsequence by adding the current element to the existing subsequence. Recursively call the function with the remaining input sequence and the new subsequence.

##### Don't Pick: 

Recursively call the function with the remaining input sequence and the existing subsequence (without adding the current element).

### Time complexity:
This approach systematically explores all possible paths, resulting in the generation of every subsequence. The total number of subsequences for a sequence of length n is 2n, because each element has two choices (pick or don't pick).


### Example:

    private static void findSubsequences(int index, int[] arr, List<Integer> currentSubsequence, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(currentSubsequence));
            return;
        }

        // Include the current element
        currentSubsequence.add(arr[index]);
        findSubsequences(index + 1, arr, currentSubsequence, result);

        // Exclude the current element
        currentSubsequence.remove(currentSubsequence.size() - 1);
        findSubsequences(index + 1, arr, currentSubsequence, result);
    }
