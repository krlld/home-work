package lesson14.task2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentList {
    private final List<Student> students;

    public StudentList(List<Student> students) {
        this.students = students;
    }

    public int countByMark(int mark) {
        int count = 0;
        for (Student student : students) {
            if (student.getMark() >= mark) {
                count++;
            }
        }
        return count;
    }

    public String groupWithMinStudentsCount() {
        Map<String, Integer> map = createStudentsMap();
        if (students.isEmpty()) {
            return "";
        }
        String group = students.get(0).getGroup();
        int minCount = map.get(students.get(0).getGroup());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < minCount) {
                group = entry.getKey();
                minCount = entry.getValue();
            }
        }
        return group;
    }

    private Map<String, Integer> createStudentsMap() {
        Map<String, Integer> map = new HashMap<>(students.size());
        for (Student student : students) {
            String group = student.getGroup();
            if (!map.containsKey(group)) {
                map.put(group, 0);
            }
            int count = map.get(group) + 1;
            map.put(group, count);
        }
        return map;
    }
}
