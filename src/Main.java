public class Main {
    public static void main(String[] args) {

        String [][] books = {{"Мастер и маргарита", "Булгаков", "Михаил", "Афанасьевич"},
                {"Преступление и наказание", "Достоевский", "Фёдор", "Михайлович"},
                {"Евгений Онегин", "Пушкин", "Александр", "Сергеевич"}};
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        StringBuilder builder3 = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            builder1.append("«").append(books[0][0]).append("» ").append(books[0][1].charAt(0)).append(".").append(books[0][2].charAt(0)).append(".").append(books[0][3]);
            builder2.append("«").append(books[1][0]).append("» ").append(books[1][1].charAt(0)).append(".").append(books[1][2].charAt(0)).append(".").append(books[1][3]);
            builder3.append("«").append(books[2][0]).append("» ").append(books[2][1].charAt(0)).append(".").append(books[2][2].charAt(0)).append(".").append(books[2][3]);
        }
        String firstString = builder1.toString();
        System.out.println(firstString);
        String secondString = builder2.toString();
        System.out.println(secondString);
        String thirdString = builder3.toString();
        System.out.println(thirdString);
    }


}