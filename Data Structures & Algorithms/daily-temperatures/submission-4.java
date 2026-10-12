class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        // int i = 0;
        // int[] res = new int[temperatures.length];

        // for(i = 0; i < temperatures.length - 1; i++)
        // {
        //     int count = 1;
        //     for(int j = i + 1; j < temperatures.length; j++)
        //     {
        //         if(temperatures[i] < temperatures[j])
        //         {
        //             res[i] = count;
        //             break;
        //         }
        //         count++;
        //     }
        // }

        // return res;

        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            int t = temperatures[i];

            while(!stack.isEmpty() && t > stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i - pair[1];
            }
            stack.push(new int[]{t, i});
        }
        return res;
    }
}
