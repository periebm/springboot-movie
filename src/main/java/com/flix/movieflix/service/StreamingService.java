package com.flix.movieflix.service;

import com.flix.movieflix.entity.Category;
import com.flix.movieflix.entity.Streaming;
import com.flix.movieflix.repository.StreamingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StreamingService {
    private final StreamingRepository repository;

    public List<Streaming> findAll() {
        return repository.findAll();
    }

    public Optional<Streaming> findById(Long id) {
        return repository.findById(id);
    }


    public Streaming saveStreaming(Streaming streaming) {
        return repository.save(streaming);
    }


    public void deleteStreaming(Long id) {
        repository.deleteById(id);
    }

}
