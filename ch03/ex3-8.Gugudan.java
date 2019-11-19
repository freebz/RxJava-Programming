// 코드 3-8 flatMap() 함수를 활용한 코드 변환(Gugudan.java - reactiveV2())

Scanner in = new Scanner(System.in);
System.out.println("Gugudan Input:");
int dan = Integer.parseInt(in.nextLine());

Function<Integer,Observable<String>> gugudan = num ->  // 변수 이름이 num이다.
  Observable.range(1,9).map(row -> num + " * " + row + " = " + dan*row);
Observable<String> source = Observable.just(dan).flatMap(gugudan);
source.subscribe(System.out::println);
