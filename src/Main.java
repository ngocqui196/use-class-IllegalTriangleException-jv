import java.util.Scanner;

public class Main {

    public static void trianger(int a,int b, int c) throws ArithmeticException,IndexOutOfBoundsException{

        if (a + b > c || b + c > a || c + a > b) {
            throw new IndexOutOfBoundsException();
        }

    }

    public static void negativeEdge(int num) throws NotTriagle{
        if(num<=0) throw new NotTriagle();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các cạnh tam giác.");
        try {
            System.out.println("Cạnh a:");
            int a = sc.nextInt();
            negativeEdge(a);
            System.out.println("Cạnh b:");
            int b = sc.nextInt();
            negativeEdge(b);
            System.out.println("Cạnh c:");
            int c = sc.nextInt();
            negativeEdge(c);
            System.out.println("Do la tam giac");
        }
        catch (NotTriagle e){
            System.out.println("Không nhận diện được số");
        }
        catch (ArithmeticException e) {
            System.out.println("Có 1 số cạnh nhỏ hơn 0");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Có một cạnh lớn hơn tổng hai cạnh còn lại");
        }
        catch (NumberFormatException e) {
            System.out.println("Không nhận diện được số");
        }
    }
}
