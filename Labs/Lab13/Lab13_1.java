import java.util.ArrayList;

public class Lab13_1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    String text = "La Salle University (LSU) is a private institution that"
        + " was founded in 1863.\n"
        + "The campus is located in Philadelphia, Pennsylvania.\n"
        + "It has a total undergraduate enrollment of 2,746 (fall 2021) "
        + "and an endowment of $80 million (2020).\n";
    // you need to implement from here
    // first display text
    System.out.println("Text: " + text);
    // call method passing parameters of text and list
    extract(text, list);
    System.out.print("Extracted Words: ");
    // display each word in list using a loop
    for (String i : list) {
      System.out.print(i + " ");
    }
  }

  // The method for extracting the words and storing them into an ArrayList
  public static void extract(String str, ArrayList<String> list) {
    // you need to implement from here
    // we start the beginning of the str
    int idx = 0;
    // find the first openP and closedP
    int openP = str.indexOf("(", idx);
    int closedP = str.indexOf(")", idx);
    // continue if these fields are not -1
    while (openP != -1 || closedP != -1) {
      // extract the word
      String word = str.substring(openP + 1, closedP);
      // add it to the list
      list.add(word);
      // redeclare the idx based on closedP's index
      idx = closedP + 1;
      // find the new idx for openP and closedP
      openP = str.indexOf("(", idx);
      closedP = str.indexOf(")", idx);
    }
  }
}
