package model;

import java.util.List;

public interface CreateStudyGroup {
    StudyGroup createStudyGroup(List<User> listStudent, User teacher);
}
