package cn.xay.APIDemo;

import java.util.Objects;

public class Student {
    //成员变量
    private int id;
    private String name;
    private int score;
    //构造方法

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public Student() {
    }

    //成员方法

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    //toString()
    //  重写父类中的toString
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    //equal()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && score == student.score && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, score);
    }
}
