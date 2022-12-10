package ee.projektPlus.quiz.database.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
@Entity(name="PLAYERS")
public class PlayerEntity {

    @GeneratedValue
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

    public PlayerEntity(String name) {
        this.name = name;
    }
}
