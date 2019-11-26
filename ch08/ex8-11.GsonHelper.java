// 코드 8-11 GsonHelper.parseValue() 메서드(common/GsonHelper.java - parseValue())

public static String parseValue(String json, String key) {
    return new JsonParser().parse(json)
      .getAsJsonObject()
      .get(key)
      .getAsString();
}
