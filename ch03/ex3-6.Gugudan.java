// 코드 3-6 일반적인 자바 코드로 작성한 구구단(Gugudan.java - plainJava())

Scanner in = new Scanner(System.in);
System.out.println("Gugudan Input:");
int dan = Integer.parseInt(in.nextLine());
for (int row = 1; row <= 9; ++row) {
    System.out.println(dan + " * " + row + " = " + dan * row);
}
