package hero_profile;

import java.util.ArrayList;

import javax.persistence.*;

@Entity
@Table (name = "hero_name")
public class hero_profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "hero_name")
    private String name;


    private int age;

    public hero_profile() {
    }

    public hero_profile(String name, int age) {
        this.name = name;
        this.age = age;

      public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }







}
