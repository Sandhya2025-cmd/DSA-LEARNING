class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        c=0
        for num in arr:
            if(num%2!=0):
                if(c==2):
                     return True
                c+=1
            else:
                c=0
        return False
        