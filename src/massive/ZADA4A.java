package massive;
public class ZADA4A {
    public static void main(String[] args) {
        String word=new String("Алфавит");
        String letter=("а"+"б"+"в"+"г"+"д"+"е"+"ё"+"ж"+"з"+"и"+"й"+"к"+"л"+"м"+"н"+"о"+"п"+"р"+"с"+"т"+"у"+"ф"+"ц"+"ч"+"ш"+"щ"+"ъ"+"ы"+"ь"+"э"+"ю"+"я");
        String text="Съешь еще этих французских булок и галет "
        +"да выпей же чаю с молоком, "
        +"как и я.";
        String[]words=text.split("");
      System.out.printf("Букв в тексте = %d%n",words.length);
      for(String w:words){
          System.out.print(w+";");
      }
    System.out.println("\n----------");
    System.out.
      System.out.printf("Используем equalsIgnoreCase(%s,%s)=%s%n",
              word,words[0],word.equalsIgnoreCase(words[0]));
      System.out.printf("Используем compareTo(%s,%s)=%s%n",
              word,words[0],word.compareTo(words[0]));
      
}
}