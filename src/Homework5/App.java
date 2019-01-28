package Homework5;

public class App {

    public static void main(String[] args) {

        Emploee[] emploeesAr = new Emploee[5];
        emploeesAr[0] = new Emploee("Джон Эддардович Сноу-Таргариен", "Король Севера", "sexybeard@gmail.com", "+79135667669", 30000, 22);
        emploeesAr[1] = new Emploee("Дейенерис Эйрисовна Таргариен", "Мать драконов", "stormbornqueen@yandex.ru", "+79233236379", 100000, 22);
        emploeesAr[2] = new Emploee("Серсея Тайвиновна Ланнистер", "Королева-Регент", "ilovemybrother@mail.ru", "+79992377345", 150000, 43);
        emploeesAr[3] = new Emploee("Джейме Тайвинович Ланнистер", "Ллорд-командующий Королевской Гвардией", "one-armedbandit@mail.ru", "+79995246352", 60000, 43);
        emploeesAr[4] = new Emploee("Бран Эддардович Старк", "Принц Севера", "three-eyedraven@yandex.ru", "+79132726782", 30000, 16);

        emploeeOver40(emploeesAr);
    }

    public static void emploeeOver40(Emploee empArr[]) {
        for (int i = 0; i < empArr.length; i++) {
            if (empArr[i].age > 40) empArr[i].getEmploeeInfo(empArr[i]);
        }
    }
}
