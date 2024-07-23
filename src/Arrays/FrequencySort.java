package Arrays;

import java.util.ArrayList;
import java.util.List;
//1636. Sort Array by Increasing Frequency
public class FrequencySort {
	public static void main(String[] args) {
		int input[]= {1,1,2,2,2,3};
		int arr[] = frequencySort(input);
		for(int i=0;i<arr.length;i++)
			System.out.println("----"+arr[i]);
	}
	public static int[] frequencySort(int[] nums) {
        int[] cnt = new int[201];
        List<Integer> t = new ArrayList<>();
        for (int v : nums) {
            v += 100;
            ++cnt[v];
            t.add(v);
        }
        t.sort((a, b) -> cnt[a] == cnt[b] ? b - a : cnt[a] - cnt[b]);
        int[] ans = new int[nums.length];
        int i = 0;
        for (int v : t) {
            ans[i++] = v - 100;
        }
        return ans;
    }
}
