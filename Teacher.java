package HWClass18;

public class Teacher {
    String name;
    int age;
    String subject;
    String schoolName;

    public Teacher(String name, int age, String subject, String schoolName) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.schoolName = schoolName;
    }

    public void teach() {
        System.out.println("Teaching " + subject);
    }

    public void grade() {
        System.out.println("Grading students");
    }

    public void works() {
        System.out.println("Working at school " + schoolName);
    }

    public void attend() {
        System.out.println("Attending meetings");
    }

    public static class MathTeacher extends Teacher {
        public MathTeacher(String name, int age, String subject, String schoolName) {
            super(name, age, subject, schoolName);
        }

        void solveProblem() {
            System.out.println("Solving math problems");
        }
        public static class ChemistryTeacher extends Teacher{
            public ChemistryTeacher(String name,int age, String subject,String schoolName){
                super(name,age,subject,schoolName);
            }
            public void conductExperiment() {
                System.out.println("Conducting chemistry experiments");
        }
        public static class PianoTeacher extends Teacher{
            public PianoTeacher(String name, int age,String subject,String schoolName){
                super(name,age,subject,schoolName);
            } public void playPiano() {
                System.out.println("Playing piano");
            }
            }

            public static void main(String[] args) {
                Teacher teacher=new Teacher("Brandon",47,"Biology","ABC");
                teacher.teach();
                teacher.grade();
                teacher.works();
                teacher.attend();

                MathTeacher mathTeacher=new MathTeacher("Yaya",45,"Math","ABC99");
                mathTeacher.teach();
                mathTeacher.grade();
                mathTeacher.works();
                mathTeacher.attend();
                mathTeacher.solveProblem();

                ChemistryTeacher chemistryTeacher=new ChemistryTeacher("Zoya",65,"Chemistry","ABC1");
                chemistryTeacher.teach();
                chemistryTeacher.grade();
                chemistryTeacher.works();
                chemistryTeacher.attend();
                chemistryTeacher.conductExperiment();

                PianoTeacher pianoTeacher=new PianoTeacher("Liza",27,"Piano","ABC89");
                pianoTeacher.teach();
                pianoTeacher.grade();
                pianoTeacher.works();
                pianoTeacher.attend();
                pianoTeacher.playPiano();

            }
        }
    }
}