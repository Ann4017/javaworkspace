import java.util.Arrays;

public class FunctionTest {

  public static void main(String[] args) {

    Function f = new Function();
    //
    // f.add(); // �޼ҵ� ȣ��
    // f.add2(4, 5);
    // int sum = f.add3(6, 2);
    // int sum1 = f.sub(6, 2);
    // int sum2 = f.mul(6, 2);
    // double sum3 = f.div(7, 2);
    // System.out.println(sum);
    // System.out.println(sum1);
    // System.out.println(sum2);
    // System.out.println(sum3);
    //
    // f.func(10);
    //
    // float div2 = f.div2(10, 0);
    // System.out.println(div2);
    //
    // if (div2 == 0.0f) {
    // System.out.println("error");
    // }
    //
    //
    //
    // Function2 f2 = new Function2();
    //
    // f2.mathod1(); // ȣ���ϴ� �޼ҵ带 ���� �ϰ� �ִ� ��ġ ã�� Ctrl + left click
    //
    //
    // int x = 1;
    // int y = 2;
    //
    // System.out.println("�޼ҵ� ȣ�� ��");
    // System.out.println(x + " ," + y);
    //
    // f.defultArg(x, y);
    //
    // System.out.println("�޼ҵ� ȣ�� ��");
    // System.out.println(x + " ," + y);


    // �������� ���� �ν��Ͻ� ������ �����Ѵ�.
    int[] arr = {1, 2, 3, 4, 5};

    System.out.println("ȣ�� ��");
    System.out.println(Arrays.toString(arr));

    f.refArg(arr);

    System.out.println("ȣ�� ��");
    System.out.println(Arrays.toString(arr));


  }

}
