public class CensusProcessor {
    public static Student[] parseCSV(String[] csvData) {
        Student[] students = new Student[csvData.length - 1];
        for (int i = 1; i < csvData.length; i++) {
            String[] fields = csvData[i].split(",");
            String name = fields[0].trim();
            int age = Integer.parseInt(fields[1].trim());
            String school = fields[2].trim();
            int grade = Integer.parseInt(fields[3].trim());
            String cit = fields[4].trim();
            String phone = fields[5].trim();
            students[i - 1] = new Student(name, age, school,
                    grade, cit, phone);
        }
        return students;
    }
}
