package com.trulioo.normalizedapi.auth;

import com.trulioo.normalizedapi.Pair;
import com.trulioo.normalizedapi.ApiException;

import java.net.URI;
import java.util.Map;
import java.util.List;


public class OAuth implements Authentication {
  private String accessToken;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  @Override
  public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams,
                            String payload, String method, URI uri) throws ApiException {
    if (accessToken != null) {
      headerParams.put("Authorization", "Bearer " + accessToken);
    }
  }
}
