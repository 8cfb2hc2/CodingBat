/*
	Given an array of ints length 3, return the sum of all the elements.
	sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7

*/

public int sum3(int[] nums) {
  
  int x = 0;
  for(int i : nums) x += i;
  
  return x;
  

  
}


/*
 with java 8 using streams
 
 return Arrays.stream(nums).sum();
*/