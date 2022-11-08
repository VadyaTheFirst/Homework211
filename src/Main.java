public class Main {

    public static void humanCout(Human[] Humans) {

        for (byte i = 0; i < Humans.length; i++) {
            System.out.println("Привет! Меня зовут " + Humans[i].getName() + " Я из города " +
                    Humans[i].getTown() + " родился в " + Humans[i].getYearOfBirth() + " году." +
                    "Я работаю на должности " + Humans[i].getJobTitle() + ". Будем знакомы!");
        }
    }

    public static void main(String[] args) {//
        Human[] Humans = new Human[4];
        Humans[0] = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        Humans[1] = new Human("Аня", 1988, "Москва", "методист образовательных программ");
        Humans[2] = new Human("Катя", 1988, "Калининград", " продакт-менеджер");
        Humans[3] = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        humanCout(Humans);
    }
}
