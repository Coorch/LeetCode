package rotate_array;

public class Solution {
	
	
	public static void rotate2(int[] nums, int k) {
        /*
         * 第二种解法
         * 环状替换
        */
		k %= nums.length;
		int count = 0;
		int start = 0;
		
		do {
			int current = start;
			
			int prev = nums[start];
			do {
				int next = (current + k) % nums.length;
				int a = nums[next];
				nums[next] = prev;
				prev = a;
				current = next;
				count += 1;
			}while(current!=start);
			start += 1;
		}while(count < nums.length);
	}
	
	
	public static void rotate3(int[] nums, int k) {
        /*
         * 第三种解法
         * 三次反转
        */
		k %= nums.length;
		if(k!=0) {
			reverse(nums, 0, nums.length - 1);
			reverse(nums, 0, k - 1);
			reverse(nums, k, nums.length - 1);
		}
	}
	public static void reverse(int[] nums, int start, int end) {
        /* start: 开始索引
         * end: 结束索引
         * 反转函数
         * 在不开辟新的数组的条件下，将nums[start]~nums[end]之间的元素倒序
        */
		while(start < end) {
			int a = nums[start];
			nums[start] = nums[end];
			nums[end] = a;
			start++;
			end--;
		}
	}
	public static void main(String[] args) {
		int size = 7;
		int[] nums = new int[size];
		for(int i = 0; i < size; i++) {
			nums[i] = i + 1;
		}
		int k = 3;
		rotate2(nums, k);
		for(int i=0;i<size;i++) {
			System.out.println(nums[i]);
		}
	}
}