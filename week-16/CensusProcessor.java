public class CensusProcessor {
    public static Student[] parseCSV(String[] csvData) {
        Student[] students = new Student[csvData.length - 1];
        for (int i = 1; i < csvData.length; i++) {
            String[] fields = csvData[i].split(",");
            String name = fields.length > 0 ? fields[0].trim() : "";
            int age = 0;
            try {
                age = Integer.parseInt(fields[1].trim());
            } catch (Exception e) {
            }
            String school = fields.length > 2 ? fields[2].trim() : "";
            int grade = 0;
            try {
                grade = Integer.parseInt(fields[3].trim());
            } catch (Exception e) {
            }
            String cit = fields.length > 4 ? fields[4].trim() : "";
            String phone = fields.length > 5 ? fields[5].trim() : "";
            students[i - 1] = new Student(name, age, school, grade, cit, phone);
        }
        return students;
    }

}
