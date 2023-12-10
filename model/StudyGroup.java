package model;

import java.util.List;

public class StudyGroup extends AbstractStudyGroup {
    public StudyGroup(List<User> listStudent, User teacher) {
        super(listStudent, teacher);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "listStudent=" + listStudent +
                ", teacher=" + teacher +
                '}';
    }
}
