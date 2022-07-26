package HIT_JAVA.Buoi3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số phần tử của mảng: ");
            n = sc.nextInt();
        } while (n < 0);

        int a[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = sc.nextInt();
        }
        System.out.print("Trung bình cộng các số lẻ ở vị trí chẵn= "+trungBinh(a,n));
        System.out.println();
        vitriMin(a,n);
        ktcp(a,n);
        Snt(a,n);
        Sapxep(a,n);
    }

    //hàm tính trung bình cộng

    public static float trungBinh(int a[], int n) {
        int dem = 0;
        float tong = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0 && i % 2 != 0)
                dem++;
            tong += a[i];
        }
        return tong / dem;
    }

    //hàm tìm vị trí Min

    public static void vitriMin(int a[], int n) {
        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i]<min) {
                min=a[i];
            }
        }
        System.out.print("Cac vi tri Min la: ");
        for(int i=0; i<n; i++) {
            if(a[i]==min)
            {
                System.out.print(i+1);
            }
        }
        System.out.println();
    }

    //hàm in số chính phương

    public static void ktcp(int a[], int n)
    {
        System.out.print("Cac so chinh phuong la: ");
        for(int i=0; i<n; i++)
        {
            if(Math.sqrt(a[i]) == (int)((Math.sqrt(a[i]))))
            {
                System.out.print(a[i] + "\t");
            }
        }
        System.out.println();
    }

    //hàm kiểm tra ngto

    public static boolean ktnt(int x) {
        if(x < 2)
            return false;
        else {
            int count = 0;
            for(int i = 2; i <= x/2; i++){
                if(x%i == 0) {
                    count++;
                }
            }
            if(count > 0)
                return false;
            else
                return true;
        }
    }

    //Hàm in số ngto

    public static void Snt(int a[], int n)
    {
        System.out.print("Các số nguyên tố là:");
        for(int i=0; i<n; i++)
            if(ktnt(a[i])==true) {
              System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    //Sắp xếp

    public static void Sapxep(int a[], int n)
    {
        int temp=a[0];
        System.out.print("Mảng sau khi sắp xếp là: ");
        for(int i=0; i<n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;

                }
            }
            System.out.print(a[i]+" ");
        }
    }
}



