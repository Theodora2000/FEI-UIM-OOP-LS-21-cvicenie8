package sk.stuba.uim.fei.oop;

import java.util.List;

public class IntefaceIndex extends Generic<Character,CharacterKey>{
    public List<CharacterKey> add(CharacterKey m){
        return this.put(m.getKey(), m);
    }

}
