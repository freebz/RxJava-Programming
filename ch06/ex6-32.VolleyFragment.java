// 코드 6-32 시간 정보 얻기 3(fragments/VolleyFragment.java - fromFuture())

private Observable<JSONObject> getObservableFromFuture() {
    retunr Observable.fromFuture(getFuture());
}
