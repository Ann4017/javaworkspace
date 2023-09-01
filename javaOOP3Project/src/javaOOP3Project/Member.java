package javaOOP3Project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

// @Getter
// @Setter
// @NoArgsConstructor // �⺻ ������
@AllArgsConstructor // ����� �ʱ�ȭ
// @RequiredArgsConstructor // ���, NonNull �� �����ڷ� �ʱ�ȭ
@ToString
// @EqualsAndHashCode
// @Data // RequiredArgsConstructor, Getter, Setter, ToString, EqualsAndHashCode �� ��� ������
@Builder // ��� ������ �ʱ�ȭ
public class Member {

  private String id;
  private String pwd;
  @Builder.Default // Builder �� ����� �� ���� ��������� �־��� �� �� @Builder.Default �� ������� ������ �ʱⰪ���� ���´�.
  private int age = 10;
  private final String ADDR;

  @NonNull // �Ʒ� ������ null ������ ���� ���ϰ� �Ѵ�.
  private String hobby;
}
