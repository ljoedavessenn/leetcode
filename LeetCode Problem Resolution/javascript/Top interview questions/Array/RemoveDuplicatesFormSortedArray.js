/**
 * @param {number[]} nums
 * @return {number}
 */
 const removeDuplicates = nums => {
     let i=0;
     let dynamicLength=nums.length;
     let j;
     do{
         j=i+1;
         console.log("nums[i]", nums[i]);
         console.log("nums[j]", nums[j]);
         while (nums[i]===nums[j] && j<dynamicLength){
            nums.slice(j,1);
            dynamicLength=nums.length;
            j++;
         }
         i++;
     } while (i<dynamicLength-1);
     return dynamicLength;
};




// nums is passed in by reference. (i.e., without making a copy)
var nums=[1,1,1,2,3,3,4,4,4];
len = removeDuplicates(nums);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
for ( i = 0; i < len; i++) {
    console.log(nums[i]);
}