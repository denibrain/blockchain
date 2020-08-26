class Employee {

    // write fields
    private String name;
    private String email;
    private int experience;

    // write constructor
    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    // write getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    // write fields
    private String mainLanguage;
    private String[] skills;

    // write constructor
    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    // write getters
    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    private boolean isPhd;
    private String[] methods;

    // write constructor
    DataAnalyst(String name, String email, int experience, boolean isPhd, String[] methods) {
        super(name, email, experience);
        this.isPhd = isPhd;
        this.methods = methods;
    }

    // write getters
    public boolean isPhd() {
        return isPhd;
    }

    public String[] getMethods() {
        return methods;
    }

}