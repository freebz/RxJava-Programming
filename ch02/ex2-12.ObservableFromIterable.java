// 코드 2-12 fromIterable()에 BlockingQueue 사용(ObservableFromIterable.java - blockingQueueExample())

BlockingQueue orderQueue = new ArrayBlockingQueue<>(100);
orderQueue.add(new Order("ORD-1"));
orderQueue.add(new Order("ORD-2"));
orderQueue.add(new Order("ORD-3"));

Observable<Order> source = Observable.fromIterable(orderQueue);
source.subscribe(order -> System.out.println(order.getId()));
