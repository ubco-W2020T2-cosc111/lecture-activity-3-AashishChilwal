public class task2 {
    public static void main(String[] args) {
        final Object[][] table = new String[4][];
        table[0] = new String[] { "x", "x^1", "x^2" };
        table[1] = new String[] { "1", "1", "1" };
        table[2] = new String[] { "2", "32", "1024" };
        table[3] = new String[] { "3", "243", "5059" };
        
        for (final Object[] row : table) {
           System.out.format("%-15s%-15s%-15s%n", row);
        }        
      }
}
