package model;

import java.util.List;

public class StudyGroupService implements CreateStudyGroup {


    @Override
    public StudyGroup createStudyGroup(List<User> listStudent, User teacher) {
        return new StudyGroup(listStudent, teacher);
    }
}
