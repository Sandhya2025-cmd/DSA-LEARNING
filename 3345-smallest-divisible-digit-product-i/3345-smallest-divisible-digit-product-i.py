class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        while(1):
            num=n
            prod=1
            while(num!=0):
                prod*=num%10
                num//=10
            if prod%t==0:
                return n
            else:
                n+=1
        
         