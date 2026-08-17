class Solution {
    public int lastStoneWeight(int[] stones) {

        if(stones.length == 1)
        {
            return stones[0];
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int stone : stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1){
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            int res = Math.abs(stone1 - stone2);
            if(res > 0){
                maxHeap.offer(res);
            }
        }

        return maxHeap.size() == 0 ? 0 : maxHeap.peek();
    }
}
