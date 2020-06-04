abstract class Person {
    String firstName, lastName;
    int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public int getAge() {
        int age = 2020 - birthdayYear;

        return age;
    }

}
