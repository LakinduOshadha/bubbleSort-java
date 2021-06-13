# bubbleSort-java

1. Please refer “BubbleSort” java program which implements bubble sort algorithm given below.

Alg.: BUBBLESORT(A)
  for i  1 to length[A]- 1
    do for j  length[A] downto i + 1
     do if A[j] < A[j -1]
       then exchange A[j]  A[j-1] 
 
 
2. Create a method named buubleSort2 in the same java class which implements modified bubble sort 
algorithm given below.

Alg.: BUBBLESORT2(A)
for i = A.length to 2
  swapped = false
  for j = 2 to i
    if A[j-1] > A[j]
      then exchange A[j-1]  A[j]
    swapped = true
  if (!swapped)
     break;


3. Create another method named optimizedBuubleSort in the same java class which implements 
optimized bubble sort algorithm given below.

Alg.: OPTIMIZED_BUBBLESORT(A)
n = A.length
do 
  swapped = false
  for i= 2 to n
    if A[i-1] > A[i]
      then exchange A[i-1]  A[i]
      swapped = true
      newLimit = i-1
   n = newLimit
while swapped
