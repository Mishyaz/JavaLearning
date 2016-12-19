//  однострочный комментарий

/*  многострочный комментарий
многострочный комментарий
 */

/**
 * javaDoc
 * особый комментарий
 */

package test1;

//рецепт, метод, функция, процедура, подпрограмма
public class Kitchen {
    //  psvm+tab
    public static void main(String[] args) {
        System.out.println("Main done.");
        cookBreakfast();
        cookSoup();
    }

    private static void cookSoup() {
        //  sout+tab
        //  CTRL+D копирование строки
        System.out.println("Boil water.");
        System.out.println("...");
        System.out.println("Done.");
    }

    private static void cookBreakfast() {
        System.out.println("Breakfast done.");
    }
}
