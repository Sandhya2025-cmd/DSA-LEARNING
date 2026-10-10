class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n=distance.length;
        int clockwise=0,counter_clockwise=0;
        for(int i=start;i%n!=destination;i++){
            clockwise+=distance[i%n];
        }
        for(int i=destination;i%n!=start;i++){
            counter_clockwise+=distance[i%n];
        }
        return Math.min(clockwise,counter_clockwise);
    }
}