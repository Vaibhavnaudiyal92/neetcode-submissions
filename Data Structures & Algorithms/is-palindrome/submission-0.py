class Solution:
    def isPalindrome(self, s: str) -> bool:

        new_s = ""
        old_s = ""
        s = s.lower()
        for i in range(len(s)):
            if s[i].isalnum():
                new_s = s[i]+new_s
                old_s = old_s+s[i]

        print(new_s)
        if new_s == old_s:
            return True
        
        return False
        