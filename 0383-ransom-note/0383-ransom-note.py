class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        freq1 = {}
        freq2 = {}

        for ch in ransomNote:
            freq1[ch] = freq1.get(ch, 0) + 1

        for ch in magazine:
            freq2[ch] = freq2.get(ch, 0) + 1

        for key in freq1:
            if key not in freq2:
                return False

            if freq1[key] > freq2[key]:
                return False
            
        return True
        

        