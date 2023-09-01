package javaOOP3Project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.ToString;

// @Getter
// @Setter
// @NoArgsConstructor // 기본 생성자
@AllArgsConstructor // 모든멤버 초기화
// @RequiredArgsConstructor // 상수, NonNull 을 생성자로 초기화
@ToString
// @EqualsAndHashCode
// @Data // RequiredArgsConstructor, Getter, Setter, ToString, EqualsAndHashCode 를 모두 포함함
@Builder // 멤버 선택적 초기화
public class Member {

  private String id;
  private String pwd;
  @Builder.Default // Builder 를 사용할 때 값을 명시적으로 넣어줄 때 는 @Builder.Default 를 사용하지 않으면 초기값으로 나온다.
  private int age = 10;
  private final String ADDR;

  @NonNull // 아래 변수를 null 값으로 쓰지 못하게 한다.
  private String hobby;
}
