package myexception;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try{
            System.out.println(arr[10]);// ArrayIndexOutOfBoundsException
            System.out.println(2/0);// ArithmeticException（算数异常）
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");
    }
}
