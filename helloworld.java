package package1;

import java.util.Scanner;

public class helloworld {
    public static void main(String[] args){
        System.out.println("helloworld");
        Scanner in = new Scanner(System.in);
//        System.out.println("echo:" + in.nextLine());
        int price;
        int amount;
        System.out.print("请输入票面：");
        amount = in.nextInt();
        System.out.print("请输入金额： ");
        price = in.nextInt();

        System.out.println(amount+"-"+ price+"="+(amount-price));

    }

}
