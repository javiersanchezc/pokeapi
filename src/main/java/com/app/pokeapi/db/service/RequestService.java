package com.app.pokeapi.db.service;


import com.app.pokeapi.db.entity.Request;
import com.app.pokeapi.db.repository.RequestRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;
    protected static Logger logger = LoggerFactory.getLogger(RequestService.class);

    public RequestService(RequestRepository requestRepository) {
        this.requestRepository = requestRepository;
    }

    public List<Request> list() {
        return requestRepository.findAll();
    }

    public void insertRequest(Request request) {
        this.requestRepository.save(request);
        logger.info("Save request: " + request);
    }
}
