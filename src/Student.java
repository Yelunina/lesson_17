
//#1 Создать класс Student со следующими полями
// (String firstName, String lastName, MyDate birthday, String group, MyDate startCourse}
// Создайте пару объектов этого класса. Напишите метод studentToString(Student student)
// который возвращает строку с данными студента.

    public class Student {
        String firstName;
        String lastName;
        MyDate birthday;
        String group;
        MyDate startCourse;



        public String toString(){
            return firstName + " "+lastName +"("+ birthday.toString()+")" + " group: " + group + " Course start: " + startCourse.toString();
        }

        public void  sayHello(){
            System.out.println("hello, I'm a student  " + firstName +" " + lastName );
        }





    }

