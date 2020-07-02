package com.example.changedata.service;

import com.example.changedata.model.CertCjrz;

public interface CjrService {
    int saveCjrz(CertCjrz certCjrz);

    String queryAPICertData(String apiurl);
}
