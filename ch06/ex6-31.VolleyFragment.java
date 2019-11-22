// 코드 6-31 시간 정보 얻기 2(fragments/VolleyFragment.java - fromCallable())

private Observable<JSONObject> getObservableFromCallable() {
    retunr Observable.fromCallable(this::getData);
}
