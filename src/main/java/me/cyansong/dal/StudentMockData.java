package me.cyansong.dal;

import me.cyansong.model.StudentMock;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class StudentMockData {
    private List<StudentMock> students;

    public StudentMockData() {
        students = new ArrayList<>();
        students.add(new StudentMock("001","007","1",100,250,10));
        students.add(new StudentMock("002","喜羊羊","2",88,122,88));
        students.add(new StudentMock("003","灰太狼","2",93,111,66));
        students.add(new StudentMock("004","蜡笔小新","3",66,100,55));
        students.add(new StudentMock("005","哆啦A梦","1",99,99,44));
    }

    public List<StudentMock> getStudents() {
        return students;
    }

    public static double getStudentScore(StudentMock studentMock, String courseName) throws NoSuchFieldException, IllegalAccessException {
            Field declaredField = studentMock.getClass().getDeclaredField(courseName.toLowerCase());
            declaredField.setAccessible(true);
            double score = (double) declaredField.get(studentMock);
            return score;
    }

}
