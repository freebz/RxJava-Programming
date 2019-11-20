// 코드 4-19 getShape() 메서드(common/Shape.java - getShape())

public static String getShape(String obj) {
    if (obj == null || obj.equals("")) return "NO-SHAPE";
    if (obj.endsWith("-H")) return "HEXAGON";
    if (obj.endsWith("-O")) return "OCTAGON";
    if (obj.endsWith("-R")) return "RECTANGLE";
    if (obj.endsWith("-T")) return "TRIANGLE";
    if (obj.endsWith("⋄")) return "DIAMOND";
    return "BALL";
}
