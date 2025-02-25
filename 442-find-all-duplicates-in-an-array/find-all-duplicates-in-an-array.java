class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
          
                int target = arr[i] - 1;
                if (arr[i] != arr[target]) {
                    swap(arr, i, target);
                } else {
                i++;
            }
           
        }
         List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
               ans.add(arr[index]);
            }
        }
        return ans;

    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}