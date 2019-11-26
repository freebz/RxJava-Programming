// 코드 7-13 구독할 때 onError 이벤트에서의 예외 처리 예(ExceptionHandling.java - onError())

String[] grades = {"70", "88", "$100", "93", "83"};

Observable<Integer> source = Observable.fromArray(grades)
  .map(data -> Integer.parseInt(data));

source.subscribe(
  data -> Log.i("Grade is " + data),
  e -> {
    if(e instanceof NumberFormatException) {
      e.printStackTrace();
    }
    Log.e("Wrong Data found!!");
  }
);
