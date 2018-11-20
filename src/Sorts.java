public class Sorts
{
    public static void ascendingSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int lowPosition = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[lowPosition])
                    lowPosition = j;

                swap(i,lowPosition,arr);
            }
        }
    }
    public static void ascendingSort(String[] arr)
    {

    }
    private static void swap(int indexA, int indexB, int[] arr)
    {
        int temp = arr[indexA];
        arr[indexB] = arr[indexA];
        arr[indexA] = temp;
    }
    public static void printArr(String[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
