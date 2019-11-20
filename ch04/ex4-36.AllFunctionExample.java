// 코드 4-36 all() 함수의 활용 예(conditional/AllFunctionExample.java - marbleDiagram())

String[] data = {"1", "2", "3", "4"};

Single<Boolean> source = Observable.fromArray(data)
  .map(Shape::getShape)
  .all(Shape.BALL::equals);
  //.all(val -> Shape.BALL.equals(Shape.getShape(val)));
source.subscribe(Log::i);
