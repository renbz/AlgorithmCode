package 每日一题_2023_11月

func main() {

}
func minDeletion(nums []int) int {
	n, ans := len(nums), 0
	for i := 0; i+2 < n+1; i = i + 2 {
		if nums[i] == nums[i+1] {
			ans++
			i--
		}
	}
	if (n-ans)%2 != 0 {
		ans++
	}
	return ans
}
