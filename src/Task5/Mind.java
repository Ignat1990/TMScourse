package Task5;

public class Mind {
    public static void main(String[] args) {
        String str = "Иван Алексеевич Бунин - выдающийся русский писатель и поэт," +
                " лауреат Нобелевской премии по литературе за 1933 год. " +
                "Его произведения пронизаны ностальгией и воспоминаниями о России." +
                " В своих рассказах и повестях он отразил гибель старого мира: " +
                "оскудение дворянских усадеб, упадок деревни и трагедию эмиграции.";
        String str2 = str.replaceAll(" ", "");// убираем пробел
        System.out.println(str2);
        String str3 = str2.replace("и", "!");// замена "и" на "!"
        String str4 = str3.replace('И', '!'); //замена "И" на "!"


        System.out.println(str4);
    }
}
