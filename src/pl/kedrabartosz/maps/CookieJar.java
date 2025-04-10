package pl.kedrabartosz.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CookieJar {
  private List<Cookie> cookies;

  public CookieJar(List<Cookie> cookies) {
    this.cookies = cookies;
  }

  public List<Cookie> getCookies() {
    List<Cookie> toBeReturned = new ArrayList<>();
    for (Cookie cookie : cookies) {
      toBeReturned.add(new Cookie(cookie.getColor(), cookie.getStuffing()));
    }
    return toBeReturned;
  }
}
