package swordoffer;

import java.util.Objects;

/**
 * @description: 重写equals
 * @author：CatTail
 * @date: 2024/3/23
 * @Copyright: https://github.com/CatTailzz
 */
public class Person {
    private String name;
    private int age;

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Person person = (Person) obj;

        return age == person.age && Objects.equals(name, person.name);
    }
}
