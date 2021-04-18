package sk.stuba.uim.fei.oop;
import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Message implements CharacterKey {
    private String content;

    @Override
    public Character getKey() {
        return this.getContent().charAt(0);
    }
}
