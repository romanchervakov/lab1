 /**
 * Примеры использования класса-контейнера List
 */
public class Examples {
             public static void main(String[] args) {
                                     List<String> list = new List<>();

                                     System.out.println("\nДОБАВЛЕНИЕ В СПИСОК\n");
                                     System.out.println("Хаотично добавим элементы.");
                                     list.add("Папа"); // Добавление в конец
                                     list.top("Мама"); // Добавление в начало
                                     list.add("2022-й год");
                                     list.add("ШОКОЛАД");
                                     list.add(null);
                                     list.add("Do you believe in magic?");
                                     list.add("Chevrolet");
                                     list.top("собака");
                                     list.top("мороженое");
                                     list.top(null);
                                     System.out.println("\nСозданный список:");
                                     System.out.println("-----------------");
                                     list.print(); // Печать списка
                                     System.out.println("-----------------");

                                     System.out.println("\nИЗВЛЕЧЕНИЕ ИЗ СПИСКА\n");
                                     System.out.println("Извлечем первый и последний элемененты, а также словосочетание \"2022-й год\" и сохраним в отдельные переменные.\n");
                                     String first = list.pop_first();
                                     String last = list.pop_last();
                                     String s = list.extract("2022-й год");
                                     System.out.println("Измененный список:");
                                     System.out.println("-----------------");
                                     list.print();
                                     System.out.println("-----------------");
                                     System.out.println("\nСохраненные элементы:\n" + first + " (первый)\n" + last + " (последний)\n" + s);

                                     System.out.println("\nУДАЛЕНИЕ ИЗ СПИСКА\n");
                                     System.out.println("Удалим элементы \"ШОКОЛАД\", \"Кот\", \"собака\" и null.\n");
                                     list.remove("ШОКОЛАД");
                                     list.remove("Кот");
                                     list.remove("собака");
                                     list.remove(null);
                                     System.out.println("Измененный список:");
                                     System.out.println("-----------------");
                                     list.print();
                                     System.out.println("-----------------");
                                     System.out.println("\nИз списка удалились только те элементы, которые в нем присутствовали.\n");
             }
}
