import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        int[] arr = randomInts();
        System.out.println(Arrays.toString(arr));
        System.out.println();
        sort(arr, 0, 999);
        System.out.println(Arrays.toString(arr));

        int randomSearch = (int) (Math.random()*1000);
        System.out.println("Number searched: " + randomSearch);
        System.out.println("Index: " + binarySearch(arr, 0, 999, randomSearch));
    }
    public static int[] randomInts() {
        int[] result = new int[1000];
        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * 1000);
        }
        return result;
    }
    public static void merge(int arr[], int l, int m, int r)
    {
      int n1 = m - l + 1;
      int n2 = r - m;
      int left[] = new int[n1];
      int right[] = new int[n2];
      for (int i = 0; i < n1; i++) {
          left[i] = arr[l+i];
      }
      for (int j = 0; j < n2; ++j) {
          right[j] = arr[m+1+j];
      }
      int i = 0, j = 0, k = l;
      while (i < n1 && j < n2)
      {
        if (left[i] <= right[j])
        {
          arr[k] = left[i];
          i++;
        }
        else
        {
          arr[k] = right[j];
          j++;
        }
        k++;
      }
      while (i < n1)
      {
        arr[k] = left[i];
        i++;
        k++;
      }
      while (j < n2)
      {
        arr[k] = right[j];
        j++;
        k++;
      }
    }
    public static void sort(int arr[], int l, int r)
    {
      if (l < r) {
        int m =(l + r)/2;
        sort(arr, l, m);
        sort(arr, m + 1, r);
        merge(arr, l, m, r);
      }
    }
    public static int binarySearch(int[] arr, int left, int right, int x)
    {
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
}
