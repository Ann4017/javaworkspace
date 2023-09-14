import lombok.AllArgsConstructor;
import lombok.Data;

// lombok 적용
@Data
@AllArgsConstructor
public class Student {
  private String name;
  private String department;
  private String id;
  private double grade;

  // 생성자 추가



  // getter/setter 추가
}
