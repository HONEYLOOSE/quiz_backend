package honeyloose.demo.entity;

import lombok.*;

import javax.persistence.*;

@Getter // getter 메소드 생성
@Builder // 빌더를 사용할 수 있게 함
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="champion") // 테이블 명을 작성
public class ChampionEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //MySQL의 AUTO_INCREMENT를 사용
    private Long id;

    @Column(length=31)
    private String name;

    @Column(length=11)
    private int lengthOfName;

    public ChampionEntity(String name)
    {
        this.name=name;
        this.lengthOfName=name.length();
    }
}
