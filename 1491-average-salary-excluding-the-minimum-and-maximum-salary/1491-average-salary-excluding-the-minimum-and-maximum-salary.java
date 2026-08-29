class Solution {
    public double average(int[] salary) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        int sum=0;
       for(int i=0;i<salary.length;i++){
        if(salary[i]<min){
            min=salary[i];
        }if(salary[i]>max){
            max=salary[i];
        }
       }
       for(int i=0;i<salary.length;i++){
        sum+=salary[i];
       } 
       sum-=(max+min);
       return (double) sum/(salary.length-2);
    }
}