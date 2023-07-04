import java.util.*;

public class Main
{
    static int executionCount;
    public static void main(String[] args)
    {
        int[] arr = randomInts();
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = randomInts();
        System.out.println(Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println(Arrays.toString(arr2));
        executionCount = 0;
        System.out.println(binarySearch(arr2, 0, 9, 8));
        System.out.println(executionCount); // binary search is more effective
        System.out.println(binarySearchIterative(arr2, 0, 9, 8));
        System.out.println(executionCount); /* Whenever the target isn't in the array,
                                             * recursive binary search does an extra execution
                                             */

        System.out.println();
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        randomIntsList(arrList);
        System.out.println(arrList);
        selectionSort(arrList);
        System.out.println(arrList);
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();
        randomIntsList(arrList2);
        System.out.println(arrList2);
        insertionSort(arrList2);
        System.out.println(arrList2);
        executionCount = 0;
        System.out.println(binarySearch(arrList2, 0, 9, 2));
        System.out.println(executionCount); //binary search is more effective
        System.out.println(binarySearchIterativeList(arrList2, 0, 9, 2));
        System.out.println(executionCount); /* Whenever the target isn't in the array list,
                                             * recursive binary search does an extra execution
                                             */
    }
    public static int[] randomInts() {
        int[] result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random()*10);
        }
        return result;
    }
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static void selectionSort(int[] arr)
    {
      executionCount = 1;
      for(int i = 0; i < arr.length - 1; i++)
      {
          int minIndex = i;
          for(int j = i + 1; j < arr.length; j++)
          {
            if(arr[j] < arr[minIndex])
            {
              minIndex = j;
            }
          }
          if(i != minIndex)
          {
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            executionCount++;
          }
      }
      System.out.println(executionCount);
    }
    public static void insertionSort(int[] arr)
    {
      executionCount = 1;
      for(int i = 1; i < arr.length; i++)
      {
        int temp = arr[i];
        int insertionIndex = i;
        while(insertionIndex > 0 && temp < arr[insertionIndex - 1])
        {
          arr[insertionIndex] = arr[insertionIndex - 1];
          insertionIndex--;
          executionCount++;
        }
        arr[insertionIndex] = temp;
      }
      System.out.println(executionCount);
    }
    public static int binarySearch(int[] arr, int left, int right, int x)
    {
      executionCount++;
      if (right >= left)
      {
        int mid = (left + right) / 2;
        if (arr[mid] == x)
        {
          return mid;
        }
        else if (arr[mid] > x)
        {
          return binarySearch(arr, left, mid - 1, x);
        }
        else
        {
          return binarySearch(arr, mid + 1, right, x);
        }
      }
      return -1;
    }
    

    public static void randomIntsList(ArrayList<Integer> arrList) {
      for (int i = 0; i < 10; i++) {
          arrList.add((int) (Math.random()*10));
      }
  }
  public static int linearSearchList(ArrayList<Integer> arrList, int num) {
      for (int i = 0; i < arrList.size(); i++) {
          if (arrList.get(i) == num) {
              return i;
          }
      }
      return -1;
  }
  public static void selectionSort(ArrayList<Integer> arrList)
  {
    executionCount = 1;
    for(int i = 0; i < arrList.size() - 1; i++)
    {
        int minIndex = i;
        for(int j = i + 1; j < arrList.size(); j++)
        {
          if(arrList.get(j) < arrList.get(minIndex))
          {
            minIndex = j;
          }
        }
        if(i != minIndex)
        {
          int temp = arrList.get(minIndex);
          arrList.set(minIndex, arrList.get(i));
          arrList.set(i, temp);
          executionCount++;
        }
    }
    System.out.println(executionCount);
  }
  public static void insertionSort(ArrayList<Integer> arrList)
  {
    executionCount = 1;
    for(int i = 1; i < arrList.size(); i++)
    {
      int temp = arrList.get(i);
      int insertionIndex = i;
      while(insertionIndex > 0 && temp < arrList.get(insertionIndex - 1))
      {
        arrList.set(insertionIndex, arrList.get(insertionIndex-1));
        insertionIndex--;
        executionCount++;
      }
      arrList.set(insertionIndex, temp);
    }
    System.out.println(executionCount);
  }
  public static int binarySearch(ArrayList<Integer> arrList, int left, int right, int x)
  {
    executionCount++;
    if (right >= left)
    {
      int mid = (left + right) / 2;
      if (arrList.get(mid) == x)
      {
        return mid;
      }
      else if (arrList.get(mid) > x)
      {
        return binarySearch(arrList, left, mid - 1, x);
      }
      else
      {
        return binarySearch(arrList, mid + 1, right, x);
      }
    }
    return -1;
  }
  public static int binarySearchIterative(int[] arr, int left, int right, int x) {
    executionCount = 0;
    while (left <= right)
    {
      executionCount++;
       int middle = (left + right) / 2;
       if (arr[middle] > x)
       {
          right = middle - 1;
       }
       else if (arr[middle] < x)
       {
          left = middle + 1;
       }
       else {
          return middle;
       }
     }
     return -1;
  }
  public static int binarySearchIterativeList(ArrayList<Integer> arr, int left, int right, int x) {
    executionCount = 0;
    while (left <= right)
    {
      executionCount++;
       int middle = (left + right) / 2;
       if (arr.get(middle) > x)
       {
          right = middle - 1;
       }
       else if (arr.get(middle) < x)
       {
          left = middle + 1;
       }
       else {
          return middle;
       }
     }
     return -1;
  }
}