class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var maxArea = 0
        
        while (left < right) {
            val currentHeight = minOf(height[left], height[right])
            val currentArea = currentHeight * (right - left)
            maxArea = maxOf(maxArea, currentArea)
            
            if (height[left] < height[right]) {
                left++
            } else {
                right--
            }
        }
        
        return maxArea
    }
}

fun main() {
    val solution = Solution()
    
    val heights1 = intArrayOf(1, 8, 6, 2, 5, 4, 8, 3, 7)
    println(solution.maxArea(heights1)) 

    val heights2 = intArrayOf(1, 1)
    println(solution.maxArea(heights2)) 
}
