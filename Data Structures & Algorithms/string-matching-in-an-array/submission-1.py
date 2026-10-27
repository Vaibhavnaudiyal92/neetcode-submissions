class Solution:
    def stringMatching(self, words: List[str]) -> List[str]:
        output=set()
        for i in range(len(words)):

            wd = words[i]

            for j in range(len(words)):

                if i==j:
                    continue
                
                if wd in words[j]:
                    output.add(wd)
        
        return list(output)