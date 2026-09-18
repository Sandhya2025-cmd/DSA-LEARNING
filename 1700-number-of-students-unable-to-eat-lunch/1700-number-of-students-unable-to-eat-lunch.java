class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int ones=0,zeros=0;
        for(int s : students){
            if(s==0) zeros++;
            else ones++;
        }
        for(int sandwich : sandwiches){
            if(sandwich == 0){
                if(zeros==0){ // if no student want a type0 sandwich
                    break;
                }
                zeros--;
            }else{
                if(ones==0){ // if no student want a type1 sandwich
                    break;
                }
                ones--;
            }
        }

        return zeros + ones;
    }
}