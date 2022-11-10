public class Human {
   private Integer yearOfBirth;
   private String name;
   private String town;
   private String jobTitle;

    public Human(String name, Integer year, String town, String jobTitle) {
        if (name==null || name=="") {
        this.name="Информация не указана";
        } else{
            this.name = name;
        }
        if (town==null || town =="") {
            this.town = "Информация не указана";
        } else  {
            this.town=town;
        }

        if (jobTitle==null || jobTitle =="") {
            this.jobTitle = "Информация не указана";
        } else  {
            this.jobTitle=jobTitle;
        }

        if (year<0){
            this.yearOfBirth=0;
        } else {
            this.yearOfBirth = year;
        }


    }

    public void welcome(){
        System.out.println("Привет! Меня зовут " + name+" Я из города "+town+" Я родился в "+yearOfBirth+" году. Будем знакомы!");
    }

    public String getName(){
        return this.name;
    }

    public Integer getYearOfBirth(){
        return this.yearOfBirth;
    }

    public String getTown(){
        return this.town;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        if (yearOfBirth < 0 || yearOfBirth == null) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public void setName(String name) {
        if (name==null || name==""){
            this.name = "Информация не указана";
        } else {
            this.name=name;
        }
    }

    public void setTown(String town) {
        if (town == null || town=="") {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }

    public void setJobTitle(String jobTitle) {
        if (getJobTitle() == null) {
            this.jobTitle= "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }
}

