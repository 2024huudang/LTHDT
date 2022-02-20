import java.util.Scanner;

public class Program2 {
        public static Scanner scanner = new Scanner(System.in);
        public static int binarySearch(int arr[], int l, int r, int key){  
            if (r>=l){  
                int mid = l + (r - l)/2;  
                if (arr[mid] == key){  
                return mid;  
                }  
                if (arr[mid] > key){  
                return binarySearch(arr, l, mid-1, key);
                }else{  
                return binarySearch(arr, mid+1, r, key);
                }  
            }  
            return -1;  
        }  

        public static void main(String args[]){  
            System.out.println("Nhap so phan tu cua mang: ");
            int n = scanner.nextInt();
            int [] arr = new int [n];
            System.out.println("Nhap cac phan tu cua mang: ");
            for(int i = 0; i < n; i++){
                System.out.printf("a[%d] = ", i);
                arr[i] = scanner.nextInt();
            }
            System.out.println("Nhap cac phan tu tiem kiem: ");
            int key = scanner.nextInt();  
            int result = binarySearch(arr,0,n-1,key);  
            if (result == -1)  
                System.out.println("Khong tim thay phan tu");  
            else  
                System.out.println("Phan tu o vi tri: "+ result);  
        }  
    }  