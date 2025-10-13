package e1_two_pointers.towards_each_other;

// У тебя есть массив height[], где каждый элемент — это высота вертикальной линии.
// Любые две линии и ось X образуют "контейнер", в который можно налить воду.
// Найди максимальное количество воды, которое можно удержать между двумя линиями
public class ContainerWithMostWater11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
