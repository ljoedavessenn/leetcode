/**
 * @param {number[][]} intervals
 * @param {number[]} queries
 * @return {number[]}
 */
 var minInterval = function(intervals, queries) {
    let intervalValue;
    return queries.map(query=>{
        intervalValue=-1;
        intervals.forEach(interval=>{
            if (interval[0]<=query && interval[1]>=query && (intervalValue>(interval[1]-interval[0]+1) || (intervalValue === -1))){
                intervalValue=interval[1]-interval[0]+1;
            }
        });
        return intervalValue;
    });
};

minInterval([[1,4],[2,4],[3,6],[4,4]], [2,3,4,5]);