// 코드 3-10 resultSelector를 사용하도록 변경한 flatMap() 함수(Gugudan.java - usingResultSelector())

Scanner in = new Scanner(System.in);
System.out.println("Gugudan Input:");
int dan = Integer.parseInt(in.nextLine());
Observable<String> source = Observable.just(dan)
  .flatMap(gugu -> Observable.range(1,9),
    (gugu, i) -> gugu + " * " + i + " = " + gugu*i);
source.subscribe(System.out::println);
in.close();
