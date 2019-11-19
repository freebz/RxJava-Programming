// 코드 3-7 for 문의 Observable 변환(Gugudan.java - reactiveV1())

Scanner in = new Scanner(System.in);
System.out.println("Gugudan Input:");
int dan = Integer.parseInt(in.nextLine());

Observable<Integer> source = Observable.range(1, 9);   // for 문을 Observable로 대체
source.subscribe(row -> System.out.println(dan + " * " + row + " = " + dan * row));
