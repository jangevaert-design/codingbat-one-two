public class oneTwo {
  public String oneTwo(String str) {
    StringBuilder result = new StringBuilder();

    if (str.length() < 3) {
      return "";
    }
    for (int i = 0; i < str.length() - 2; i += 3) {
      result.append(str.substring(i + 1, i + 3)).append(str.charAt(i));
    }
    return result.toString();
  }
}
