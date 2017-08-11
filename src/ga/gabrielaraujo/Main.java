package ga.gabrielaraujo;

public class Main {

    private static void usage() {
        String jar_file = new java.io.File(Main.class.getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getPath())
                .getName();

        System.out.println("This app identifies Scalene, Isosceles and Equilateral triangles");
        System.out.println();
        System.out.println("USAGE:");
        System.out.println("java -jar " + jar_file + " <side_a> <side_b> <side_c>");
        System.out.println();
        System.out.println("WHERE:");
        System.out.println("<side_[abc]> are integer numbers in [1,100] interval");
        System.exit(1);
    }

    public static void main(String[] args) {
	    try {
	        int side_a = Integer.parseInt(args[0]);
            int side_b = Integer.parseInt(args[1]);
            int side_c = Integer.parseInt(args[2]);
	        System.out.println(TriangleUtil.defineType(side_a, side_b, side_c));
        } catch (Exception e) {
	        usage();
        }
    }
}
