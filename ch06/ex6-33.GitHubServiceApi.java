// 코드 6-33 getCallContributors() 메서드(square/GitHubServiceApi.java - getCallContributors())

publici interface GitHubServiceApi {
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> getCallContributors(
	@Path("owner") String owner, @Path("repo") String repo);
    @GET("repos/{owner}/{repo}/contributors")
    Observable<List<Contributor>> getObContributors(
	@Path("owner") String owner, @Path("repo") String repo);
    @Headers({"Accept: application/vnd.github.v3.full+json"})
    @GET("repos/{owner}/{repo}/contributors")
    Call<List<Contributor>> getCallContributorsWithHeader(
	@Path("owner") String owner, @Path("repo") String repo);
}
