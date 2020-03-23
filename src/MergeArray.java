public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {7,8,9};
        int newArrayLength = arr1.length + arr2.length;
        System.out.println("First Array: ");
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\nSecond Array: ");
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        int[] newArray = new int[newArrayLength];
        for (int i = 0; i < arr1.length; i++){
            newArray[i] = arr1[i];
        }
        int tempIndex = arr1.length;
        for (int i = 0; i < arr2.length; i++){
            newArray[tempIndex] = arr2[i];
            tempIndex++;
        }
        System.out.println("\nNew Array: ");
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }
    }
}
