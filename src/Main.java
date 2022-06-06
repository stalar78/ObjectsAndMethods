public class Main {

    public static void main(String[] args) {

        Basket petyaBasket = new Basket();
        petyaBasket.add("Хлеб", 60);
        petyaBasket.add("Спички", 15);
        petyaBasket.add("Открывашка", 170);

        Basket mashaBasket = new Basket();
        mashaBasket.add("Пакет", 5);
        mashaBasket.add("Марки", 250);
        mashaBasket.add("Клей", 170);

        Basket tolyaBasket = new Basket();
        tolyaBasket.add("Растворитель", 250);
        tolyaBasket.add("Журнал \"Огонек\" подписка 1970", 1380);


        System.out.println("Средняя стоимость каждой корзины: " + Basket.getAveragePriceEveryCount());
        System.out.println("Средняя цена товара во всех корзинах: " + Basket.getAveragePriceAllCount());
        System.out.println("Общее количество всех товаров: " + Basket.getTotalCount());

    }
}
