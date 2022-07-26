
package HIT_JAVA.Buoi3;

import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi a: ");
        String a = sc.nextLine();
        System.out.print("Chuỗi vừa nhập là: " + a);
        System.out.println();
        System.out.print(xoadaucachthua(a));
        a=xoadaucachthua(a);
        a=vietHoa(a);
        a=xoaSo(a);
        System.out.println("Chuỗi đã chuẩn hóa là: "+a);
    }

    public static String xoadaucachthua(String a) {
        return a.replaceAll("\\s+", " ").trim();
    }

    public static String vietHoa(String a)
    {
        a = a.toLowerCase();
        String a1[] = a.split(" ");
        a = "";
        for(int i=0; i < a1.length; i++)
        {
            a += a1[i].substring(0,1).toUpperCase() + a1[i].substring(1) + " ";
        }
        return a;
    }
    public static String xoaSo(String a)
    {
        return a.replaceAll("[0-9]","");
    }
}
