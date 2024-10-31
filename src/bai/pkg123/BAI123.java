
package infor.java;
import java.util.Scanner ;

public class InforJava {

   
    public static void main(String[] args) {
//        b1
        Scanner input = new Scanner (System.in) ;
        if (input.hasNext() || input.hasNextInt() ) {
                System.out.println("kí tự đã đúng  ");
                if (input.hasNextInt()) {
                    System.out.println("kí tự bạn đã nhập là số ");
                } 
                else  {
                    System.out.println("kí tự bạn đà nhập là chuỗi ");
        }
                System.out.print("Nhap ten : ");
                input.nextLine() ;
                String name = input.nextLine();
                System.out.print("Nhap tuoi : ");
                int age = input.nextInt() ;
                System.out.print("Nhap chuyen nganh : ");
                input.nextLine() ;
                String cn = input.nextLine() ;
                System.out.print("Nhap gpa : ");
                float gpa = input.nextFloat() ;
                System.out.print("Nhap que quan : ");
                input.nextLine() ;
                String qq = input.nextLine() ;
                System.out.println(" Ten:" + name + "\n tuoi :" + age + "\n chuyen nganh : " + cn + "\n que quan : " + qq + " \nGpa : " + gpa);
            }
        else {
            System.out.println("Hãy nhập từ bán phím một số nguyên hoặc là mốt kí tự !!! ");
        }
    }
}
