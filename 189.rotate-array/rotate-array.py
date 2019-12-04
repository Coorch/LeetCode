class Solution:
    
    
    def reverse(self, nums, start, end) -> None:
        """
        reverse from nums[start] to nums[end]
        """

        while(start < end):
            a = nums[start]
            nums[start] = nums[end]
            nums[end] = a
            start += 1
            end -= 1
    

    def rotate(self, nums, k) -> None:
        """
        Do not return anything, modify nums in-place instead.
        nums: List[int]
        k: int
        """
        n = len(nums)
        k = k % n
        self.reverse(nums, 0, n - 1)
        self.reverse(nums, 0, k - 1)
        self.reverse(nums, k, n - 1)


solu = Solution()
nums = [1,2,3,4,5,6,7]
k = 1
solu.rotate(nums, k)
print(nums)