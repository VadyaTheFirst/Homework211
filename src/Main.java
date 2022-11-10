public class Main {

    public static void humanCout(Human[] humans) {

        for (byte i = 0; i < humans.length; i++) {
            System.out.println("Привет! Меня зовут " + humans[i].getName() + " Я из города " +
                    humans[i].getTown() + " родился в " + humans[i].getYearOfBirth() + " году." +
                    "Я работаю на должности " + humans[i].getJobTitle() + ". Будем знакомы !");
        }
    }
    static final byte dlina=5;
    public static void main(String[] args) {
        Human[] humans = new Human[dlina];
        humans[0] = new Human("Максим", 1988, "Минск", "бренд-менеджер");
        humans[1] = new Human("Аня", 1988, "Москва", "методист образовательных программ");
        humans[2] = new Human("Катя", 1988, "Калининград", " продакт-менеджер");
        humans[3] = new Human("Артем", 1995, "Москва", "директор по развитию бизнеса");
        humans[4]=new Human("Владимир", 2090, "Казанть", "hhh");
        humanCout(humans);
        humans[4].setName(null);
        System.out.println(humans[4].getName());
    }
}
