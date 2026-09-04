class Solution:
    def canThreePartsEqualSum(self, arr: List[int]) -> bool:
        sum,part=0,0
        for num in arr:
            sum+=num
        firstSum=sum//3
        c=0
        for num in arr:
            part+=num
            if(part==firstSum):
                part=0
                c+=1
        return c>=3 and sum%3==0

        