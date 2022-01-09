# sort-o_PBN
## Team Peanut Butter and Nutella
## Roster: Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha

## SOTW: The Void by Kid Cudi

### Bubble Sort: 
#### Best Case: Ascending Order
- When a list with **n** elements is already sorted in ascending order, there are **n-1** passes with no swaps.
- Runtime complexity: 1

#### Worst Case: Descending Order
- When the list is in descending order (opposite of what we want), then we have to make **n-1** passes with **(n<sup>2</sup> - n)/2** swaps. Each comparison results in one swap.
- Runtime complexity: n^2

### SelectionSort
#### Best Case: None
#### Worst Case: None
- There is no best/worst case because selection sort only swaps once per pass, and there's always n-1 passes. This is because we are individually moving each element to its correct position, regardless of its initial position.
- Runtime complexity: n

### InsertionSort
#### Best Case: Ascending Order
- When a list with **n** elements is already sorted in ascending order, there are **n-1** passes with no swaps.
- Runtime complexity: 1
#### Worst Case: Descending Order
- When the list is in descending order (opposite of what we want), then we have to make **n-1** passes with **(n<sup>2</sup> - n)/2** swaps. Each comparison results in a swap.
- Runtime complexity: n^2
