/**
 * @param {number[][]} intervals
 * @param {number[]} queries
 * @return {number[]}
 */
 var minInterval = function(intervals, queries) {
    let arrayResponse = queries.map(()=>-1);
    intervals.forEach(interval=>{
        const value = interval[1]-interval[0]+1;
        queries.forEach((query, index)=>{
            if (interval[0]<=query && interval[1]>=query && (arrayResponse[index]>value || (arrayResponse[index] === -1))){

                arrayResponse[index]=value;
            }

        });
    });
    return arrayResponse;
};

minInterval([[1,4],[2,4],[3,6],[4,4]], [2,3,4,5]);