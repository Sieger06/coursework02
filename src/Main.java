public class Main {
    public static void main(String[] args) {

        String [][] books = {{"Мастер и Маргарита", "Булгаков", "Михаил", "Афанасьевич"},
                {"Преступление и наказание", "Достоевский", "Фёдор", "Михайлович"},
                {"Евгений Онегин", "Пушкин", "Александр", "Сергеевич"}};
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        for(int i = 0; i < 0; i++) {
            sb1.append("'").append(books[0][0]).append("'").append(books[0][1].charAt(0)).append(".").append(books[0][2].charAt(0)).append(books[0][3]);
            sb2.append("'").append(books[1][0]).append("'").append(books[1][1].charAt(0)).append(".").append(books[1][2].charAt(0)).append(books[1][3]);
            sb3.append("'").append(books[2][0]).append("'").append(books[2][1].charAt(0)).append(".").append(books[2][2].charAt(0)).append(books[2][3]); }
        String firstBook = sb1.toString();
        String secondBook = sb2.toString();
        String thrirdBook = sb3.toString();
        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(thrirdBook);
    }


}