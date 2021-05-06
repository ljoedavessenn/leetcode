/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function (nums) {
    mainLoop:
    for (i = 0; i < nums.length; i++) {
        if (i == nums.length - 1) {
            return nums[i];
        } else {
            for (j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] === nums[j]) {
                        continue mainLoop;
                    } else if (j == nums.length - 1) {
                        return nums[i];
                    }
                }

            }
        }

    }
    return null;
};

singleNumber([2, 2, 1]);