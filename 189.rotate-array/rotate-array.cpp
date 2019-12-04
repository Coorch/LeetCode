#include <iostream>
#include <vector>
using namespace std;


class Solution {
public:
	void rotate3(vector<int> &nums, int k) {
		int length = nums.size();
		k %= length;
		if (k != 0) {
			reverse(nums, 0, length - 1);
			reverse(nums, 0, k - 1);
			reverse(nums, k, length - 1);
		}
	}
	void reverse(vector<int> &nums, int start, int end) {
		while (start < end) {
			int a = nums[start];
			nums[start] = nums[end];
			nums[end] = a;
			start++;
			end--;
		}
	}
};



int main(){
	Solution solu;
	vector<int> nums;
	int size = 7;
	int k = 3;
	for (int i = 0; i < size;i++) {
		nums.push_back(i+1);
	}
	solu.rotate3(nums, k);
	for (int i = 0; i < nums.size();i++) {
		cout << nums[i];
	}
	cout << endl;
	return 0;
}