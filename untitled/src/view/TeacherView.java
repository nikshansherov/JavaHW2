package view;

import data.User;

import java.util.List;

public class TeacherView extends UserView {
    @Override
    protected User findTheBest(List<User> userList) {
        return null; // здесь должна быть логика нахождения лучшего преподавателя
    }
}
