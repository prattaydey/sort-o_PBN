# sort-o_PBN
## Team Peanut Butter and Nutella
## Roster: Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha

## SOTW: The Void by Kid Cudi

### Bubble Sort: 
#### Best Case: Ascending Order
- When a list with **n** elements is already sorted in ascending order, there are **n-1** passes with no swaps, since it is already sorted.
- Runtime complexity **(Exit Early)**: O(n)
  - It is O(n) because when the first pass of Bubble Sort is run on a dataset and no swaps are made, then we know that future passes will yield the same result. Thus, no further passes of Bubble Sort need to be run on the dataset. As a result, the number of comparisons is equal to n-1, where n is the number of elements in the dataset.
- Runtime Complexity **(Vanilla)**: O(n<sup>2</sup>)

#### Worst Case: Descending Order
- When the list is in descending order (opposite of what we want), then we have to make **n-1** passes with **(n<sup>2</sup> - n)/2** swaps. Each comparison results in one swap.
- Runtime complexity: O(n<sup>2</sup>)
- The runtime complexity of the worst case and the best case (when utilizing vanilla bubble sort) are the same because the same number of comparisons that are made between the worst case and best case are the same, since there is no terminating condition in vanilla bubble sort.

### Selection Sort:
#### Best Case: None
#### Worst Case: None
- There is no best/worst case because selection sort only swaps once per pass, and there's always **n-1** passes. This is because we are individually moving each element to its correct position, regardless of its initial position.
- Runtime complexity: O(n<sup>2</sup>)

### Insertion Sort:
#### Best Case: Ascending Order
- When a list with **n** elements is already sorted in ascending order, there are **n-1** passes with no swaps, since it is already sorted.
- Runtime complexity: O(n)
#### Worst Case: Descending Order
- When the list is in descending order (opposite of what we want), then we have to make **n-1** passes with **(n<sup>2</sup> - n)/2** swaps. Each comparison results in a swap.
- Runtime complexity: O(n<sup>2</sup>)
