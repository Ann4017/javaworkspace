

public class VariableTest {

  public static void main(String[] args) {
    // ����
    // ���� : Ÿ�� + ���� ��
    // ����, �Ǽ�, ����, ����
    // byte, char, short, int, long : ����
    // float, double : �Ǽ�
    // boolean : ����
    // ���� : int �⺻ Ÿ��
    // �Ǽ� : double �⺻ Ÿ��

    // int num; // ����
    // num = 123; // �ʱ�ȭ
    //
    // System.out.println(num);
    //
    // num = 321;
    // System.out.println(num);
    //
    // int x,y,z;
    // x = 1;
    // y = 2;
    // z = 3;
    // System.out.println(x+" "+y+" "+z);
    //
    // int a = 10, b = 20, c = 30;
    // System.out.println(a+b+c);
    //
    // boolean tf = false; // or true
    // System.out.println(tf);
    //
    // byte by = 12;
    // System.out.println(by);
    //
    // char ch = 'a';
    // System.out.println(ch);
    //
    // short sh = 312;
    // System.out.println(sh);
    //
    // long lo = 2222222222222222222L; // or l
    // System.out.println(lo);
    //
    // float fl = -3.142f; // or F �������� ���� �� ���������� �ν���
    // System.out.println(fl);
    //
    // double db = 3.14; // or d, D
    // System.out.println(db);
    //
    // char cha = 'a';
    // String st1 = "bc";
    // System.out.println(cha+""+st1);


    String s_cow = "�ѿ�", s_pish = "��ġ", s_max = "�ƽ���";
    int i_cow_price = 112500, i_pish_price = 25500, i_max_price = 500;
    System.out.println("ǰ��:" + s_cow + ",  ����:" + i_cow_price + "��");
    System.out.println("ǰ��:" + s_pish + ",  ����:" + i_pish_price + "��");
    System.out.println("ǰ��:" + s_max + ",  ����:" + i_max_price + "��");

    // ���Ĺ��� : %d(����), %f(�Ǽ�), %c(����), %s(���ڿ�)

    System.out.printf("ǰ��: %-10s, ����: %8d \n", s_cow, i_cow_price);
    System.out.printf("ǰ��: %-10s, ����: %8d \n", s_pish, i_pish_price);
    System.out.printf("ǰ��: %-10s, ����: %8d \n", s_max, i_max_price);


  }

}
