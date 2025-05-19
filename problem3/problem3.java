import java.util.Scanner;

class problem3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        int limit;
        if (a <=2) {
            limit = 1;
        } else if(a <= 4) {
            limit = 3;
        }
         else if(a <= 6) {
            limit = 5;
        }else {
            limit = a;
        }
        int num = 1;
        for(int i=0; i< limit;i++){
            System.out.print(num + " ");
            num+=2;
        }
        sc.close();
    }
}