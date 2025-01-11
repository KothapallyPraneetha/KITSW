import java.util.*;
class Binarysearch
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] a = new int[n];

    
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) 
		{
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search:");
        int target = sc.nextInt();
        int left = 0; 
        int right = n - 1; 

        boolean found = false; 

        while (left <= right) 
		{
            int mid = (left + right) / 2; 

            if (a[mid] == target) 
			{ 
                System.out.println("Element found at index: " + mid);
                found = true;
				int tar = sc.nextInt();
				tar=target*target;
                left = 0; 
                right = n - 1; 
                found = false; 
                while (left <= right) {
                   mid = (left + right) / 2; 
                   if (a[mid] == tar) 
			       { 
                       System.out.println("Element found at index: " + mid);
                       found = true;
                       break;
                   }
				   else if (a[mid] < tar) 
				   { 
                      left = mid + 1;
                   }
				   else 
				   { 
                       right = mid - 1;
                   }
                }
			}
		}
        if (!found) 
		{
            System.out.println("Element not found.");
        }
    }
}