package model;

import java.util.List;

public abstract class AbstractStudyGroup {
    List<User> listStudent;
    User teacher;

    public AbstractStudyGroup(List<User> listStudent, User teacher) {
        this.listStudent = listStudent;
        this.teacher = teacher;
    }
}
