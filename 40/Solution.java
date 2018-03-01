public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || input.length < k) {
            return result;
        }
        for(int i=0;i<k;i++){
            int min=input[i];
            for(int j=i+1;j<input.length;j++){
                if(min>input[j]){
                    min=input[j];
                    swap(input,i,j);
                }
            }
            result.add(input[i]);
        }
        return result;
    }
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
